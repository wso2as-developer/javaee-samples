package org.wso2.as.ee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OrderManagerServlet", urlPatterns = "/order")
public class OrderManagerServlet extends HttpServlet {

    private OrderManager orderManager;
    private Object conn;

    public void init() throws ServletException {
        conn = getServletContext().getAttribute("connection");
        orderManager = new OrderManager();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameter("placeOrder") != null) {
            String item = request.getParameter("item");
            int quantity = Integer.parseInt(request.getParameter("quantity"));

            orderManager.addOrder(item, quantity);
            request.setAttribute("orders", orderManager.getOrders());
            request.getRequestDispatcher("/WEB-INF/orderList.jsp").forward(request, response);
        } else if (request.getParameter("viewOrder") != null) {
            request.setAttribute("orders", orderManager.getOrders());
            request.getRequestDispatcher("/WEB-INF/orderList.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("anotherOrder") != null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    public void destroy() {
        orderManager.closeConnections();
    }
}
