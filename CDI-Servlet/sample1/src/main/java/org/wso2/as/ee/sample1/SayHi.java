package org.wso2.as.ee.sample1;

public class SayHi implements Greet {
    @Override
    public String greet() {
        return "Hi, this is CDI-Servlet sample is WSO2 Application Server";
    }
}
