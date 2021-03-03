package c_statement;

import java.util.Scanner;


public class ConditionalStatement {

	public static void main(String[] args) {
	/*
	 * 조건문
	 *  -if문
	 *  -switch문
	 *  
	 *  if문
	 *   - if(조건식){} : 조건식의 결과가 true이면 불럭안의 문장을 수행한다.
	 *   -else if(조건식){} : 다수의 조건이 필요할때 if 뒤에 추가한다.
	 *   -else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다. 
	 */
		int a =1;
		if(a == 1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
					}
		if(a == 0){
			System.out.println("조건식의 연산결과가 false 이면 수행되지 않는다.");
		}
		
		if(a == 1){
			System.out.println("a가 1인 경우에 하고싶은 것");
		}else if(a == 2){
			System.out.println("a가 2인 경우에 하고싶은 것");
		}else if(a == 3){
			System.out.println("a가 3인 경우에 하고 싶은것");
		}else{
			System.out.println("이외에 경우에 하고싶은 것");
		}
		
		// 조건을 한 묶음으로 사용하기 위해서는 반드시 else if를 사용해야한다.
		if(a < 10){
			System.out.println("a가 10보다 작다.");
		}else if(a < 20){
			System.out.println("a가 20보다 작다.");
		}
		// 주의사항 if와 else if 반드시 둘중 하나만 실행이 된다.
		// 그러나 if 뒤에 if가 붙으면 2개의 다른 조건이지, 한묶음이 아니다.
		// 위 if 가 실행되고 나서 if가 또 실행될 수도 있다는 이야기이다.
		// 따라서 else를 꼭 붙여야 한다.
	
		//시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
/*		int score = 70;
		
		if (score >= 60){
			System.out.println("합격");
		}else if(score <60){
			System.out.println("불합격");
		}
		
		//성적에 등급을 부여하는 프로그램을 만들어 봅시다.
		score = 80;
		String grade = null;
		if(90 <= score && score <= 100){
			grade = "A";
		}else if(80 <= score && score < 90){
			grade = "B";
		}else if(70 <= score && score < 80){ //굳이 작다는 표현을 하지 않아도 된다. 어차피 위에서 걸렀으니까.
			grade = "C";
		}else if(60 <= score && score < 70){
			grade = "D";	
		}else if(50 <= score && score < 60){
			grade = "F";
		};
		
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		*/
		int score = 47;
		String grade = null;
		if(90 <= score){
			grade = "A"; //a+와 a-는 이 둘다 이 그룹에 속해있기때문에 안에서 나눠야 한다.
			if(97 <= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if(80<= score && score < 90){//if(90) 조건이 끝난 이후 중괄호에 else if 를 붙여야 한다.
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(83 <= score){
				grade += "-";
			}
		}else if(70<= score){
			grade = "C";
			if(77 <= score){
				grade += "+";
			}else if(73<= score){
				grade += "-";
			}
		}else if(60<= score){
			grade = "D";
			if(67<= score){
				grade +="+";
				
			}else if(63<= score)
				grade +="-";
		}else if(score<60){ //else 만 써도 된단다. 아가야.
			grade = "F";
			
	};
	System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
	// 블럭지정하고 자동정렬 : ctrl + shift + f cf. 주석도 정렬되니까 블럭지정 꼭 하고 해라.
	
	/*String aaa;
	
	if(aaa.equals("교수님")){
		grade = "A"; //a+와 a-는 이 둘다 이 그룹에 속해있기때문에 안에서 나눠야 한다.
	}*/
	
	/* switch문 
	 * - switch(int/String){case 1: break;} default(else와 같다)  cf. if는 비교연산식이 들어왔었다. 
	 * 							조건식이 int다 하면 1을 실행, string이다 하면 스트링을 실행.
	 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
	 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
	 */
	
	a  = 1;
	switch(a){
	case 1:
		System.out.println("a가 1인 경우에 하고싶은 것");
		break;
	case 2:
		System.out.println("a가 2인 경우에 하고싶은 것");
		break;
	default:
		System.out.println("이외의 경우에 하고싶은 것");
	}
	
	String b = "a";
	switch(b){
	case "a":
		System.out.println("b가 \"a\"인 경우에 하고싶은 것" ); // && +a 하면 오류나는 이유?
		break;
	case "b" :
		System.out.println("b가 \"b\"인 경우에 하고싶은 것");
		break;
	default:
		System.out.println("이외 경우에 하고 싶은 것");
	}
	
//Q	case에 범위지정이 가능한가? 
//Q2 스트링에 or이나 and가 들어올 수 있는가? 방법은?
	
	
	//주워진 월에 해당하는 계정을 출력해봅시다.
	int month = 1;
	String season = null;
	
	switch(month){
	case 3:
	case 4:
	case 5:	
		season = "봄";
		break;
	case 6:
	case 7:
	case 8:
		season = "여름";
		break;
	case 9:
	case 10:
	case 11:
		season = "가을";
		break;
	case 12: case 1: case 2:
		season = "겨울";
		break;
	default:
			System.out.println("12보다 작거나 같은 수를 입력해주세요.");
	}
	System.out.println(season);
	
	score = 100;
	grade = null;
/*	switch(score){ //if는 조건식에 범위지정이 가능했다. switch는 정확히 일치하면 실행한다. 그럼 0점부터 100점이라면 case를 100개 만들어야 되지 않은가?
*/	//case 뒤에는 리터럴이나 상수가 와야 한다.
	//(score/10) 등급을 나눠줄 수 있다. 나누면
	switch(score/10){
	case 10 : case 9 :
		grade = "A";
		break;
	case 8 :
		grade = "B";
		break;
	case 7 :
		grade = "C";
		break;
	case 6 :
		grade = "D";
		break;
	default :
		grade = "F";
	}
	System.out.println(score + "점에 대한 등급은 " + grade + "입니다.");
	
	
	//boolean 타입의 &&나 ||는 올 수 없다. 
	//q if가 호환성이 더 좋은데 왜 switch를 쓰는가?
	//switch는 if 로 치환이 되나, if switch로 치환되지 않기도 한다.
	//그러나 같은 조건인 경우 if보다 switch가 속도가 더 빠르다. int와 string만 올 수 있기 때문에.
	
	//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
	
	Scanner sc = new Scanner(System.in);
	/*
	System.out.println("숫자를 입력해주세요.");
	int x = Integer.parseInt(sc.nextLine());
	String y;
	String z = sc.nextLine();
	
	
	switch(x) {
	case 0:
	y= "0입니다.";
		break;
	default:
		y ="0이 아닙니다.";

	*//*
	// 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
	
	System.out.println("숫자를 입력해주세요.");
	String ans;
	switch (x%2) {
	case 0:
		y = "짝수입니다.";
		break;
	case 1:
		y = "홀수입니다.";
	default:
	}
	
*/
	
	
/*	if (z.equals("hi")) {
		y = "안녕하세요";
	}else {
		y="안들려요";		
	}
	}
	System.out.println(y);
	
	int input = Integer.parseInt(sc.nextLine());
	if(input %2 == 1){
		System.out.println("홀수");
	}else{
		System.out.println("짝수");
	}*/
	
	//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
	//평균은 소수점 1자리까지
	/*
	System.out.println("첫번째 숫자를 입력해주세요");
	double a1 = Double.parseDouble(sc.nextLine());
	System.out.println("두번째 숫자를 입력해주세요");
	double a2 = Double.parseDouble(sc.nextLine());
	System.out.println("세번째 숫자를 입력해주세요");
	double a3 = Double.parseDouble(sc.nextLine());

	double total = a1 + a2 + a3;
	double avr = (a1 + a2 +a3)/3;
	avr = Math.round(avr);
	String grades = null;

	 int sum = a1 + a2 + a3
	 * double avr = Math.round(sum / 3.0 *10) / 10.0;
	
	if (90 <= avr && avr <= 100) {
		grades = "A";
	}else if (80<=avr) {
		grades = "B";
	}else{grades = "F";
	}
	
	System.out.println( "당신의 총점은 " + (int)total + "점" + "평균은 " + avr + "등급은 " + grades + "입니다.");
	
*/
 // -----------------------------------------------------------
	//랜덤발생
//	매써드 > Math.random() : 0.0 ~ 1.0 미만의 랜덤수 발생
	//100을 곱하면 0부터 99.9 까지 발생된다. 1부터 100까지 하고 싶으면 1부터 100이 된다.  
/*	소수점을 삭제하기 위해서 int 타입으로 바꿔준다. 
 * int random = (int)(Math.random()*100) +1;
	System.out.println(random);
*/	
	
	//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
	
	int ran1 = (int)(Math.random()*100) +1;
	System.out.println("첫번째 랜덤한 수를 발생합니다.");
	System.out.println(ran1);
	int ran2 = (int)(Math.random()*100) +1;
	System.out.println("두번째 랜덤한 수를 발생합니다.");
	System.out.println(ran2);
	int ran3 = (int)(Math.random()*100) +1;
	System.out.println("세번째 랜덤한 수를 발생합니다.");
	System.out.println(ran3);

	System.out.println("발생한 수의 오름차순은 다음과 같습니다.");
// 나의 오답
  	int bigger = 0; 
	int max = 0; 
	int mid = 0;
	int min = 0;
	
	if(ran1 > ran2){
		bigger = ran1;
	}
	if(bigger > ran3){
		max = ran1;
		mid = ran3;
		min = ran2;
	}
	else if(ran2 > ran3){
		max = ran2;
		mid = ran3;
		min = ran1;
	}
	else if(ran1 > ran3){
		max = ran2;
		mid = ran1;
		min = ran3;
	}
	else if(ran3 > bigger){
		max = ran3;
		mid = ran1;
		min = ran2;
	}
	else if(ran2 > ran3){
		max = ran2;
		mid = ran2;
		min = ran1;
	}
	if(ran1 > ran3){
		max = ran1;
		mid = ran2;
		min = ran3;
	}
	else{
		bigger = ran3;
		max = bigger;
		mid = ran2;
		min = ran1;
	}
	if(ran1 > ran3){
		mid = ran1;
		max = ran2;
		min = ran3;
	}else {
		mid = ran2;
		min = ran1;
		max = ran3;
	}	
	
	System.out.println(min + "=<" + mid + "=<" + max);
	
	// 1번에는 가장 작은 숫자를 적용한다. 3번 가장 큰 숫자를 적용한다.  
/*
	int num1 = (int)(Math.random()*100) +1;
	System.out.println("첫번째 랜덤한 수를 발생합니다.");
	System.out.println(num1);
	int num2 = (int)(Math.random()*100) +1;
	System.out.println("두번째 랜덤한 수를 발생합니다.");
	System.out.println(num2);
	int num3 = (int)(Math.random()*100) +1;
	System.out.println("세번째 랜덤한 수를 발생합니다.");
	System.out.println(num3);
	if(num1 > num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	if(num1 > num3){
		int temp = num1;
		num1 = num3;
		num3 = temp;
	}
	if(num2 > num3){
		int temp = num2;
		num2 = num3;
		num3 = temp;
	}
	System.out.println(num1 + "<" + num2 + "<" + num3);
	*/
	

	
	}
}

