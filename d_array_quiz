package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
/*		int money = (int)(Math.random()*500)*10;
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("거스름돈 : " + money);*/
		
		//거스름돈 3200원을 만드세요.
		
/*		int change = 3200;*/
/*		int[] count = new int[4];
		int howmany = 0;
		for(int i=1; i < coin.length; i++){
			int mot = change%coin[i-1];
			int res = change - (mot*coin[i-1]);
				count[i-1] = howmany++;
			if(res == 0){
				break;
				}
		}			
		System.out.println(Arrays.toString(count));
*/
//		규칙을 못찾겠으면 날코딩을 해라.
/*		int count = money/coin[0];
		money = money % coin[0];
		
		
		
			System.out.println(coin[0]+"원 : " + count + "개");
		count = money / coin[1];
		money = money % coin[1];
			System.out.println(coin[1]+"원 : " + count + "개");
		count = money / coin[2];
		money = money % coin[2];
			System.out.println(coin[2]+"원 : " + count + "개");
		count = money / coin[3];
		money = money % coin[3];
			System.out.println(coin[3]+"원 : " + count + "개");*/

		
		
/*		for(int i = 0; i < coin.length; i++){
			int count = money/coin[i];
			money = money % coin[i];
			System.out.println(coin[i]+"원 : " + count + "개");
		}*/
		
		
		
		/* 거스름돈에 동전의 단위마다 몇개ㅢ 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 1원 : 1개
		 * 
		 * 
		 * 
		 */
		
/*오답		int[]arr = new int[20];
		int[] count = new int[5];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
			if(arr[i] == 1){			
				count[0]++;
			}
			if(arr[i] == 2){			
				count[1]++;
			}
			if(arr[i] == 3){			
				count[2]++;
			}
			if(arr[i] == 4){			
				count[3]++;
			}
			if(arr[i] == 5){			
				count[4]++;
			}
		}System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(count));
		
			for(int i = 0; i < count.length; i++){			
		if(count[i] == 1){
			System.out.println("*");
		}if(count[i] == 2){
				System.out.println("**");
		}if(count[i] == 3){
					System.out.println("***");
		}if(count[i] == 4){
						System.out.println("****");
		}if(count[i] == 5){
			System.out.println("*****");
		}if(count[i] == 6){
			System.out.println("******");
		}if(count[i] == 7){
			System.out.println("*******");
		}if(count[i] == 8){
			System.out.println("********");
		}if(count[i] == 9){
			System.out.println("*********");
			}
		}*/
		
						
/*		int[]arr = new int[20];

		for(int i = 0; i < arr.length; i++){
		arr[i] = (int)(Math.random()*5)+1;}
		System.out.println(Arrays.toString(arr));

		
		 * 1~5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * 1:*** 3
		 * 2:**** 4
		 * 3:** 2
		 * 4:***** 5
		 * 5:*1 
		 
		int[] count = new int[5];
		for(int i = 0; i < arr.length; i++){
			count[arr[i] -1]++;
		}System.out.println(Arrays.toString(count));
		
		for(int i = 0; i < count.length; i++){
			System.out.print(i+1+":");
			for(int j =0; j <count[i]; j++){
				System.out.print("*");
			}System.out.println(" "+count[i]);
		}
		
		*/
		
		
		int[]arr=new int[10]; 
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		/* 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 * [5,5,3,5,2,2,2,5,5,5]
		 * [5,3,2]
		 */
		int count = 0; //8. 저장할 변수하나 만든다.
		int[] temp = new int[5]; //정답으로 사용하는 배열이 아니라, 임시로 사용하는 배열. 몇개가 될지 모른다. 5개가 될지 4개가 될지 모른다.
		for(int i = 0; i < arr.length; i++){//중복이 temp 배열에 있는지 없는지 확인하고 넣어라.
			boolean flag = false; // 4. 찾아보려면 yes or no 찾자
			
			for(int j=0; j < temp.length; j++){ //만약에 temp 배열에 값이 있으면 안된다.를 표현
				if(arr[i] == temp[j]){
					flag = true; // 5. 만든다
				}
			}
			if(!flag){ // 6. if문을 꾸민다,
				temp[count++] =arr[i];  // 7.temp의 저장 수를 모른다. i,j를 사용할 수가 없어서 새로운 변수를 만들어야 한다. 
			}
		}System.out.println(Arrays.toString(temp)); // 9. 배열의 길이가 달라지면 마지막이 빈다. 따라서 하나 줄여줘야 한다.
			
		int[]result = new int[count]; //10. 새로운 배열은 count의 수와 동일하다. 
		for(int i = 0; i < result.length; i++){ //
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
	}

}
