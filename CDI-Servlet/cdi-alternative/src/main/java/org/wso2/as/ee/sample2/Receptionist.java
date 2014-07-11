package org.wso2.as.ee.sample2;

import javax.enterprise.inject.Alternative;

@Alternative
public class Receptionist implements Greeter {
    public String greet() {
        return "Hi, Good morning";
    }
}
