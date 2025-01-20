package de.he.segallus.dao;

import java.util.List;

import de.he.segallus.entity.InvoicePositionGroup;
import de.he.segallus.util.EntityManagerUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Fetch;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

public class InvoicePositionRepository {

    private final EntityManager entityManager = EntityManagerUtil.getInstance();

    public List<InvoicePositionGroup> hibernateTestCall() {

        entityManager.getTransaction().begin();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<InvoicePositionGroup> query = cb.createQuery(InvoicePositionGroup.class);
        Root<InvoicePositionGroup> root = query.from(InvoicePositionGroup.class);

        Fetch<Object, Object> invoicePositionFetch = root.fetch("invoicePositions", JoinType.LEFT);

        // a single fetch does not throw the AssertionError
        invoicePositionFetch.fetch("invoicePositionDetails", JoinType.LEFT);
        invoicePositionFetch.fetch("invoicePositionTaxes", JoinType.LEFT);

        query.select(root);
        TypedQuery<InvoicePositionGroup> tc = entityManager.createQuery(query);
        return tc.getResultList();
    }

}
