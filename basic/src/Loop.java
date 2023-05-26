import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			System.out.println("WELCOME");
		}
		
		//출력값 1 2 3 4 5 
		for (int i=1; i<6; i++) {
			System.out.println(i);
		}
		
		//출력값 11 12 13 14 15
		for(int i = 11; i<16; i++ ) {
			System.out.println(i);
		}
		
		//출력값 1 11 21 31 41 
		for(int i = 1; i<42; i=i+10) {
			System.out.println(i);
		}
		
		/*1부터 10씩 증가하는 숫자 50개를 출력하시오.
		for(int i=0; i<50; i++) {
			System.out.println((i*10)+1);
		}*/
			
		//A B C D E F ... Z 출력하기
		char a = 65;
		for (int i = 1; i <27; i++, a++) {
			System.out.println(a);
		}
		
		// 피보나치 수열: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ...
		// 피보나치 수열 20개 출력하기 
		int bb = 1; //전전수 
		int b = 0; //전수
		int current; //현재수
		
		for(int i=1; i<21; i++) {
			current = bb+b; //1  
			System.out.println(i+"번째"+current);
			bb = b; // 전전수 = 전수
			b = current; //전수 = 현재수
		}
		
		//1 2 3 4 ...100까지 출력하시오. 단, 7의 배수는 출력하지 않는다. 
		for(int i=1;i<=100;i++) {
			if(i>1) {
				System.out.println("");
			}
			if(i%7==0) {
				continue;//아래 구문을 하지않고 즉시 증감치(for 구문에 i++)로 이동한다.
			}
			System.out.println(i);
		}
		
		//1~100까지 출력하시오. 단, 짝수는 출력하지 마시오. 
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		//1~100까지의 합을 출력하시오.
				int sum=0;
				for(int i=1; i<=100; i++) {		
					sum += i;
				}
				System.out.println("1~100합:" + sum);
			
		//1~100까지의 숫자들의 홀수합을 출력하시오. 
				int sum1=0;
				for(int i=1; i<=100; i+=2) {
					if(i%1==0) {
					sum1 += i;}
					if(i%1==1) {
					continue;
					}
				}
				System.out.println("1~100 홀수의 합:"+sum1);
		
		// 홀수합, 짝수합 구하기 
				
		int sumOdd = 0; //홀수합
		int sumEven = 0; //짝수합
		for(int i=1; i<=100; i++) {
			if(i%2==1) {//홀
				sumOdd +=i;	
			}else {//짝
				sumEven += i;
			}
		}
		System.out.println("홀수합:"+sumOdd);
		System.out.println("짝수합:"+sumEven);

		// --구구단  2단에서부터 5단까지 출력하시오. 
		//단, 8의 배수는 출력하지 마시오. 
		//25이상인 경우 더 이상 출력하지 마시오. 
	out:for(int dan=2; dan<=5; dan++) {
		in:	for (int i=1; i<10; i++) {
				if(dan*i>=25) {
					break out;
				}
				if(dan*i%8==0) {
					continue;
				}
				if(i>1) {
					System.out.print(",");
				}
				System.out.print(dan*i);
			}
			System.out.println();
		}
	
	System.out.println();
	
	// while 반복문 [WELCOME 5번 출력하기]
	int iw = 0; //초기식
	while(iw<5) { //조건식
		System.out.println("WELCOME");
		iw++; //증감식 
	}
	
	// while문으로 1 11 21 31 41 출력하기
	int i =1;
	while(i<42) {
		System.out.println(i);
		i=i+10;
	}
	
	// while A부터 Z까지 출력하기 
	char ab = 65;
	while(ab<91) {
		System.out.println(ab);
		ab++;
	}
	
	// 피보나치 수열: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ...
	// while문으로 피보나치 수열 20개 출력하기 
			int cc = 1; //전전수 
			int c = 0; //전수
			int current1; //현재수
			
		iw=0;
		while(iw<21) {
			current1 = cc+c;
			System.out.println(iw+"번째"+current1);
			cc=c;
			c=current1;
			iw++;
		}
			
		// 1부터 10까지 출력하시오. 
		iw=1;
		while(iw<=10) {
			System.out.println(iw);
			iw++;
		}
		
		System.out.println();
		
		// [while] 1부터 10까지 출력하시오.
		iw=0;
		while(iw<10) {
			iw++;
			System.out.println(iw);
		}
		
		System.out.println();
		
		// [for문] 
		for(i=0; i<10;) {
			i++;
			System.out.println(i);
		}
		
		// 키보드와 연결	
		Scanner sc = new Scanner(System.in); // import ctrl shift [o]
		
		while(true) {
			System.out.println("값을 입력하세요. 종료하려면 q를 입력하세요");
			//키보드로 부터 입력
			String line = sc.nextLine();
			System.out.println("입력한 값은[" + line +"]입니다");
			if("q".equals(line)) {
				break;
			}
		}
			
		//do while 문
		String line;
		do {
			System.out.println("값을 입력하세요. 종료하려면 q를 입력하세요");
			line = sc.nextLine();
			System.out.println("입력한 값은[" + line +"]입니다");
		}while(!"q".equals(line));
			
		// 
		int num;
		for(num=10; num<10; num++) {
			System.out.println(num);
		}
		
		num=10;
		while (num<10) {
			System.out.println(num);
			num++;
		}
		
		do {
			System.out.println(num);
		num++;
		}while(num<10);
		
		
		
		
		
	}
}