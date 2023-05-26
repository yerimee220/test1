//자바빈의 조건에 만족하는 class 

package com.my.customer.dto;

public class Customer {
	private String id; // 멤버변수는 외부에 노출되지 않도록 Private으로
	private String pwd;
	private String name;
	private boolean flag; // 결혼여부

	public void setId(String id) {// setter 메서드
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPwd() {
		this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}

	public void setName() {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean isFlag() {
		return flag;
	}
}
