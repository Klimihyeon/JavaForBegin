package a_variable;  //클래스 위치

import java.util.Scanner;

public class Variable { //클래스

	public static void main(String[] args) {//매서드 이름 = main 이름 뒤에 ()가 붙어있음.
	/*매써드 = 명령문의 집합, 명령문은 매써드 안에만 작성이 가능하다.클래스 뒤의 중괄호가 매써드의 범위이다. 	
		main이란 이름을 가진 매써드. 프로그램의 시작과 끝을 담당. //<- 주석, 프로그램코드로 인식하지 않음.
		한줄주석 ctrl + shift + c = 주석처리, 블럭지정 후 범위주석 ctrl + shift + /(해제 \) */

		int x; //데이터를 저장할 수 있는 그릇이 되었다.	
//		double x; 
		double y; 
		x= 10; 
		y= 3.14;
		
		int abc = 30; // 일반적으로 변수 선언과 초기화를 동시 진행한다.
		long l = 40L; // 접미사 L을 붙여야 long타입이 된다. 
		float f = 5.5f; // 접미사 f를 붙여야 float타입이 된다. 
		char c = '한'; // 따옴표안에 반드시 한 글자를 넣어야 한다. 
		boolean b = true; // true, false
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		
		byte a = 1;
		short ab = 2;
		int ac = 3;
		long ad = 4L;
		float ae = 0.5f;
		double af = 0.25;
		char ag = '쿨';
		boolean ah = true;
		
		x  = 20; // 기존에 저장되어있는 10이라는 값은 사라지고 20이라는 값이 저장된다.
		//타입은 변수를 만들때만 사용하고, 만들어진 이후에는 이름만 가지고 사용한다. 
		y = 5.5;
		
		//위에서 만든 8개의 변수에 새로운 값을 저장해주세요
		
		a = 10;
		ab = 20;
		ac = 30;
		ad = 40L;
		ae = 0.25f;
		af = 0.5;
		ag = '핫';
		ah = false;
		
		System.out.println(x);
		//실행단축키 ctrl + f11
		System.out.println(a);
		System.out.println(ab);
		System.out.println(ac);
		System.out.println(ad);
		System.out.println(ae);
		System.out.println(af);
		System.out.println(ag);
		System.out.println(ah);
		
		String str = "사랑해"; // 클래스는 참조형타입 데이터다. 
		String wa = "만큼"; 

		
		System.out.println(str);
		
		System.out.println(str+50+30);
		System.out.println(50+30+str);
		System.out.println(wa+str);
		int small = 10;
		long big = 10L;
		//small = big;
		small = (int)big; //컴파일 에러 사라짐
		big = small;
		final int max_number = 10;
		//max_number = 100;
		
		System.out.println("줄바꿈을 \t 한 칸 더 합니다.");
			System.out.print("줄바꿈을 하지 않는다.\n을 사용하면 줄바꿈 해줌");
			System.out.printf("문자열 : %s, 숫자: %d", "안녕", 10);
			System.out.println();
			
/*			Scanner sc = new Scanner(System.in);
			System.out.println("아무거나 입력해주세요.");
			sc.nextLine();
			String str2 = sc.nextLine();
			System.out.println("입력받은 내용: "+ str2);
			
			System.out.println("int 입력>");
			int nextInt = sc.nextInt(); 
			System.out.println(nextInt);
			System.out.println("문자열 입력>");
			String nextLine = sc.nextLine();
			System.out.println(nextLine);
			System.out.println("입력 끝!");
			
		System.out.println("int입력");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println(number);*/
		
		
		//문제나가여어어엉어~ 자신의 이름을 저장할 변수를 선언해주세요.
			
/*			String name = "김이현";
 * 
 * 
*/						
				/*	이름을 저장할꺼니까 string */
			Scanner sc = new Scanner(System.in);		
			String myName;
					
					
		//선언한변수를 초기화 하기 위해 이름을입력받아주세요.
					
/*			System.out.println("자신의 이름을 입력해주세요.");
			sc.nextLine();
			String str2 = sc.nextLine();
			System.out.println("입력받은 내용: "+ str2);
*/		
			System.out.println("자신의 이름을 입력해주세요.");
			myName = sc.nextLine();
			
		// 자신의 나이를 저장할 변수를 선언해주세요.
		
			int myAge;
					
			
			
		// 위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
				
			
			
			System.out.println("자신의 나이를 입력해주세요.");

			myAge = Integer.parseInt(sc.nextLine());	

			System.out.println("이름: "+ myName + " /나이 : " + myAge);
			
			
}

}