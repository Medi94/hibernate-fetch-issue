package de.he.segallus.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "invoice_position_group")
public class InvoicePositionGroup implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="invoice_position_group_id")
    private Long invoicePositionGroupId;

    @Column(name = "group_id", nullable = false)
    private Long groupId;

    @OneToMany(cascade= CascadeType.ALL, fetch= FetchType.LAZY)
    @JoinColumn(name="invoice_position_group_id")
    private Set<InvoicePosition> invoicePositions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_invoice_position_group")
    private InvoicePositionGroup invoicePositionGroup;
}
