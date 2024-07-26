package com.spring.ioc.sbean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMassageGenerator {
	@Autowired
	private LocalDateTime dateTime;// Has-A Reletion

	public String showWishMessage(String user) {
		int hour = dateTime.getHour();
		if (hour < 12)
			return "Good Morning " + user;
		else if (hour < 16)
			return "Good AfterNoon " + user;
		else if (hour < 20)
			return "Good Evening " + user;
		else
			return "Good Night " + user;
	}

}
