package com.boot.sbean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMassageGenerater {
	@Autowired
	private LocalDateTime date;
	
	//b method
	public String showWishMessage(String user) {
		int hour = date.getHour();
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
