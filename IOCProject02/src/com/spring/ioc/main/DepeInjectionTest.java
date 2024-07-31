package com.spring.ioc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.config.AppConfig;
import com.spring.ioc.sbean.SeasonChecker;

public class DepeInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		SeasonChecker generator = ctx.getBean("sc", SeasonChecker.class);

		String resultMsg = generator.seasonCheck();
		System.out.println("Hey! Praful This is a"+resultMsg);

		ctx.close();
	}

}
