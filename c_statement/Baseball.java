package c_statement;

public class Baseball {

	public static void main(String[] args) {
		//겹치지 않는 숫자 3개를 생각함. 그걸 맞추는 게임.
		/* 
		 * 생각 = 1,3,5aa
		 * 135
		 * 123 = 이라고 말함. 이 둘을 비교해서 스트라이크, 볼, 아웃을 만들어낸다. 
		 * 1이라는 숫자가 똑같은데 자리수도 똑같으면 스트라이크.
		 * 3이라는 숫자는 자리수가 다르다. 그러면 볼이 된다. 
		 * 2는 아예 없다. 그러면 아웃이다.
		 * 123 : 1S 1B 1O
		 * 531 : 1S 2B 0O
		 * 321 : 0S 2B 1O
		 * 
		 * 625 : 1S 0B 2O
		 * 613 : 0S 0B 3O 6도 5도 아니다. 
		 * 729 : 1S 0B 2O 2가 스트라이크
		 * 428 : 정답?
		 * 
		 */
		
		int num1 = (int)(Math.random()*9)+ 1;
		int num2 = (int)(Math.random()*9)+ 1;
		int count =0;
		System.out.println(num1 +""+num2+ "" +"최초1단계" );
		
		while (num1 == num2){
			num1 = (int)(Math.random()*9)+ 1;
			num2 = (int)(Math.random()*9)+ 1;
			count++;
			}
		int num3 = (int)(Math.random()*9)+ 1;
		System.out.println(num1 +""+num2+ "" +num3 +"" +count+"초안 2단계" );
		
		while (num1 == num3){
			num3 = (int)(Math.random()*9)+ 1;
			count++;
			}
		System.out.println(num1 +""+num2+ "" +num3 +"" +count+"초안 3단계" );
		
		while (num2 == num3){
			num3 = (int)(Math.random()*9)+ 1;
			count++;
			}
		
		System.out.println(num1 +""+num2+ "" +num3 +"" +count );

	/*	
		int num3 = (int)(Math.random()*9)+ 1;
		
		while (num1 == num2){
			num2 = (int)(Math.random()*9)+ 1;}
		
		System.out.print(num1 +""+num2+ ""+num3 +"나중");
			
			}*/
			
		

	} //main
} //class
