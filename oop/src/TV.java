/**
 * TV객체용 클래스 
 * 
 * @author KOSTA
 * @version 1.0
 *
 */
public class TV {
	
	//기능을 수행하기 위한 것(thing)부터 만들어야 한다. 
	//객체의 특징이 되어야 하는 변수는 멤버변수로 만들어줘야 한다. 
	// 멤버변수 선언 (3개) - 
	
	boolean power; 
	 int ch;
	 int vol;
	
	 /**
	  * 전원을 켠다
	  */
	public void powerOn() {
		power = true; 
	}
	
	/**
	 * 전원을 확인한다. 
	 * @return 켜져있으면 true 반환, 꺼져있으면 false 반환
	 */
	//제공자쪽에서 사용자쪽에 결과값을 리턴해줘야 하기 때문에 함수의 반환형태를 boolean타입으로 설정
	public boolean isPower() {	
		return power;
	}
	
	public void print () {
		System.out.println("채널은"+ch+","+"음량은"+vol);
	}
	
	public void powerOff() {
		power = false; 
	}
	
	}


	

