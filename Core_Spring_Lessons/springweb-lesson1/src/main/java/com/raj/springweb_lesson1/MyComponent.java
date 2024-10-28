package com.raj.springweb_lesson1;

// Marking a class as Spring Bean using @Component, @Repository or @Service
// @Component
// @Repository
// @Service
public class MyComponent {
    private String myName;

    public MyComponent(String myName) {
        this.myName = myName;
    }

    public void print(String str) {
        System.out.println(str);
    }
    public String greet(String name) {
        return "Good day, " + name + " from MyComponent class done by " + myName + ".";
    }
}
