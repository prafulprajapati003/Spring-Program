package com.boot.sbean;

import org.springframework.stereotype.Component;

@Component("dotnet")
public class DotNetMaterial implements CourseMaterial {

	@Override
	public String subject() {
		// TODO Auto-generated method stub
		return "Hey! You are choose DotNet ";
	}

}
