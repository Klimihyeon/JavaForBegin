package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

public static void main(String[] args) {
	

	/*
	 * finally
	 * - 필요에따라 try-catch 뒤에 finally 를 추가할 수있다.
	 * - finally 는 예외의 발생여부와 상관없이 가장 마지막에 수행딘다.
	 * --무조건 실행해야하는 친구
	 * 자동자원반환
	 * -try(변수 선언; 변수 선언) {} catch(exception e) {}
	 * - 사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면 try 블럭 종료시 자동으로 반환된다.
	 */
	
	FileInputStream fis = null;
	try {
		fis = new FileInputStream("d:/file.txt");	//외부 리소스를 갖다 쓰는데 반환하지않으면 리소스 메모리 낭비다. 

		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} finally {
		try {
			fis.close();
		} catch (Exception e) { //IO Exception 을 그냥 exception으로 바꿔줘라

			e.printStackTrace();
		} 
	} // 근데 close라는 문장 하나때문에 이렇게 하는건 너무 비효율적이다. close를 자동으로 반환해주는게?
	
	//자동자원 반환(JDK1.7) 
	try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
		String str = "아무내용이나 글을 적어봅니다...";
		
		byte[] bytes = str.getBytes();
		for(int i = 0; i <bytes.length; i++){
			fos.write(bytes[i]);
		}
	}catch (Exception e){
		e.printStackTrace();
	}
	
	
}	
	
}
