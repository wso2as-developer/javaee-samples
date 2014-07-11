package org.wso2.as.ee.sample5;


@Log
public class Receptionist implements Greeter {

    @Override
    public void greet() {
        System.out.println("Inside greet method");
    }
}
