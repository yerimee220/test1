import com.my.asia.Korea; 
import com.my.asia.Japan;
import com.my.europe.France; 
//import com.my.asia.*;


public class CountryTest {

	public static void main(String[] args) {
		com.my.asia.Korea k;
		k = new com.my.asia.Korea(); 

		Korea k1 = new Korea();
		
		France f = new France();
			 
		Japan j = new Japan();
		
		
//	    k1.capital = "서울";
//		k1.capital = "평양";
//		k1.language = "일본어"
//		k1.population = "-1"
	
		//System.out.println(k1.population);
		k1.print(); //public void print() {
	//	System.out.println("인구:"+ population);
	//} 캡슐화  - korea.java 
		k1.up();
		k1.down();
		k1.print();
	}
}
