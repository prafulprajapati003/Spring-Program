package com.boot.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Autowired
	@Qualifier("java")
	CourseMaterial courseMaterial;
	
	public String prepare() {
		
		String sub= courseMaterial.subject();
		
		return sub+"Best Of Luck For Your Course";
	}
	
	

}
