package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		/*
		 * 에러
		 * -컴파일 에러 : 컴파일 시에 발생디는 에러(빨간줄)
		 * -논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * -런타임 에러 : 실행 시에 발생되는 에러
		 *
		 * 런타임 에러
		 * - 런타임 에러 바생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리 불가)
		 * - 예외 : 프로그램 코드에의해서 수습 딜 수 있는 다소 미약한 오류(처리 가능)
		 *
		 * 예외
		 * - 모든 예외는 exception 클래스의 자식 클래스이다.
		 * - runtimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 * - [runtimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다.
		 * 
		 * 예외처리(try - catch)
		 * - 예외처리를 통해 플그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try{} catch(exception e){}
		 * - try 블럭 안의 내용을 실행중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 () 안에는 처리할 예외를 지정해줄 수 있다. 파라미터를넣는 부분.
		 * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭 안의 내용이 수행된 후 try -catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch 가 업승ㄹ 경우 예외는 처리되지 않는다.
		 */
		
		try{
			int result = 10 / 0;  //Exception in thread "main" java.lang.ArithmeticException: / by zero
								//at h_exception.ExceptionHandling.main(ExceptionHandling.java:34)
			System.out.println(result); //얘가 실행하는건 아니다. 
		}catch(ArithmeticException e){ //일치하는 예외를 찾음 
			e.printStackTrace(); //try에서 한가지 예외만 발생하는 것은 아니다.
		}catch(NullPointerException | IndexOutOfBoundsException e){ //2가지 예외를 한번에 처리 가능.
			//IndexOutOfBoundsException
			int[] arr = new int[10];
			System.out.println(arr[10]);
			//NullPointerExcaption
			String str = null;
			System.out.println(str.equals(""));
			
			
		}catch(Exception e){ //모든 예외의 부모클래스 다 한꺼번에 처리
			
		}
		
		//어떤 경우에 주로 예외처리를 하는가?
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //<- 예외처리를 해주지 않아서 생기는 컴파일 에러기때문에 ctrl 1 눌러봐라>
		//Srround with try/catch 얘네들이 나오면 무조건 예외처리 해야한다. 선택하면 끝이다.
		//java.lang.패키지에 있는 애들은 임포트를 안해도 된다. 
		
		
		
		/*
		 * CallStack
		 * |			 |
		 * |___test2()___|
		 * |___test1()___|
		 * |___main()____|
		 * 위에는 뚫려있고 밑에는 막혀있는구조이다.
		 * java.lang.ArithmeticException: / by zero
				at h_exception.ExceptionHandling.main(ExceptionHandling.java:34)
			Exception in thread "main" java.lang.ArithmeticException: / by zero
				at h_exception.ExceptionHandling.test2(ExceptionHandling.java:65)
				at h_exception.ExceptionHandling.test1(ExceptionHandling.java:61)
				at h_exception.ExceptionHandling.main(ExceptionHandling.java:55)
				멘위를 클릭해서 들어가라.
		 */
		test1();
		
		
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
//		System.out.println(10 / 0);
		
		try {
			new FileInputStream(""); //자동완성하면 임포트까지 다 된다. 
		} catch (FileNotFoundException e) {

			e.printStackTrace(); 
			/*
			 * java.lang.ArithmeticException: / by zero
				at h_exception.ExceptionHandling.main(ExceptionHandling.java:37)
					java.io.FileNotFoundException: 
						at java.io.FileInputStream.open(Native Method)
						at java.io.FileInputStream.<init>(FileInputStream.java:146)
						at java.io.FileInputStream.<init>(FileInputStream.java:101)
						at h_exception.ExceptionHandling.test2(ExceptionHandling.java:88)
						at h_exception.ExceptionHandling.test1(ExceptionHandling.java:81)
						at h_exception.ExceptionHandling.main(ExceptionHandling.java:75)
						자바가 틀리진 않았다는거다. 그 아래 내꺼가 잘못됐겠지. 잘못썼겠지.
						위에서부터 차근차근찾아봐라.,

			 */
		}  
	}
}
