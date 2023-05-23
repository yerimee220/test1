import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
//		String s1, s2, s3, s4;
//		s1 = "HELLO";
//		s2 = new String("HELLO");
//		s3 = new String("HELLO");
//		s4 = "HELLO";
//		System.out.println(s1==s2); //false
//		System.out.println(s2==s3); //false
//		System.out.println(s1==s4); //true 
//		
//		System.out.println(s1.equals(s2)); //true
//		System.out.println(s2.equals(s3)); //true
//		System.out.println(s1.equals(s4)); //true
		
//		//완성 못한거 
//		// 모든값이 true면 true 
//		// 하나로도 false있으면 false 
//		String palindrome = "소주아아이소";
//		int size = palindrome.length();
//		for (int i=0; i<size/2; i++) {
//			if(palindrome.charAt(i)==palindrome.charAt(size-i-1)) {
//				System.out.println("true");
//			}else {
//				System.out.println("false");
//			}
//		}	
//	

//	//TODO Palindrome문자열입니다 또는 Palindrome문자열이 아닙니다 (강사님 코드)
//		String palindrome = "소주만병만주소"; //LEVEL, SOS, ROTATOR, 기러기
//		int size = palindrome.length();
//		//boolean flag = true;
//		int i;
//		for(i=0; i<size/2; i++) {
//			char c1 = palindrome.charAt(i); //앞
//			char c2 = palindrome.charAt(size-1-i); //뒤
//			if(c1 != c2) { 
//				//flag = false;
//				break;
//			}
//		}		
//		//if(flag) {
//		if(i == size/2) {
//			System.out.println("Palindrome문자열입니다");
//		}else {
//			System.out.println("Palindrome문자열이 아닙니다");
//		}		
//		
//		String score = "54:89:30";
//		String[]scoreArr=score.split(":");
//		System.out.println("국어:"+Integer.parseInt(scoreArr[0]));
//		System.out.println("영어:"+scoreArr[1]);
//		System.out.println("수학:"+scoreArr[2]);
//		int K = Integer.parseInt(scoreArr[0]);
//		int E = Integer.parseInt(scoreArr[0]);
//		int M = Integer.parseInt(scoreArr[0]);
//		System.out.println("평균"+(K+E+M)/scoreArr.length);
//		
//		score = "54::30";
//		scoreArr = score.split(":");
//		System.out.println("국어:" + Integer.parseInt(scoreArr[0]));
//		System.out.println("영어:" + scoreArr[1]);
//		System.out.println("수학:" + scoreArr[2]);
//		int k = Integer.parseInt(scoreArr[0]);
//		int e = scoreArr[1].equals("")?0:Integer.parseInt(scoreArr[1]);
//		int m = Integer.parseInt(scoreArr[2]);
//		System.out.println("평균:" + ((float)(k+e+m)/scoreArr.length));
//		
//		System.out.println("--------------");
//		StringTokenizer st = new StringTokenizer(score, ":"); //import ctrl + shift + [o]
//		//token의미: 소스코드를 작은 조각으로 분할하는데 사용되는 유의미한 단위
//		//둘다 문자열을 분리해주는 라이브러리인데 split은 무조건 분리, tokenizer는 토큰으로만 분리함 
//		
//		int sum = 0; //총점
//		int cnt = 0; //과목수
//		while(st.hasMoreTokens()) { //score문자열에 :구분자로 분리할 문자열이 있는가
//			String s = st.nextToken();
//			System.out.println(s);
//			sum += Integer.parseInt(s);
//			cnt++;
//		}
//		System.out.println("평균:" + ((float)sum/cnt));
		
		//"https://www.example.com:8080/path/to/resource?param1=value1&param2=value2#section1";
		// URL: 웹 상에서 특정 리소스의 위치를 나타내는 주소
//		프로토콜: https
//		호스트: www.example.com
//		포트: 8080
//		경로: /path/to/resource
//		쿼리 파라미터: param1=value1 및 param2=value2
//		프래그먼트: section1
		
		String urlStr =
				"https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=100";
				parseURL(urlStr);
		

			String fileName = "a.txt";
			parseName(fileName);			
	}
	
	static void parseName(String fileName) {
		//todo 파일의 확장자를 구분한다
		//ex) a.txt파일인 경우 "확장자는 txt입니다"를 출력한다
		int index = fileName.lastIndexOf(".");//1
		System.out.println(fileName.substring(index+1));
	}
			
	
		static void parseURL(String url) {
		//TODO url에서 사용하는 프로토콜을 출력하시오
			//URL 구성요소 - 프로토콜://호스트명/패스?쿼리
			//hint : indexOf(), substring()
			
//			int index = url.indexOf(":");
//			
//			if (index == -1) {
//				System.out.println("프로토콜을 찾을 수 없습니다");
//			}else {
//				System.out.println("포로토콜명:"+url.substring(0,index));	
//			}
//			
//			// 호스트명 구하기  (해결못함) 
//			int host1 = url.indexOf("//");
//			int host9 = url.indexOf("/");
//			System.out.println(host1+","+host9); {
//				
//			}
			// 강사님 답안
			String[] arr = url.split("\\?"); //?구분자로 분리
			
			String[] protocolHostPath = arr[0].split("/");
			
			String protocol = 
					protocolHostPath[0].substring(0, 
							protocolHostPath[0].indexOf(":"));
			System.out.println("프로토콜명:" +protocol);
			
			String host = protocolHostPath[2];
			System.out.println("호스트값:" + host);
			
			String path = "";
			for(int i=3; i<protocolHostPath.length; i++) {
				if(i>2) {
					path += "/";
				}
				path += protocolHostPath[i];
			}
			if(protocolHostPath.length > 2) {
				System.out.println("패스값:" + path);
			}
			
			if(arr.length == 2) {
				String []query = arr[1].split("\\&");
				for(int i=0; i<query.length; i++) {
					String[] queryNameValue = query[i].split("=");
					String queryName = queryNameValue[0];
					String queryValue = queryNameValue[1];
					System.out.println("쿼리변수이름:" + queryName + ", 변수값:" + queryValue);
				}
			}
			
			
	
			
			
			
			
		}	
}

		
	

