
public class bbb {
	//로또숫자 얻기 (1-45숫 사이의 중복되지 않는 6개 숫자가 필요함) 
		//int r = Math.random(); //0.0<= ~ <1.0
		int []lotto = new int[6];
		
		
		/**
		 * 로또숫자 계산한다
		 */
		public void make() {
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
		}
		
		/**
		 * index에 해당하는 로또숫자를 반환한다 
		 * @param index 로또숫자위치
		 * @return 로또숫자값 
		 */
		public int get(int index) {
			
		}
		
		/**
		 * 모든 로또숫자들을 반환한다 
		 * @return 모든 로또숫자값들 
		 */
		public int[] get() {
			
			
		}
		/**
		 * 로또숫자들을 출력한다 
		 */
		public void print() {
			for (int i=0; i<lotto.length; i++) {
				System.out.print(lotto[i]+"\t");
				}
			
		}
}
