package org.wso2.as.ee.sample2;


import javax.enterprise.inject.Alternative;

@Alternative
public class LiftOperator implements Greeter {
    @Override
    public String greet() {
        return "Have a good day, Bye!";
    }

}
