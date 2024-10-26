package com.raj.springweb_lesson1;

import org.springframework.stereotype.*;

// Marking a class as Spring Bean using @Component, @Repository or @Service
@Component
// @Repository
// @Service
public class MyComponent {
    public void print(String str) {
        System.out.println(str);
    }
    public String greet(String name) {
        return "Good day, " + name + " from MyComponent class!";
    }
}
