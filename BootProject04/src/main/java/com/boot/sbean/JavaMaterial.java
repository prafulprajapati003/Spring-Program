package com.boot.sbean;

import org.springframework.stereotype.Component;

@Component("java")
//@Primary
public class JavaMaterial implements CourseMaterial {

	@Override
	public String subject() {
		// TODO Auto-generated method stub
		return "Hey! You are choose Java ";
	}
}
