package com.spring.ioc.sbean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sc")
public class SeasonChecker {
	
	@Autowired
	private LocalDateTime dateTime;// Has-A Reletion

	public String seasonCheck() {
		int month = dateTime.getMonthValue();
		if (month >11||month<3)
			return " Winter Season ";
		else if (month>2||month<7)
			return " Summer Season ";
		else if (month >6||month<11)
			return "Rainy Season ";
		return "Invalid Month";
		
	}

}
