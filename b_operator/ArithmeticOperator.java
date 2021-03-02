package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		
/*			result = 10 %3;
			System.out.println(result);
		
			result = 10 %3;
			 
			System.out.println(result);
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
			
			int result1 = 10+10;
			int result2 = 20-20;
			int result3 = 30*30;
			int result4 = 40/40;
			int result5 = 50%6;
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
			System.out.println(result5);
	
	//복합연산자
	//변수에 저장되어있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다. 
		result += 3;
		System.out.println(result);
		
	//result에 3을 증가시키겠다.는 느낌.
		result = result +3;
		System.out.println(result);
		
	//위와 같은 표현식이다. 
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		*/
		
		
//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요
		//result = result + 10;
	
		result += 10;
		System.out.println(result);
		
		//result = result - 2*3;
		result -= 6;
		System.out.println(result);
		
		result = 16;
		
		result -=2*3;
		System.out.println(result);
		
		//result = result % 5;
		result %= 5;
		System.out.println(result);
		
		
		//증감연산자
		//증감연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1증가된다.
		i--; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i;
		i++;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i=0;
		System.out.println("i++ = " + i++); 
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다
		int _int = 10;
		double _double = 3.14;
		double result2 =(double) _int + _double;//표현범위가 더 큰 타입으로 형변환된다.
		System.out.println(result2);
		
		long _long = 100L;
		_long = _int + _long;
		_int = _int + (int)_long; // int 범위로 바꾸는 것은 생략될수 없음
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short; // int보다 작은 타입은 int로 형변환
		System.out.println(result3);
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);
		// char는 2바이트라서 int로 자동변환된다.
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);
		//byte : -128~127 +1 = -128
		//가장 큰값을 벗어나는 연산은 가장 작은값이 된다.
		b--;
		System.out.println(b);
		//가장 작은 값을 벗어나면 가장 큰 값이 된다.

		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주셍쵸.
		
		//1. 123456 + 654321
		//2. 1번의 결과값 *123456
		//3. 2번의 결과값 /123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long a = 123456+654321;
		
			a *= 123456l;
		
		    a /= 123456;
		    
		    a -= 654321;
			    
		    a %= 123456;
		    System.out.println(a);
		   
		 //3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		    
		int v1 = 15;
		int v2 = 34;
		int v3 = 49;
		int res1 = v1+v2+v3;
		double avg = res1/3.0; //3.0으로 나눠주면 double로 나눠주는 것이다.
		System.out.println(res1);
		System.out.println(avg);
//32.66666666666666666664 보기 싫다 반올림하자.
		/*avg = Math.round(avg); // 소수점 첫째자리에서 반올림, double 타입을 해야지?
*/		System.out.println(avg);// 
		avg = Math.round(avg*10) / 10.0;	
		//소수점을 옮기고 이후에 다시 원상복귀 시켜줘야 한다. 
		System.out.println(avg);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
