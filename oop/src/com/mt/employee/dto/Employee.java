package com.mt.employee.dto;

import com.my.dto.Person;

public class Employee extends Person {
	private String No;
	private int salary;

	public Employee() {
	}

	public Employee(String no, String name) {
		super();
		No = no;
		setName(name);
	}

	public Employee(String no, String name, int salary) {
		super();
		this.No = no;
		setName(name);
		this.salary = salary;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
