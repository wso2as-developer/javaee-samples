// @Interceptor

package org.wso2.as.ee.sample6;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/sample6")
public class HelloServlet extends javax.servlet.http.HttpServlet {

    @Inject
    private Greeter greeter;

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Hi, please check the console for interceptor messages");
        greeter.greet();
        writer.close();
    }
}
