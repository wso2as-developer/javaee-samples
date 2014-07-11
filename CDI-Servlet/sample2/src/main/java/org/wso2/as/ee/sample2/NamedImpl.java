package org.wso2.as.ee.sample2;

import javax.inject.Named;

@Named("NamedImplementation")
public class NamedImpl implements Greeter {
    @Override
    public String greet() {
        return "Hi, this is the named implementation";
    }
}
