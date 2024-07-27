package com.boot.sbean;

import org.springframework.stereotype.Component;

@Component("python")

public class PythonMaterial implements CourseMaterial {

	@Override
	public String subject() {
		// TODO Auto-generated method stub
		return "Hey! You are choose Python ";
	}
}
