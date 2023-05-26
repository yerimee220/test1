public class Operator {
	public static void main(String[] args) {
		int a,b,c;
		
		
		//산술연산자 + - * / %
		
		a=3;
		b=5;
		c=a+b;
				
		System.out.println(c); //8
		System.out.println(a-b); //-2
		System.out.println(a/b); //0
		System.out.println(b/a); //1 
		System.out.println(a%b); //3
		System.out.println(b%a); //2
	
		System.out.println(a+b*c);//43 *연산우선처리 
		System.out.println(a+b-c);//0 연산우선순위가 같은 경우에는 왼쪽에서 오른쪽으로 연산처리
		//System.out.println(a/0); //정수를 0으로 나눈 경우 > ArithmeticException 예외발생. 프로그램이 자동 종료됨. 
		
		short sa, sb, sc;
		sa=3;
		sb=5;
		sc=(short)(sa+sb); //sa,sb 값이 int로 자동형변환 
			      //short타입인 sc에 대입되려면 sa+sb 결과가 short타입으로 강제형변환 필요
					
		System.out.println(sc);
			
		//비교연산자 > < >= <= == != 
		//비교연산의 결과값: true or false
		a=3;
		b=5;
		System.out.println(a>b); // false 
		System.out.println(a<b); // true
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		
		
		//대입연산자 = += -= *= /= %=
		
		a=3;
		a+=1; //a값에 1증가하여 다시 a에 대입 즉, a=a+1;과 같음
		System.out.println(a); //4
	
		a-=2; //a값에 2감소하여 다시 a에 대입 즉, a=a-2;와 같음
		System.out.println(a); //2
		
		a*=3; 
		System.out.println(a); //6 
		
		a%=5;
		System.out.println(a); //1
		
		//단항(증감,증가,감소)연산자 ++ -- 
		a=3;
		a++;
		System.out.println(a);//4
		
		a--;
		System.out.println(a);//3
		
		byte by; //최소값 -128 ~ 127 최대값
		by=127;
		by=(byte)(by+1); 
		System.out.println(by); //-128 (최대값 127에서 최소값 -128로 넘어감) 

		by=127;
		by+=1;
		System.out.println(by); //-128 
		
		by=127;
		by++;
		System.out.println(by); //-128
		
		//삼항연산자 ? : 
		a=3;
		String result = a%2==0?"짝수":"홀수";//변수의 값이 짝수인 지 비교하는 식
		System.out.println(result);//홀수 //연산자 우선순위 공부하기 
		
		//논리연산자 & | && || ! 
		//& "이고" | "이거나"
		a=3;
		b=5;
		System.out.println(a<b & a%2==1); //true 연산 순서 (1) a%2(산술연산) (2)a<b (비교연산) (왼쪽에 있는 것부터) true (3)& (4) == true
		System.out.println(a>b & a%2==1); //false
		System.out.println(a>b & a%2==0); //false
		System.out.println(a>b & a%2==0); //false
		
		System.out.println(a<b && a%2==1); //true 
		System.out.println(a>b && a%2==1); //false
		System.out.println(a>b && a%2==0); //false
		System.out.println(a>b && a%2==0); //false
		
		System.out.println(a<b | a%2==1); //true
		System.out.println(a>b | a%2==1); //true
		System.out.println(a<b | a%2==0); //true
		System.out.println(a>b | a%2==0); //false
		
		System.out.println(a<b || a%2==1); //true 
		System.out.println(a>b || a%2==1); //true
		System.out.println(a<b || a%2==0); //true
		System.out.println(a>b || a%2==0); //false
		
		// |와|| 차이: || 왼쪽이 true 무조건 true로 반환
		
		System.out.println(!(a<b)); // false 
	
		//연산자우선순위높이기: ( )소괄호 사용
		//(비트연산자) - 우리수업에서는 제외
		a=1;
		b=0;
		System.out.println(a&b); // int & int & '비트연산자' 결과값 0
		System.out.println(a|b); // int | int | '비트연산자' 결과값 1 
		System.out.println(a<b&a%2==1); // boolean & boolea &: '논리연산자' 결과값 false
		System.out.println(a<b|a%2==1); // boolean | boolean |: '논리연산자' 결과값 true 
		
	}
}
