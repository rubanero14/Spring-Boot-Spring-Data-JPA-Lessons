package com.raj.springweb_lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringwebLesson1Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringwebLesson1Application.class, args);

//		MyComponent myComponent = ctx.getBean("myFirstBean", MyComponent.class);
//		myComponent.print("System online...");
//		myComponent.print(myComponent.greet("Ruban Raj", "Main Applicationfile"));
		FirstService firstService = ctx.getBean(FirstService.class);
		firstService.greetThePerson("Sri Baby");
	}


}
