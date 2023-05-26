import java.util.Scanner;

import com.my.product.dao.ProductRepository;
import com.my.product.dto.Product;

public class ProductUser {
	static Scanner sc = new Scanner(System.in);// 메인메서드에서 사용하려고 static사용
	private ProductRepository repository = new ProductRepository(10);

	public void findAll() {
		System.out.println(">>전체상품검색<<");
		Product[] resultArr = repository.selectAll();
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i].print();
		}
	}

	public void findByProdNo() {
		System.out.println(">>상품검색<<");
		System.out.print("상품번호를 입력하세요:");
		String noArg1 = sc.nextLine(); // 키보드로 입력받기
		System.out.print(noArg1);
		System.out.println(repository.selectByProdNo(noArg1) == null ? "상품이 없습니다" : "상품이 있습니다");
		// To do
		// 상품이 존재하면 상품번호, 상품명, 가격을 출력하시오.
		Product p = repository.selectByProdNo(noArg1);

		if (p != null) {
			p.print();
		}
	}

	public void add() {
		System.out.println(">>상품추가<<");
		System.out.println("상품번호를 입력하세요:");
		String prodNo = sc.nextLine();
		System.out.println("상품명을 입력하세요:");
		String prodName = sc.nextLine();
		System.out.println("상품가격을 입력하세요");
		int prodPrice = Integer.parseInt(sc.nextLine());

		Product pArg = new Product(prodNo, prodName, prodPrice);

		repository.insert(pArg);

		// 검색어를 포함한 상품으름을 갖는 상품은 모두 출력
		// (예시) 상품이름으로 검색: TV
		/*
		 * A:TV:10 C:삼성TV:10 F:LGTV:20
		 */
	}

	public void findByProdName() {
		System.out.println(">>상품이름으로 검색<<");
		System.out.println("단어를 입력하세요. 단어를 포함한 상품명으로 검색합니다");
		String word = sc.nextLine();
		Product[] pArr = repository.selectByProdName(word);
		for (Product p : pArr) {
			p.print();
		}
	}

	public static void main(String[] args) {
		// new ProductRepository(); // 최대 5개의 상품이 저장될 저장소
		// new ProductRepository(10); //최대 10개의 상품이 저장될 저장소
		// new ProdㅕxtRepository(-1); //"저장소의 크기는 1이상이어야 합니다" 출력한다
		ProductUser user = new ProductUser();
		String opt;
		do {
			System.out.println("작업을 선택하세요");
			System.out.print("1:상품전체검색, 2:상품번호로검색, 3:상품추가, 4:상품이름으로 검색, 9:종료");
			opt = sc.nextLine();

			if (opt.equals("1")) { // ==비교연산자사용안함 / equals 문자열의 내용을 비교해줄 때 사용
				user.findAll();
			} else if (opt.equals("2")) {
				user.findByProdNo();
			} else if (opt.equals("3")) {
				user.add();
			} else if (opt.equals("4")) {
				user.findByProdName();
			}

			else if (opt.equals("9")) {
			} else {
				System.out.println("잘못입력하셨습니다");
			}
		} while (!opt.equals("9"));

		/*
		 * System.out.println(">>상품추가<<"); Product pArg = new Product(); pArg.prodNo =
		 * "G0001"; insert(pArg);
		 * 
		 * System.out.println(">>상품추가<<"); Product pArg1 = new Product(); pArg1.prodNo =
		 * "G0002"; insert(pArg1);
		 * 
		 * System.out.println(">>상품검색<<"); String noArg1 = "G0002"; //Product result1 =
		 * selectByProdNo(noArg1); //System.out.println(result1 == null? "상품이 없습니다" :
		 * "상품이 있습니다"); //삼항연산자 System.out.print(noArg1);
		 * System.out.println(selectByProdNo(noArg1) == null? "상품이 없습니다" : "상품이 있습니다");
		 * //위 2줄 코드와 아래 한줄 코드 같음
		 * 
		 * System.out.println(">>상품검색<<"); String noArg2 = "X";
		 * //selectByProdNo(noArg2); System.out.println(noArg2);
		 * System.out.println(selectByProdNo(noArg2) == null? "상품이 없습니다" : "상품이 있습니다");
		 * 
		 * System.out.println(">>전체상품검색<<"); Product[]resultArr = selectAll(); for(int
		 * i=0; i<resultArr.length; i++){ System.out.println("상품번호:" +
		 * resultArr[i].prodNo); } }
		 */

	}
}

/*
 * 컴파일러 javac -d d:\Overview\myJAVA -cp d:\Overview\myJAVA
 * d:\overView\myJAVA\ProductUser*.java java -cp D:\Overview\myJAVA ProductUser
 */