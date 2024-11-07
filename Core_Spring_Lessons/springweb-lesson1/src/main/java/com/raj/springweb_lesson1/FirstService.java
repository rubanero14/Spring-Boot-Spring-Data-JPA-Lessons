package com.raj.springweb_lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Marking this bean/class as service
@Service
public class FirstService {
    // Injecting MyComponent Bean into this bean
    private final MyComponent myComponent;

    @Autowired
    public FirstService(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public void greetThePerson(String name) {
        myComponent.greet(name, "First Service");
    }
}
