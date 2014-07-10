package org.wso2.as.ee.sample3;


@Departure
public class LiftOperator implements Greeter {
    @Override
    public String greet() {
        return "Have a good day, Bye!";
    }

}
