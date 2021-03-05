package e_oop.orient;


public class Oop {
	public static void main(String[] args){
		/* 
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * -프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것.
		 * -코드의 재사용성이 높고 유지보수가 용이하다.
		 */

		/*다른클래스를 사용하고 싶으면, 사용하고 싶은 클래스를 메모리에 올려야 한다. -> 객체 생성
		new SampleClass(); 이렇게 하면 이 클래스가 저장된 주소를 돌려준다. 
		++ new 뒤에 생성자를 호출한다. 
		
		SampleClass sc = new SampleClass();
		//클래스가 들어있는 주소를 알려주기 위해 변수를 만들어서 저장한다. 
		*/
		
/*		SampleClass sc = new SampleClass();

		System.out.println(sc.field);

		sc.method1(); //매서드 출력. 그럼 출력된다. 파라미터도 리턴타입도 없는 매서드
		void method1(){
			System.out.println("파라미터도 리턴타입도 없는 매서드");
			
		//sc.method2(10); //파라미터가 있으면 파라미터를 입력해줘야 한다.(인트) 얘는 호출하면 String 타입값을 리턴한다. 
		String returnValue = sc.method2(10); //리턴이 string이니 string타입의 변수에 값을 저장한다.
		
		 * 	String method2(int parameter){
		return parameter + "를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
		 
		System.out.println(returnValue);
		//10를 받아 명령을 수행하고 결과물을 리턴하는 메서드

		//매서드가 호출되면 그곳으로 가서 실행하고 돌아온다.		
		
		sc.flowTest1();
		
		//방금만든 클래스의 객체를 생성하고 변수에 저장해주세요. (classmaker)
		//객체가 저장된 변수를 통해 메서드를 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주고
		//리턴타입이 있는 메서드를 리턴받은 값을 출력해주세요
		
		ClassMaker cm = new ClassMaker();
		
		cm.a(); // void 는 무슨 타입이냐
		System.out.println(cm.a);
		String bbb = cm.b(); //.찍고 기다려봐, 파라미터랑 리턴타입이랑 보아라. 
		cm.c(10);
		int ddd = cm.d(10,10);
		System.out.println();
		
//System.out.println(cm.a()); void는 출력이 안된다. 메서드 안에서만 출력이 가능하다. 
		System.out.println(cm.b());
		cm.c(100);
		
		System.out.println(cm.d(10, 20));
		//ctrl + SpaceBar : 자동완성
	
	*/
	
	//다음줄 한줄씩 계산해서 최종 결과값을 출력해주세요.
	//1. 123456 +654321
	//2. 1번의 결과값 * 123456
	//3. 2번의 결과값 / 123456
	//4. 3번의 결과값 - 654321
	//5. 4번의 결과값 % 123456
	Calculator cc = new Calculator();
	
	/*
	double one = cc.plus(123456,654321);
	double two = cc.multi(one, 123456);
	double three = cc.divid(two, 123456);
	double four = cc.minus(three, 654321);
	double five = cc.rest(four, 123456);
	
	System.out.println(five);
	*/
	
	double result = cc.plus(123456,654321);
	result = cc.multi(result, 123456);
	result = cc.divid(result, 123456);
	result = cc.minus(result, 654321);
	result = cc.rest(result, 123456);
	System.out.println(result);
	

	}
}
