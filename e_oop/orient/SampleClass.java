package e_oop.orient;

public class SampleClass {

	public static void main(String[] args) {
		int local = 10; // 지역변수 : 메서드 안에서만 사용하는 변수

	}
	
	int field; //전역변수 : 클래스 전체 영역에서 사용하는 변수
	//초기화하지 않아도 기본값으로 초기화된다. 
	
	boolean bool = false;
	String str = null;
	
	/*
	 * -메서드 : 변수를 가지고 할 일
	 * -선언방법 : 리턴타입 메서드명(파라미터){}
	 * -파라미터(매개변수) : 실행에 필요한 정보
	 * -리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
	 * 
	 */
	
	void method1(){
		System.out.println("파라미터도 리턴타입도 없는 매서드");
		//타입이 있는가? 타입이 없다. void = 리턴타입이 없다. 실행 후에 돌려줄 값이 없다. 
		//파라미터가 없어서 괄호를 비워둔다.
	}
	String method2(int parameter){
		return parameter + "를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
		//나에게 일을 시킨사람에게 스트링 타입을 돌려준다.
		//파라미터 : 나한테 일을 시키는 사람이 주는 정보.
	}
	void flowTest1() {
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}

	void flowTest2() {
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}

	void flowTest3() {
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}
	
	
	

}