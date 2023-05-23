class A {
	int i; //non-static 변수 | instance 변수 (객체지향프로그램에서는 인스턴스와 객체라는 용어를 같이 봄)
	static int si; //static변수 | class 변수 (static 변수는 메서드 영역에 기억된다, static변수는 객체와 무관한 변수이다) 
	void m() {//non-static 메서드, 객체 생성 후에만 사용할 수 있는 메서드 
		i++;
		si++;//(A.si도 됨, 근데 클래스 내에 있어서 생략해서 사용함)
	}
	static void sm() { //static 메서드, 객체생성과 무관하게 사용할 수 있는 메서드 
		//인스턴스 변수, 메서드 모두 사용 안됨! i++; m(); 
		//i++; 는 this.t++;와 같음 (현재 사용중인 객체 없기때문에 this 사용 못함) 
		si++; //(A.SI도 됨. 근데 클래스 내에 있는 메서드여서 생략 사용 가능) 
	}
}
public class StaticTest {
	public static void main(String[] args) {
		A.si++; 
		System.out.println(A.si);
		
		A a1, a2;
		a1 = new A(); //0
		a2 = new A(); //0
		a1.i++; //1
		a2.i++; //1
		
		a1.si++; // 힙영역에 객체가 없으니 메서드영역으로 가서 A클래스에 si를 찾아야 됨. 돌아돌아 가지 말고 A.si++ 로 하는 것이 더 낫다. 
		a2.si++;
		
		System.out.println(a1.i); //1 non-static 변수 | instance 변수 객체별로 갖고있음 
		System.out.println(a2.i); //1
		
		System.out.println(a1.si); //3 static변수 | class 변수 메서드영역에 미리 탑재되어 있음. 객체들 사이의 공유변수로 사용됨 
		System.out.println(a2.si); //3 
	
		a1.m();
		System.out.println(a1.i); //2
		System.out.println(a2.i); //1
		
		System.out.println(A.si); //4
		
	//	a1.sm(); A.sm() 메서드 호출 방법 후자가 더 나음 
		A.sm();
		
	}

}
