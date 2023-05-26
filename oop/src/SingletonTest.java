//제공자코드 
class Single {
	static private Single s = new Single();

	// 생성자
	private Single() {
	}

	// 메소드
	static Single getInstance() {
		// return null;
		return new Single();
//		return s;
	}
}

//사용자코드 
public class SingletonTest {
	public static void main(String[] args) {
//		Single s1 = new Single();
//		Single s2 = new Single();
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1 == s2); // false
	}
}
