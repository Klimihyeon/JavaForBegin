package e_oop.orient;

import e_oop.score.Student;

public class Homework {

	public static void main(String[] args) {
		// 객체생성과 생성자는 무엇인가? 를 알아보세요. from net.
		Student[] students = new Student[10];
		/*객체?
		 * 클래스에 정의된 내용대로 생성된 것.
		 * 객체는 속성과 동작으로 이루어져 있다.
		 * 특징 : 클래스의 타입으로 선언되었을 때 객체라고 부른다.
		 * 클래스로부터 만들어진 객체를 클래스의 인스턴스라고도 부른다.
		 * 연관되어있는 것들끼리 그룹핑 -> 객체지향.
		 * 로직이 연관되어있고, 반복적이다. = 메쏘드화 시킨다.
		 * 구체적인 객체를 만드는것. 인스턴스화.
		 * 객체 = 독립된 프로그램이다. 변수와 메소드의 집합인것이다.
		 * 클래스는 설계도, 인스턴스는 제품.
		 * 객체 = 상태와 행위의 집합.
		 * 생성자 = 객체를 생성할때 호출되는것.
		 * 
		 */
for(int i =0; i<students.length; i++){
		Student student = new Student();
		//	() 소괄호가 붙으면 매써드다. 
		students[i] = student;
}
	//매써드명이 클래스명과 동일하고 리턴 자료형이 없는 메소드를 생성자라고 한다. ??????????
	//생성자 생성규칙 1. 클래스명과, 매써드 명이 동일하다. 2. 리턴타입을 정의하지 않는다. *생성자는 객체가 생성될때 호출된다. 
	//생성자는 new라는 키워드가 사용될때 호출된다. 

	}

}
