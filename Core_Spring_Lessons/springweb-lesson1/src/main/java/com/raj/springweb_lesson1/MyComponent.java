package com.raj.springweb_lesson1;

import org.springframework.stereotype.Component;

// Marking a class as Spring Bean
@Component
public class MyComponent {
    public void print(String str) {
        System.out.println(str);
    }
    public String greet(String name) {
        return "Good day, " + name + " from MyComponent class!";
    }
}
