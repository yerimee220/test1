class Shape {
	double area;

	void make() {
	}

	void print() {
		System.out.println("면적은" + area + "입니다");
	}

	public String toString() {
		return "도형의 면적:" + area;
	}

}

class Circle extends Shape {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	void make() {
		area = Math.pow(radius, 2) * Math.PI;
	}
//      public void make(){
//         area = radius*radius*3.14;
//         }

	public void print() {
		System.out.println("반지름이" + radius + "인 원의");
		super.print();
	}

	public String toString() {
		return "원" + super.toString();
	}
}

class Rectangle extends Shape {
	int width;
	int height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	void make() {
		area = width * height;
	}

//      public void make() {
//         area = width * height;
//      }
	public void print() {
		System.out.println("가로" + width + ", 세로" + height + "인 사각형의 ");
		super.print();
	}
}

class Triangle {
	int base;
	int height;
	double area;

	Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public void make() {
		area = base * height / 2;
	}

	void print() {
		System.out.println("밑변" + base + ", 높이" + height + "인 삼각형의 넒이는" + area + "입니다");
	}
}

public class OverrideTest {
	public static void test(Shape s) {
		s.make();
		s.print();
		System.out.println(s);// s.toString() 메서드 호출됨
								// Circle@XXXX
								// Rectangle@XXXX
								// 도형의 면적:~
								// 도형의 면적:~
	}

	public static void main(String[] args) {
		Circle c;
		Rectangle r;
		Triangle t;
		c = new Circle(5);// 반지름이 5인 원객체
//      c.make();
//      c.print();
		test(c);
		r = new Rectangle(3, 4);
//      r.make();
//      r.print();
		test(r);
		t = new Triangle(5, 6);
		t.make();
		t.print();

	}

}