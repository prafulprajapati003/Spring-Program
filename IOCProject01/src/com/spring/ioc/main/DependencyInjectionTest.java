package com.spring.ioc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.config.AppConfig;
import com.spring.ioc.sbean.WishMassageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WishMassageGenerator generator = ctx.getBean("wmg", WishMassageGenerator.class);
		/**WishMassageGenerator generator1 = ctx.getBean("wmg", WishMassageGenerator.class);
		System.out.println("generator = "+generator.hashCode()+"\ngenerator1 = "+generator1.hashCode());
		**/

		String resultMsg = generator.showWishMessage("Praful");
		System.out.println(resultMsg);

		ctx.close();
	}

}
