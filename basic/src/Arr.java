import java.util.Arrays;
import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
		
			
//		Scanner sc = new Scanner(System.in);
//		String[]subject = {"국어","영어","수학"};
//		subject = new String[]{"KOR","ENG","MAT"};
//		
//		int subjectSize = subject.length;
//		
//		int [][]studentArr; //학생수 5, 과목수 3
//		studentArr = new int[5][subjectSize];
//		int studentSize = studentArr.length; //학생수
//		
//		for(int studentCnt=0; studentCnt<studentSize; studentCnt++) {
//			int size = studentArr[studentCnt].length;
//			for(int i=0; i<size; i++) {
//				System.out.print(subject[i]+"점수:");
//				studentArr[studentCnt][i] = Integer.parseInt(sc.nextLine());
//			}
//			
//			int totalScore = 0;//총점
//			for(int i=0; i<size; i++) {
//				totalScore += studentArr[studentCnt][i];//scoreArr[i]; // totalScore = totalScore+scoreArr[i];
//			}
//			System.out.println("총점:" + totalScore);
//			System.out.println("평균:" + (float)totalScore/size);
//		}
//		
//		//과목별 평균
//		for(int i=0; i<subjectSize; i++) {
//			int totalScore = 0;
//			for(int studentCnt=0; studentCnt<studentSize; studentCnt++) {
//				totalScore += studentArr[studentCnt][i];
//			}
//			System.out.println(subject[i]+"평균:" + (float)totalScore / studentSize);
//		}
//					
//		//[배열] 출생년도별 띠 출력하기 
//
//		System.out.print("출생년도를 입력하세요:");
//		int birthYear = Integer.parseInt(sc.nextLine());		
//		int io = birthYear%12;
//		String [] anim = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
//		System.out.println(anim[io]);		
//		
//		이해가 안가니까 집에가서 다시해보기 
//		//배열 안에 있는 숫자가 몇번씩 출현하는지 코딩하기 
//		int []numArr = {1,10,3,2,1,2,2,5,6,3,2,8,7,6,9};
//		int []result = new int[10]; // [0]는 1의 출현횟수저장공간, [1]은 2의 출현횟수저장공간
//		for (int i = 0; i < numArr.length; i++) {
//			result[numArr[i]-1]++;
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println((i+1) + "의 출현횟수: " + result[i] + "회");
//		}
//
//		
//		
//		numArr= new int[] {7, 3, 6, 10, 2};
//		//0번 인덱스에 값을 맥스에 넣어주기
//	    // 코드입력하기 
//		int max = numArr[0]; //max는 numArr 배열의 [0]위치
//		int [] numArr2 = {7,3,6,6,10,2}; //값초기화
//		for(int i=0; i<numArr2.length; i++) {
//			for(int j=0; j<numArr2.length; j++) {
//				if ( numArr2[i]>max) {
//					max = numArr[i];
//					} 
//				}
//		}
//		System.out.println("최댓값"+ max);
//		
//		//배열 생성, 선언, 값넣기 
//		int [][]numArr2;
//		numArr2=new int [3][3];
//		int num1 = 1; 
//		for (int row=0; row<numArr2.length; row++) {
//			for(int col=0; col<numArr2[row].length; col++, num1++) {
//				numArr2[row][col]=num1;
//			}
//		}
//		
//		for (int row=0; row<numArr2.length; row++) {
//			for(int col=0; col<numArr2[row].length; col++, num1++) {
//				System.out.print(numArr2[row][col]+"\t");
//			}
//		System.out.println();
//		}
//		
//		int [][]numArr3;
//		numArr3=new int [3][3];
//		int num3 = 1; 
//		for (int row=0; row<numArr3.length; row++) {
//			for(int col=0; col<numArr3[row].length; col++, num3++) {
//				numArr3[row][col]=num3;
//			}
//		}
//		
//		for (int row=0; row<numArr3.length; row++) {
//			for(int col=0; col<numArr3[row].length; col++, num3++) {
//				System.out.print(numArr3[row][col]+"\t");
//			}
//		System.out.println();
//		}
//		
//		
//		// 2차 배열에 행3 열3 (그 안에 대입되는 )
//		//int [][] numArr4 = new int[3][];
//	
//	
//		//numArr4[0] = new int[2];
//		//numArr4[1] = new int[5];
//		//numArr4[2] = new int[3];
//		
//		
//		int[][]numArr5 = new int[5][];
//		
//	
//		int num=0;
//	      int [][]numArr5 = new int[5][];
//	      System.out.println("--------------");
//	      for(int i=0; i<numArr5.length; i++) {
//	         numArr5[i] = new int[i+1];
//	         for (int j=0; j<numArr5[i].length; j++) {
//	            if(j==0||j==numArr5[i].length-1) {
//	               numArr5[i][j]=1;
//	            }else {
//	               numArr5[i][j]=numArr5[i-1][j-1]+numArr5[i-1][j];
//	            }
//	         }
//	      }
//	      for(int i=0; i<numArr5.length; i++) {
//	         for(int j=0; j<numArr5[i].length; j++, num++) {
//	            System.out.print(numArr5[i][j]+"\t");
//	         }
//	         System.out.println(); {}}
//	              
//		
		//로또숫자 얻기 (1-45숫 사이의 중복되지 않는 6개 숫자가 필요함) 
			//int r = Math.random(); //0.0<= ~ <1.0
		int []lotto = new int[6];
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int) (Math.random()*45+1); //1<= ~ <46
		//중복 처리하기 
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}

		//------------- sort
		int[] numArr = new int[] {3, 2, 6, 5, 1, 4};
		Arrays.sort(numArr);
		for(int i=0; i<numArr.length; i++) {
			System.out.println(numArr[i]+"\t");
		}
		
	
		//-------copy
		int []copy = new int[numArr.length];
//		
		int originIndex = 0; //원본위치
		int destIndex = 0;
		System.arraycopy(numArr,originIndex,
						copy,destIndex,	
						copy.length);
		
		
		
		
		
		
		
	}
}
