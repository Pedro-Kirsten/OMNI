package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    private final static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OmniGITPU");

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
