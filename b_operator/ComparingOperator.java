package b_operator;

public class ComparingOperator {
public static void main(String[] args){
	/*
	*비교연산자
	* - <, >, <=, >=, ==, !=
	* - 문자열비교 : equals()
	*/
	
	int x = 10;
	int y =20;
	boolean b = x <y; //비교연산의 결과는 boolean이다.
System.out.println(b);
/*	b= x <= y -15; //산술연산 후 비교연산을 수행한다.
	System.out.println(b);
	//산술연산의 우선순위가 더 높다.
	
	String str1 = "abc";
	String str2 = "abc";
	b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다. 
	System.out.println(b);
//	참조형 타입이기 때문에 변수의 값을 저장게 아니라 주소를 저장한 것이다. 주소를 비교한 것이다.
	
	//string의 내용을 비교하기 위해서는 equals()메서드를 사용한다.
	b= str1.equals(str2);
	System.out.println(b);

	b= !str1.equals(str2); //!를 붙여주면 같지 않다는 표현을 하는 것이다. 
	System.out.println(b);
	//다음의 문장들을 코드로 작성해주세요.
	
//1. x가 y보다 크다.
	b = x > y;
	System.out.println(b);
	
	//2. x + 5 와 y는 같다.
	
	b =  x + 5 == y;
	System.out.println(b);
	
	// 3. y는 홀수이다. 어려워ㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓ
	
	b = y % 2 == 1;
	
	System.out.println(b);
	*/
	
			//. 4. 기본형과 참조형은 다르다.
			String a = "기본형";
			String c = "참조형";
			b = !a.equals(c);
	
			b= !"기본형".equals("참조형");
	
			System.out.println(b);
	
	
	}
}
