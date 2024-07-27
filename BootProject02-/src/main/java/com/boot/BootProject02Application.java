package com.boot;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.sbean.WishMassageGenerater;

@SpringBootApplication
public class BootProject02Application {
	@Bean(name="ldt")
	public LocalDateTime createLDT() {
		return LocalDateTime.now();
	}


	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProject02Application.class, args);
		
		WishMassageGenerater generate = ctx.getBean("wmg",WishMassageGenerater.class);
		
		String res = generate.showWishMessage("Praful");
		
		System.out.println(res);
	}

}
