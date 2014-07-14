package org.wso2.as.ee;

import javax.persistence.*;
import java.util.List;

public class OrderManager {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    EntityTransaction entityTransaction;

    public OrderManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpaSample");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    public void addOrder(String item, int quantity) {
        entityTransaction.begin();
        Order order = new Order(item, quantity);
        entityManager.persist(order);
        entityTransaction.commit();
    }

    public List<Order> getOrders() {
        Query query = entityManager.createQuery("SELECT o FROM ORDERS o");
        List<Order> results = query.getResultList();
        return results;
    }

    public void deleteOrder(Order order) {
        entityTransaction.begin();
        entityManager.remove(order);
        entityTransaction.commit();
    }

    public Order findOrder(int id) {
        return entityManager.find(Order.class, id);
    }

    public void closeConnections() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
