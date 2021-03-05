package e_oop.orient;

public class UserDefinedDataType { //다른 패키지에 있는 클래스를 사용하기 위해 그 위치를 알려주는 것.

	public static void main(String[] args) {//여기부터 클래스의 범위
		/* 
		 * 클래스.
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다.(기본형 -> 배열 -> 클래스)
		 * - 서로다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다. 
		 * 조금 복잡한 데이터라고 보면 된다.
		 */
		/* 1. package e_oop;패키지. 이 클래스의 위치를 알려준다.
		 *  ** 이 위치에는 임포트도 있을 수 있었다. 반드시 클래스와 패키지 사이에 있다. 
		 *  java.util.Scanner;
		 *  ** 임포트. 클래서 안에서 이미 만들어 져 있는 다른 클래스를 사용하고 싶으면 끌어온다.
		 *  원래는 같은 패키지에 있는 클래스만 사용할 수 있는데, 다른 패키지를 끌어오고 싶으면 위치를 알려줘야 한다.
		 *  어느 패키지에 있는 무슨 클래스.
		 *  하나의 설계도라고 보면 된다. 우리는 설계도대로 만들어진 물건을 가져다 쓴다.
		 *  클래스의 내용이 메모리에 올라간게 객체다.
		 *  객체생성은 메모리에 올라가면 사용 할 수 있다.
		 * public class UserDefinedDataType {//나중에 배운다.
		 * public static void main(String[] args)
		 * 2. 
		 */
		//기본형 변수
		int kor=0;
		int eng=0;
		int math=0;
		int sum;
		double avg;
		String name;
		
		//배열을 사용하면
		int[] scores = {kor, eng, math};//cf.변수값을 지정해야 배열에 들어간다.?
		
		int sum2;
		double avg2;
		String name2;
	
		//클래스 *아래 클래스를 만들었다.
		Student student; //클래스를 변수처럼 사용해버렸다. 사용하려면 초기화를 해야한다.
		student = new Student(); // 객채 생성(인스턴스화)
		//      = new  타입(타입이 스튜던트다 지금)() <- 초기화
		
		//여기서 .은 참조연산자다. 	
		student.kor = 80;
		student.eng = 90;
		student.math = 60;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name= "홍길동";
		
		
		System.out.println(student.name);
		System.out.println(student.avg);
		
		Student student2 = new Student(); //객체생성을 하면 메모리에 스튜던트가 2명이다. 
		//View menu package presentation hierarchical클릭
		
		
	}

}
	
		
		
class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	
	
}
