package com.my.product.dto;

public class Product {
	private String prodNo; // 상품번호
	private String prodName; // 상품이름
	private int prodPrice; // 상품가격

	public Product() {
	}
	/*
	 * 설명 public Product() 기본생성자, 클래스의 객체를 생성할 때 호출되는 메서드. 이 생성자를 만드는 이유 (1) 객체 생성 :
	 * 기본 생성자를 제공함으로써 클래스의 객체를 생성할 때 사용할 수 있습니다. 예를 들어, 'product' 클래스의 인스턴스를 생성하고자 할
	 * 때 'new Product()'와 같이 호출할 수 있습니다 (2) 기본 초기화 : 기본 생성자는 필드를 초기화하는 역할을 할 수 있습니다.
	 * 만약 다른 생성자들이 매개변수를 받아 필드를 초기화한다면, 기본 생성자를 통해 필드를 기본값으로 초기화 할 수 있습니다. (3) 상속 기본
	 * 생성자는 상속과 관련하여 중요합니다. 자식 클래스가 부모 클래스를 상속 받을 때, 자식 클래스의 생성자에서 명시적으로 부모 클래스의 특정
	 * 생성자를 호출해야 합니다. 이때, 부모 클래스가 기본 생성자를 갖고 있다면 자식 클래스에서는 기본 생성자를 호출해야 합니다. 그렇지 않으면
	 * 컴파일러 오류가 발생합니다. (+) 이 클래스에서는 매개변수를 받는 생성자도 정의되어 있으므로, 기본 생성자가 따로 필요하지는 않을 수도
	 * 있다. 하지만 명시적으로 기본 생성자를 정의해두면 다른 개발자가 클래스를 사용할 때 편의성을 제공하고, 상속시에도 문제가 없도록 해준다.
	 */

	public Product(String prodNo, String prodName, int prodPrice) {
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	/*
	 * 설명 public Product(){} 은 생성자 (String prodNo, String prodName, int prodPrice)은
	 * 매개변수 this.prodNo 는 현재객체, 즉 Product 클래스의 멤버변수 = prodNo 는 매개변수를 가리킴
	 */

	public String getProdNo() {
		return prodNo;
	}
	/*
	 * 설명 getProdNo라는 이름의 메소드. prodNo 값을 리턴해줌 (예시) product이라는 객체가 있을 때,
	 * product.getProdNo()를 호출하면 해당 객체의 prodNo값이 반환되어 사용자가 이 값을 가져올 수 있게 됩니다. 이를 통해
	 * prodNo값을 클래스 외부에서 읽을 수 있습니다.
	 */
	/*
	 * 설명 (getter / setter) getter와 setter은 객체 지향 프로그래밍에서 사용되는 메서드로, 클래스의 private
	 * 멤버변수에 접근하고 값을 가져오거나 설정하기 위해 사용됩니다. getter와 setter의 사용 이유 (1) 캡슐화 getter와
	 * setter를 사용하여 멤버변수에 접근할 수 있도록 제어할 수 있다. 멤버변수를 private으로 선언하고, getter와 setter를
	 * 통해 간접적으로 접근하면서 데이터의 접근을 제어할 수 있다. 이를 통해 데이터의 무결성을 유지하고, 잘못된 값의 할당을 방지할 수 있다.
	 * (2) 데이터 은닉 getter와 setter을 통해 멤버 변수에 대한 접근을 제어함으로써, 클래스 외부에서 직접적으로 멤버변수에 접근하지
	 * 못하도록 합니다. 이는 객체의 내부 구현을 숨기고 외부에 공개할 필요가 있는 메서드를 제공함으로써 정보 은닉을 실현하는데 도움을 준다.
	 * (3) 유효성 검사 setter 메서드를 사용하여 데이터를 설정할 때 유효성 검사를 수행할 수 있다. setter 내에서 특정조건을
	 * 확인하고, 잘못된 값이 전달었을 경우 예외를 발생시키거나, 알맞은 방식으로 처리할 수 있다. 이를 통해 잘못된 값의 할당을 방지하고
	 * 안정성을 높일 수 있다 (4) 코드 일관성 유지 getter와 setter를 사용하여 멤버변수의 값을 읽고 수정할 수 있는 일관된 방법을
	 * 제공한다. 이는 클래스를 사용하는 다른 코드에서도 일관성있는 접근방식을 유지하고, 코드의 가독성을 향상시킨다. (5) 외부 인터페이스 제공
	 * getter와 setter를 사용하여 클래스 외부에서 객체의 속성에 접근할 수 있는 인터페이스를 제공할 수있다. 이를 통해 개게의 데이터를
	 * 안전하게 읽고 수정할 수 있으며, 객체간의 상호작용이 원활해진다.
	 */

	public void setProdNo(String prodNo) {
		if (prodNo.charAt(0) == 'S' || prodNo.length() > 10) {
			System.out.println("상품번호가 잘못되었습니다");
			return;
		}
		this.prodNo = prodNo;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public void print() {
		System.out.println("상품번호:" + prodNo);
		System.out.println("상품명:" + prodName);
		System.out.println("가격:" + prodPrice);
	}

}