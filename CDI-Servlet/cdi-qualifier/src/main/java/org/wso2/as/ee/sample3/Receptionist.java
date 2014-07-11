package org.wso2.as.ee.sample3;

@Entrance
public class Receptionist implements Greeter {
    public String greet() {
        return "Hi, Good morning";
    }
}


