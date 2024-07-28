package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.boot.sbean.Flipkart;

@SpringBootApplication
public class BootProject03Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProject03Application.class, args);
		
		Flipkart f = ctx.getBean("flipkart",Flipkart.class);
		
		String res = f.shopping(new  String[] {"shirt","trouser","hat"},
		    		                                                     new Double[] { 2000.0,4000.0,2000.0});
		System.out.println(res);
	}

}
