package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/* 
		 * *논리연산자
		 * - &&(AND), ||(or), !(not)
		 * - 피연산자로 boolean만 허용한다.
		 */
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;
		//||보다 &&의 우선순위가 높다.
	//and와 or는 비교연산을 연결해주는 역할을 한다.
		//&& 둘다 true일때만 true. || 둘다 false 일때만 false나온다.
		
		//&&와 ||가 같이 있을때는 &&가 높아서 
		
		// false && false || ture
		
		System.out.println(b);
		
		
		b = !(x<y); //조건식의 결과를 반대로 저장한다.
		
		// b = !x <y; //이러면 비교연산에 !이 아니라 x에 !이 된거다.
	
	//효율적 연산 
		b = true && true; // true
		b = true && false; // false
		b = false && true; // false
		b = false && false; // false
				// &&는 왼쪽이 false면 오른쪽을 확인도 안하고 false다.
		
		b= true || true; // true
		b= true || false; // true
		b = false || true; // true
		b = false || false; // false
		//||왼쪽이 true 면 무조건 true다. 오른쪽은 안쳐다본다. 
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다. 
		// 따라서 밑에 경고표시가 뜬다. 실행은 가능하지만 문제의 소지가 있기 때문이다.

		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a);
		// 왼쪽이 false라 뒤에 a++ 증가에 대한 연산은 수행하지 않는다.
		
		
		//다음 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고, x가 10보다 작다.
		b = x > y && x <10;
				
		//2. x가 짝수이고, x가 y의 배수이다.

		b = x %2 ==0 && y %x ==0;
		
		
		//3. x가 3의 배수이거나, x가 5의 배수이다. 
		
		b = x %3 ==0 || x %5 ==0;
		
		
		
	}

}
