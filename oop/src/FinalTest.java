class F{
	final int i=10; // final int i; 오류이유: 초기값이 없어서 final 할 수 없음
	static final int SI = 10; //상수임. final+static 으로 선언된 
	//final static 이 둘은 위치 바뀌어도 상관 없음 

}
public class FinalTest {

	public static void main(String[] args) {
		F f = new F();
		System.out.println(f.i);
		//f.i++; final 변수는 값을 변경할 수 없기 때문에 오류 발생 final변수는 값 변경 불가 
		
		final int lv; 
		lv = 10; // 초기화, 값이 대입된 후에는 변경이 불가하다 
		// lv++; final 변수는 값변경 불가  
	
		System.out.println(F.SI);
		//F.SI++; 는 안됨. 위처럼 고정된 값을 활용은 가능하지만 값을 변경하는 행위가 안됨
		//Static이기 때문에 클래스명 (.) 으로 사용 
		// =======상수 (클래스 이름 점으로 시작하고 값을 변경할 수 없는) 
		//상수는 주로 대문자로 만들고 이어지는 단어는 _를 활용 
		
	}


}
