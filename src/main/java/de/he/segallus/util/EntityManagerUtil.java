package de.he.segallus.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {

    private static final EntityManager INSTANCE = getEntityManager();
    private static EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("hibernate_fetch_issue")
                .createEntityManager();
    }

    public static EntityManager getInstance() {
        return INSTANCE;
    }
}
