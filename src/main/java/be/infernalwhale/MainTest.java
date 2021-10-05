package be.infernalwhale;

import be.infernalwhale.model.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();


        Car entityA = new Car();
        em.getTransaction().begin();
        em.persist(entityA);
        em.getTransaction().commit();
    }
}
