package org.wso2.as.ee;

import java.util.List;

public interface OrderManager {
    public void addOrder(String item, int quantity);

    public List<Order> getOrders();

    public void deleteOrder(Order order);

    public Order findOrder(int id);

}
