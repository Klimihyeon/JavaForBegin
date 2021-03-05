package e_oop.orient;

public class ClassMaker {

	//전역변수를 하나 만들어주세요.
	
	String str = "ABC";
	int in = 0;

	//리턴타입과 파라미터가 없는 매서드 하나를 만들어주세요
	//매서드 안에서 전역변수를 출력해주세요.
	void a(){
		System.out.println(str);
		System.out.println(in);
	}

	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 매서드 하나를 만들어주세요.
	//매서드안에서 전역변수를 리턴해주세요.
	String b(){
		System.out.println(str);
		System.out.println(in);

		return str;
	}
	
	//리턴타입은 없고 ㅏ라미터가 있는 메서드 하나를 만들어주세요
	//메서드 안에서 파라미터를 출력해주세요.
	void c(int a){
		System.out.println(a);
		System.out.println(a);
		System.out.println(in);

		if(a ==1){
			return; // 이런경우에 조건만족시 메서드 종료를 원하면 return쓰는거다
		}
		System.out.println(a);
		System.out.println(a);

		return; 
		//void인데도 return 쓸수는 있는데, 값이 없으니 연결은 안해주지만, 메서드를 종료시켜주긴 한다. 필요한 경우에 해라.
	}

	//int 타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	int d(int a, int b){
	//return 메서드를 종료시켜주고 값을 연결시켜주는 역할.
		System.out.println(in);
		System.out.println(str);
		System.out.println(b()); // 리턴값이 있는 메서드만 출력이 가능하다. void는 출력이 안된다.
		
		c(10); //같은 메서드 안에서 다른 메서드를 불러올땐 이렇게. new 선언같은거 안해줘도 된다.
		//그러나 다른 클래스의 메서드를 가져오려면 이렇게 해야한다. 

		return a*b;
	}
	
}
