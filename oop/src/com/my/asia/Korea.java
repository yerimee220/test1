package com.my.asia;

public class Korea {
	//누구나(같은 패키지, 다른 패키지 상관없이) 사용할 수 있는 class (public class)
	public String capital; 
	String language; 
	private int population; 
	
	public Korea() {
		capital = "서울";
		language = "한국어";
		population = 5174;
	}
	
	public void print() {
		System.out.println("인구:"+ population);
	}
	
	/**
	 * 인구증가
	 */
	public void up() {
		population++;
	}
	/**
	 * 인구감소 
	 */
	public void down() {
		if (population ==1) {
			System.out.println("인구는 0이상이어야합니다");
			return;
		}
		population--; 
	}
}
