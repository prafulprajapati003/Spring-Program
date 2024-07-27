package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.sbean.Student;

@SpringBootApplication
public class BootProject04Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProject04Application.class, args);
		
		Student s = ctx.getBean("student",Student.class);
		
		System.out.println(s.prepare());
	}

}
