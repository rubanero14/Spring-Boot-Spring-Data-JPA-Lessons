package com.raj.springweb_lesson1;

import org.springframework.stereotype.Service;

// Marking this bean/class as service
@Service
public class FirstService {
    // Injecting MyComponent Bean into this bean
    private MyComponent myComponent;

    public String greetThePerson(String name) {
        return myComponent.greet(name, "First Service");
    }
}
