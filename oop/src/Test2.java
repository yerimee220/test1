
public class Test2 extends Test1 {
	public String name;

	public Test2() {
		this("홍길동");
		System.out.println("Test2() call");
	}

	public Test2(String name) {
		this.name = name;
		System.out.println("Test2(String name) call");

	}
}
