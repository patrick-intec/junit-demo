package be.infernalwhale;

import be.infernalwhale.model.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityTest {
    static EntityManagerFactory emf;

    @BeforeAll
    static void setupEMF() {
        emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        // Add records to table
    }

    @BeforeEach
    void init() {
        emf = Persistence.createEntityManagerFactory("datasource");


    }

    @Test
    void testDBConnection() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
    }

    @Test
    void testDBSaveEntity() {
        EntityManager em = emf.createEntityManager();

        // try to read data
    }
}
