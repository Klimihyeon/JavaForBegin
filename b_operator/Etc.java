package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * - |, &, ^, ~, <<, >>
		 * -비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - .(참조 연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
           //.은 어떤 범위 안에 있는 뭔가를 지칭할때 .을 찍는다. System. 중에 out 같은.

		 * - (type) : 형변환
		 * - 조건식 ? : (삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장 
		 * 조건식이 True냐 false냐 에 따라서 : 뒤에 가 수행이된다는 이야기.
		 */
		//1byte : 01010101 1bit : 01 
		System.out.println(10|15);//둘다 0인경우 는 0 그외 1
		//10 : 00001010
		//15 : 00001111
		//|연산 :00001111 결과값이 이렇게 된다. 
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;
		//조건식, 어떤 조건에 의해 둘주에 하나가 실행된다.
		// x < y가 true기 때문에 x가 실행된다. int result = x;
		System.out.println(result);
		
		// 주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 3;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//이 식의 문제점은 regNo가 3일때도 여자가 나온다는 것이다.
		//해결하려면 어떻게 해야 하는가?
		//삼항연산자를 하나 더 만들어서 조건을 추가해야한다.
		
		gender = regNo == 1? "남자" : (regNo == 2? "여자" : "확인불가");
				System.out.println("당신의 성별은 " + gender + "입니다.");
			
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		
/*				Scanner sc = new Scanner(System.in);
				System.out.println("첫번째 숫자 >");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("첫번째 숫자 >");
				int num2 = Integer.parseInt(sc.nextLine());
				
				System.out.println(num1<num2 ? num2 : num1);*/

				//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요
				// 그외의 숫자를 입력하면 확인불가를 출력해주세요

				Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
 			int number = Integer.parseInt(sc.nextLine());
 			
 			String genders = number == 1 || number ==3 ? "남자"
 					: (number == 2|| number == 4 ? "여자" : "확인불가" );
 					System.out.println(genders);
 			
	
	
	}
}