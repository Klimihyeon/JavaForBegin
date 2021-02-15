package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 *  -for문
		 *  -while문
		 *  -do-while문
		 *  
		 *  for문
		 *   - for(초기화; 조건식; 증감식){}
		 *   - 포함하고 있는 문장들을 정해진 횟수만큼 반복하게 해주는 문장
		 *   - 조건에 의해 정해진 횟수만큼 반복한다.
		 */
/*		for(int i = 1; i<= 10; i++){
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			System.out.println(i+ "번째 반복");
			//초기화한 변수를 블럭안에서 사용할 수 있다.
			//int i로 만든 녀석은 밖에서는 업는 변수라 사용할 수 없다.
		}
		//규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용한다.
		int sum = 0; //1부터 10까지 합계를 저장
		
		sum+=1;		
		sum+=2;
		sum+=3;
		System.out.println(sum);

		
		sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum); //5050
		
		sum = 0;
		for(int i = 100; i >= 1; i--){
			sum += i;
		}
		System.out.println(sum); //5050
		
		
		//1부터 100까지 짝수의 합을 출력해주세요.
		
		sum=0;
		for(int i = 2; i <= 100; i +=2){ //2씩 증가
			sum += i;
			//또는 이렇게도 할 수 있다.
			//for(int i = 2; i <= 100; i++){
			if(i%2 ==0){
				sum +=i;
			}}
		}
		System.out.println(sum);
		
		sum=0;
		for(int i = 1; i <=100; i++){ // cf. i += 2
			if(i%2 == 1){
				sum +=i;}
	}		System.out.println(sum);
		
	//구구단 출력
	 
	 * 2*1 = 2
	 * 2*2 = 4
	 * ... 이렇게 출력하라
	 
	
	sum=0;
	for(int j = 2; j<=9; j++){
	for(int i = 1; i <= 9; i++){
	System.out.println(j + "*" + i + " = " + i*j); // 앞에 2가 숫자일 필요는 없어.
	}}

	
//구구단 전체를 가로로 출력해주세요
	 - >>
	 *  2 * 1 = 2   3 * 1 = 3  4 * 1 = 4
	 *  2 * 2 = 4   3 * 2 = 6  4 * 2 = 8
	 
	for(int i = 1; i <= 9; i++){
		for(int j = 2; j <=9; j++){
			System.out.print(j + "*" + i +"=" + j*i + "\t");
		} System.out.println();
	} */

	//어떤 숫자가 어떻게 변하는지에 대한 반복적인 규칙을 찾아야 만들 수 있다. 
	//바깥에 있는 포문이 1번 돌때 안에 있는 애는 9번 돌았다.
	//syso를 반복시켜서 출력되게 만든다는 개념.
	//syso를 이용한 다음줄로 넘어가기.
	//syso prinln과 print의 차이. 
	
	/*
	 * while 문
	 *  - while(조건식){}
	 *  - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
	 *  - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
	 *  - for문에서 초기화, 증감식이 없어진형태.
	 */
	int a = 1;
	//a에 2씩 몇번을 곱해야 1000 이상이 되는가?
	int count = 0;
	while(a < 1000){
		a *= 2;
		count++;
		System.out.println(count + " : " + a);
	}
	/* do while문
	 *  - do{}while(조건식);
	 *  - 최소한 한 번의 수행을 보장한다.
	 *  - while문은 false가 나오면 0회 수행한다.
	 */
	// 숫자맞추기 게임 . 처음에 무조건 한 번은 실행해야 하는 경우. 조건을 검사해야한다는 것. 뭘 해야 한다. 
	int answer = (int)(Math.random()*100)+1; // 1 ~ 100 랜덤한 수
	int input = 0;
	Scanner sc = new Scanner(System.in);
/*	do{//숫자를 입력해서, 비교를 하고, 출력을 해라. 같으면 정답이겠지. 입력한 값과 정답이 같지 않을때 반복해라.
		System.out.println("1~100사이의 수를 입력해주세요<");
		input = Integer.parseInt(sc.nextLine());
		
		if(answer < input){
			System.out.println(input + " 보다 작습니다.");
		}else if(input < answer){
			System.out.println(input + " 보다 큽니다.");
		}else{System.out.println("정답입니다!!");
	}
	}while(input != answer);	
*/
	//이름붙은 반복문 
/*	outer : for(int i = 2; i <=9; i++){
		for(int j = 1; j <= 9; j++){
			if(j ==5){
//				break; // 가장 가까운 반복문 하나를 빠져나간다.
//				break outer; //outer라는 이름의 반복문을 빠져나간다.
//				continue; // 가장 가까운 반복문의 현재 반복회차를 빠져나간다.
				continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
				// 바깥에 있는 for문까지 완전히 빠져나오고 싶으면 이름을 붙여주는거다.
				// 사용법을 알아두어라.
				// for나 while문에만 : 을 붙일 수 있다.
			}
			System.out.println(i + " * " + j + " = " + i *j);
		}
		System.out.println();
	}
	System.out.println("*****");
	System.out.println("*****");
	System.out.println("*****");
	System.out.println("*****");
	System.out.println("*****");*/
//별하나가 5번 반복되는 for문이 있다. 또 이게 3번 반복된다.
	
	// 반복문을 사용해서 별을 찍자.
	/*
	for(int i = 1; i <= 3; i++){
		for(int j = 1; j <=5; j++){
			System.out.print("*");
		}System.out.println();
		
	}*/
	
	// 삼각형 모양의 별을 찍어 달라.
	
/*
	for(int j = 1; j <= 5; j++){
		for(int i = 1; i <=5; i++){
			System.out.print("*");

		}System.out.println();
	}	*/
/*	System.out.println();	
	
	for(int j = 1; j <= 5; j++){
		for(int i = 1; i <= j; i++){
			System.out.print("*");
			System.out.print(i+ "번째 반복중인i");
	}			
		System.out.print(j+ " 전체가 번째 반복인 j");
		System.out.println();	
	}*/
	
	//역삼각형
/*	for(int j = 1; j <= 5; j++){
		for(int i = 5; i > j; i--){
			System.out.print("*");
	}			
		System.out.println();		
	}*/
	
	for(int i = 5; i >=1; i--){
		for(int j = 1; j <=i; j++){
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	
	
	
	}	//main
} //end