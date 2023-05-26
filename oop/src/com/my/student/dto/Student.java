package com.my.student.dto;

import com.my.dto.Person;

public class Student extends Person {
	private String no;

	public Student() {
		super(); // 부모영역의 생성자
	}

	public Student(String no, String name) {
		super();
		this.no = no;
		setName(name);
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void print() {
		System.out.println("학번: " + no + ", 이름:" + super.getName());
	}
}
