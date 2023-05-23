////class R2 {
////   int width;
////   int height;
////   double area;
////
////   R2() {
////   }
////
////   R2(int w, int h) {
////      width = w;
////      height = h;
////      make(); // make 매서드 호출 R2 ~ make(); 생성자//
////   }
////
////   void make() {
////      area = width * height;
////   }
////
////   void print() {
////      System.out.println("사각형의 면적은" + area + "입니다");
////   }
////}
////
////class C {
////	int radius; 
////	
////	C(){
////	}
////	
////	C(int radius){
////	}
////
////}
////
//
//
//////import static 
////java.lang.Math.PI;
//
//
//
//class R2{
//	int width;
//	int height;
//	int area;
//
//	// 생성자 #1 : 기본 생성자 (하는 게 없어도 생성자) 
//	R2(){
//
//	}
//	R2(int w) {
//		width = w;
//		height = w;
//		make();
//	}
//	R2(int w, int h) {
//		// 생성자 #2 리턴 타입이 없고, 클래스 이름과 같음
//		width = w;
//		height = h;
//		make();
//
//	}
//	//메서드 
//	void make() {
//		area = width * height;
//	}
//	void print() {
//		System.out.println("가로" + width + ", 세로" + height + "인 면적은" + area + "입니다");
//	}
//}
//
//class C{
//	int radius;
//	double area;
//
//	//기본 생성자
//	C(){
//
//	}
//
//	//C c2 = new C(6);반지름이 6인 원객체를 생성한다
//	//c2.print(); "반지름이 6인 원의 면적은 xx.xxx입니다" 출력된다 
//	C(int r) {
//		radius = r;
//		make();
//	}
//
//	void make() {
//		area = 3.14 * radius * radius;
//	}
//	void print() {
//		System.out.println("반지름이 " + radius + "인 원의 면적은" + area + "입니다");
//	}
//}
//
//내가 만든거 실행 안됨 
//class Employee{
//	int empNo;
//	String empName; 
//	int salary; 
//	
//	Employee(int no, String name, int sal){
//		empNo=no;
//		empName=name;
//		salary=sal; 
//		print();
//	}
//	   
//	void print() {
//		System.out.println("사번:"+ empNo + "사원명:" +empName+ "기본금:"+salary);	
//	}
//}
//
//
//class Employee{
//	String empNo;
//	String empName;
//	int salary=0;
//	Employee(){
//
//	}
//	Employee(String empNo, String empName, int salary){
//		this.empNo= empNo;
//		this.empName=empName;
//		this.salary= salary;
//	}
//	Employee(String empNo,String empName){
//		this.empNo=empNo;
//		this.empName=empName;
//	}
//	void print() {
//		System.out.println("사번 : "+empNo+" 사원명 : "+empName+" 기본급 : "+ salary);
//	}
//
//	public class ConstructorTest {
//		public static void main(String[] args) {
//
//			R2 r = new R2(); 
//			r.width = 3; // 가로
//			r.height = 4; // 세로
//			r.make();// 면적을 계산하는 절차
//			r.print(); // "가로3, 세로4인 사각형의 면적은 12.0입니다"출력
//
//			R2 r1 = new R2();
//			r1.width = 5;
//			r1.height = 5;
//			r1.make();
//			r1.print(); // "가로5, 세로5인 사각형의 면적은 25.0입니다"출력된다
//
//			R2 r2 = new R2(6, 7); // 사용자입장에서 코드를 줄이는 방법
//			r2.print(); // "가로6, 세로7인 사각형의 면적은 42.0입니다"출력된다
//			// 생성자 : 사용자입장에서 간단하게 객체를 생성하고, 객체 내용을 초기화 할 수 있기에 사용
//			//생성자는 return 타입이 없으면서 class와 이름이 같다 
//
//			C c1 = new C(); //원객체를 생성한다
//			c1.radius = 5; 
//			c1.make(); //원의 면적을 계산한다
//			c1.print(); //"반지름이 5인 원의 면적은 xx.xxx입니다" 출력된다 
//
//			C c2 = new C(6); //반지름이 6인 원객체를 생성한다
//			c2.print(); //"반지름이 6인 원의 면적은 xx.xxx입니다" 출력된다 
//
//			R2 r3 = new R2(8); // 가로8, 세로8인 사각형 객체
//			r3.print(); // "가로 8, 세로 8인 사각형의 면적은 64.입니다" 출력된다 
//
//			Employee e1= new Employee();
//			e1.empNo = "2301";
//			e1.empName = "오문정";
//			e1.salary = 10000;
//
//			Employee e2 = new Employee("2302","홍길동",10000);
//			Employee e3 = new Employee("2303","나자바");
//
//			e1.print(); //"사번:2301, 사원명: 오문정, 기본급 : 10000
//			e2.print(); //"사번:2302, 사원명: 홍길동, 기본급 : 10000
//			e3.print(); //"사번:2303, 사원명: 나자바, 기본급 : 0
//		}
//	}
//}
///*
// * 생성자는 특수메서드이다.(객체가 생성될 때 자동 호출되는 특수 메서드.)
//
//직접 호출은 안되고 객체가 생성될 때만 자동 호출된다. 
//
//생성자는 클래스 이름하고 이름이 같고, 일반 메서드와 다르게 리턴 타입이 없다. 
//
//소스코드에 생성자가 없을 때 디폴트 생성자가 만들어진다. (아무때나 디폴트 생성자가 만들어지는 게 아님) 
// */
//
// 강사님 코드 
//class C{
//	int radius;
//	double area;
//	C(){
//		
//	}
//	C(int r){
//		radius = r;
//		make();
//	}
//	void make() {
//		area = radius * radius * 3.14;
//	}
//	void print() {
//		System.out.println("반지름이 "+radius+"인 원의 면적은 "+ area +"입니다");
//	}
//}
//class R2{
//	int width;
//	int height;
//	double area;
//	R2(){
//		
//	}
//	R2(int size){
//		width = size;
//		height = size;
//		make();
//	}
//	R2(int w, int h){
//		width = w;
//		height = h;
//		make();
//	}
//	void make() {
//		area = width * height;
//	}
//	void print() {
//		System.out.println("사각형의 면적은" + area+"입니다");
//	}
//}
//public class ConstructorTest {
//	public static void main(String[] args) {
//		R2 r = new R2();
//		r.width = 3;//가로
//		r.height = 4;//세로
//		r.make(); //면적을 계산한다
//		r.print(); //"가로3, 세로4인 사각형의 면적은 12.0입니다"출력된다
//		
//		R2 r1 = new R2();
//		r1.width = 5;
//		r1.height = 5;
//		r1.make();
//		r1.print();//"가로5, 세로5인 사각형의 면적은 25.0입니다"출력된다
//		
//		R2 r2 = new R2(6, 7);
//		r2.print(); //"가로6, 세로7인 사각형의 면적은 42.0입니다"출력된다
//		
//		C c1 = new C(); //원객체를 생성한다
//		c1.radius = 5;
//		c1.make(); //원의 면적을 계산한다
//		c1.print(); //"반지름이 5인 원의 면적은 xx.xxx입니다"출력된다
//		
//		C c2 = new C(6); //반지름이 6인 원객체를 생성한다
//		c2.print(); //"반지름이 6인 원의 면적은 xx.xxx입니다"출력된다
//		
//		R2 r3 = new R2(8); //가로8, 세로8인 사각형객체
//		r3.print();//"가로8, 세로8인 사각형의 면적은 64.0입니다"출력된다
//		
//		
//	}
//}
//
//
//

//생성자 = class 이름과 같아야한다. 
class R2{
   int width;
   int height;
   double area;
   R2(){ //생성자를 명시하지않으면 default라고 자동으로 생성자가 생성된다.
      
   }
   R2(int size){ //인자값이 한개일때의 생성자도 만들어야한다.
      width=size;
      height=size;
      make();
   }
   R2(int w, int h){
      width = w;
      height = h;
      make();
   }   
   void make(){
      area = width*height;
      }
   void print() {
      System.out.println("사각형의 면적"+area+"입니다.");         
   }
}
class C{
   int radius;
   double area; //도형의 고유한 특성, 지역변수가 아닌 멤버변수로 선언해야한다.
   C(){
      
   }
   C(int r){
      radius = r;
      make();
   }
   void make() {
      area= radius*radius* Math.PI;      
   }
   void print() {
   System.out.println("반지름이 "+radius+"인 우너의 면적은"+area+"입니다.");
   }
}

class Employee{

   String empNo;
   String empName;
   int salary=0;
   Employee(){
		/**
		 * 객체생성시 사번과 이름을 초기화 한다
		 * @param no 사번
		 * @param name 이름
		 * 
		 *
		 */
   }
   Employee(String empNo, String empName, int salary){
      this.empNo= empNo;
      this.empName=empName;
      this.salary= salary;
   }
   Employee(String empNo,String empName){
      this.empNo=empNo;
      this.empName=empName;
   }
   void print() {
      System.out.println("사번 : "+empNo+" 사원명 : "+empName+" 기본급 : "+ salary);
   }
}
public class ConstructorTest {
   public static void main(String[] args) {
      R2 r = new R2();
      r.width = 3;//가로
      r.height = 4;//세로
      r.make(); //면적을 게산한다.
      r.print(); //"가로3, 세로4인 사각형의 면적은 12.0입니다"출력된다.
      
      R2 r1= new R2();
      r1.width = 5;
      r1.height = 5;
      r1.make();
      r1.print(); //"가로5, 세로5인 사각형의 면적은 25.0입니다" 출력된다.
      
      R2 r2 = new R2(6,7); //생성자(특수 메소드) 자동 호출부분, 객체 생성하면서 객체를 초기화
//      r2.width = 6;
//      r2.height = 7;
//      r2.make();
      r2.print(); //"가로6, 세로7인 사각형의 면적은 42.0입니다" 출력된다.
      
      R2 r3 = new R2(8);
      r3.print(); //"가로8, 세로8인 사각형의 면적은 64.0입니다"출력된다.
      
      C c1= new C(); //원객체를 생성한다.
      c1.radius = 5;
      c1.make(); //원의 면적을 계산한다.
      c1.print(); //"반지름이 5인 원의 면적은 xx.xxx입니다" 출력된다.
      
      C c2 = new C(6); //반지름이 6인 원객체를 생성한다.
      c2.print();//"반지름이 6인 원의 면적은 xx.xxx입니다" 출력된다.
      
      Employee e1= new Employee();
      e1.empNo = "2301";
      e1.empName = "오문정";
      e1.salary = 10000;
      
      Employee e2 = new Employee("2302","홍길동",10000);
      Employee e3 = new Employee("2303","나자바");
      
      e1.print(); //"사번:2301, 사원명: 오문정, 기본급 : 10000
      e2.print(); //"사번:2302, 사원명: 홍길동, 기본급 : 10000
      e3.print(); //"사번:2303, 사원명: 나자바, 기본급 : 0
      
      
   }
}
