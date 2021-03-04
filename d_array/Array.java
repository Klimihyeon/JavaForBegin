package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다.
		 * 배열은 하나의 데이터 구조인데, 데이터가 여러개 묶여 있는 것을 말한다. for 편리성 
		 * 같은 파일의 데이터만 묶어서 사용 할 수 있다. 다른건 안되요. 가능한 이유는 참조형 타입이기 때문.
		 * 처음에 몇개를 저장할지 갯수를 정해놓고 만든다.  
		 */
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		// 	new는 공간을 만든 다음에 주소를 만든다. 
		// int[5] : int 5개를 저장할공간을 만들겠다. 5를 배열의 길이 혹은 배열의 크기라고 한다.
		// 배열 초기화시  5개의 공간에 기본값이 들어가있다. 
		/*
		 * 기본값 : 내가 저장하지 않았을때 저장되는 값
		 * byte, short, int, long : 0
		 * float, double : 0.0
		 * char : ' '(0)
		 * boolean : false
		 * 참조형 : null
		 */
		
		/* 
		 * 변수 = 주소
		 * 주소 {0, 0, 0, 0, 0}
		 */
		//외 초기화하는 방법#2
		
		array = new int[]{1,2,3,4,5}; // 1,2,3,4,5의 값이들어가 있는 상태이다.
		
		/*//외 초기화하는 방법#3
		int[] array2 = {1, 2, 3, 4, 5}; //선언과 초기화를 동시에 해야 한다. 
		//컴파일 에러가 뜬다면 선언을 같이 안한사항이다.
		
		System.out.println(array[0]); // 여기서 나오는 숫자를 인덱스라고 한다. 
		System.out.println(array[1]); // 인덱스는 0부터 시작한다. 인덱스는 +1씩 증가합니다.
		System.out.println(array[2]); // 3출력
		System.out.println(array[3]); // 4출력
		System.out.println(array[4]); // 5출력
*/		
		//배열의 값을 저장할때
		array[0] = 10; //변수에 인덱스를 붙이고 저장하고 싶은 값을 넣어줘라. 
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		//비슷한 문장이 반복문으로 표현되면 더 좋지 않을까?
/*		for(int i = 0; i < array.length; i++){ //length 변수 : 배열의 길이가 몇인가를 저장하는 변수
			System.out.println(array[i]); // i가 4가 될떄까지 돌아서 출력.
		}
		
		//저장법도 간단.
		for(int i = 0; i < array.length; i++){
			array[i] = i*10+10; // (i + 1)*10;
			System.out.println(array[i]);
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화해주세요
		for(int i = 0; i < array.length; i++){
						// 배열의 모든 인덱스에서 1~100 사이에 랜덤한 값을 저장해주세요.
			
			array[i] = (int)(Math.random()*100 + 1);
			System.out.println(array[i]);}*/
		
			
		//해답
/*			int[] randoms = new int[10];
			
			for(int k = 0; k <randoms.length; k++){
				randoms[k] = (int)(Math.random()*100) +1 ;
			}
			System.out.println(Arrays.toString(randoms));
		
			// 배열에 저장된 모든 값의 합계와 평균을 구해주세요.
*/			/*오답연구중
			int[] randoms = new int[10];
			
			for(int k = 0; k <randoms.length; k++){
				randoms[k] = (int)(Math.random()*100) +1 ;
				for(int l = 1; l <= randoms.length; l++){
					int sum = ++k;
						double avg = (int)(sum/randoms.length);
				int[] sums = new int[k];
				sum[] = ++k;

				}
			}
			System.out.println(Arrays.toString(randoms));
			System.out.println();*/
		//해답
/*			int[] randoms = new int[10];
			for(int k = 0; k <randoms.length; k++){
				randoms[k] = (int)(Math.random()*100) +1 ;
			System.out.println(randoms[k]);
			}System.out.println(Arrays.toString(randoms));*/

/*			sum += randoms[0]; 
			sum += randoms[1]; 
			sum += randoms[2]; 
			sum += randoms[3]; 
			sum += randoms[4]; 
			sum += randoms[5]; 
			sum += randoms[6]; 
			sum += randoms[7]; 
			sum += randoms[8];
			sum += randoms[9]; */
			
/*			int sum = 0;
			for(int i = 0; i < randoms.length; i++){
				sum += randoms[i];
			}	double avg = Math.round((double)sum  / randoms.length*10) / 10.0;
			
				System.out.println("sum :"+ sum + " / avg" + avg);			*/	

			// 구하고 싶은게 있으면 구하고 싶은 변수를 만들어라.
			// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
			
			//나의 오답
/*			int max = randoms[0]; // 0번 인덱스의 값을 만들어라.
			int min = randoms[0]; // 
			for(int i = 0; i < randoms.length; i++){
				if( min < randoms[i] ){
					min = randoms[i];
					}
				if(max > randoms[i]){
					max = randoms[i];
					}
				}
			
				System.out.println("max :" + max + " / min" + min);				
*/
			//해답
/*			int min = randoms[0];
			int max = randoms[0];
			for(int i = 0; i < randoms.length; i++){
				if(randoms[i] < min){
					min = randoms[i];
				}
				if(max < randoms[i]){
					max = randoms[i];
				}
			}
			System.out.println("min : " + min + " / max : " + max);*/
			
			//
/*			int[] shuffle = new int[10];
			for(int i =0; i < shuffle.length; i++){
				shuffle[i] = i+1;
			}
			System.out.println(Arrays.toString(shuffle));			*/
			//배열의 값을 섞어주세요.
			//랜덤인덱스와 0번 인덱스의 자리를 바꿔주세요.(여러번 반복)
			
/*나의오답			for(int i = 0; i < shuffle.length; i++){
				int ran = (int)(Math.random()*9)+1;
					int temp =  shuffle[0];
					shuffle[i] = shuffle[ran];
					shuffle[temp] = shuffle[i];
					shuffle[0] = shuffle[temp];*/
/*					int temp1 = shuffle[i];
			int temp2 = shuffle[i+1];
			int temp3 = shuffle[i-1];

		System.out.println(ran);}
			System.out.println(Arrays.toString(shuffle));*/

		/*
	for(int i =0; i < shuffle.length; i++){
	shuffle[ran] = shuffle[i];
	System.out.println(Arrays.toString(shuffle));}		
	*/
			
	/*해답	for(int i = 0; i < shuffle.length*10; i++){ // 10을 곱한 이유는 많이 반복하기 위해서.
				int ran = (int)(Math.random()*shuffle.length); // 0부터 9 뽑기
					int temp =  shuffle[0];
					shuffle[0] = shuffle[ran];
					shuffle[ran]= temp;
				}*/
			

			
					//1~10사이의 랜덤갑을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
/*
		int ran = 0;
		int count1 = 0;
		int count2 = 0;
		int ct[] = new int[0];
		int[] shuffle = new int[10];
		*/
			/*		for(int i=1; i<499; i++){
					ran = (int)(Math.random()*10)+1;
					for(int k = 0; k<=shuffle.length; k++){
					if(k == ran){ 
						ct[k]= count++;}}
					}
								System.out.println(Arrays.toString(shuffle)+Arrays.toString(ct));
								
		for(int i=1; i<499; i++){
			ran = (int)(Math.random()*10)+1;}
		if(1 == ran){ count1++;}
		if(2 == ran){ count2++;}
		

		for(int k =1; k<shuffle.length; k++){
		if(k == ran){ ct[k]++;
		}}
		System.out.println(Arrays.toString(shuffle)+Arrays.toString(ct));
		*/
/*		System.out.println("1은 몇번 나왔는가?" + count1 + " / 2는?"+count2);
*/								
								
				/*System.out.println(Arrays.toString(shuffle));
			*/
		
				/*if(ran == k){			
				shuffle[k] = ran;
				ct++;
				System.out.println(ct+k);			}

		int[] counts = new int[10];
		for(int i =0; i <500; i++){
			int random = (int)(Math.random()*10) +1;
			//1 -> counts[0]
			//2 -> counts[1]
			//3 -> counts[2]
			//...
			counts[random-1]++;
		}
			System.out.println(Arrays.toString(counts));*/
			
		// 1번 몇번 2번 몇번 이런식으로 하려면 for문 돌려서 하나씩 ???
			//1~10 사이의 랜덤값 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요
		      
/*		      //방법1. result 변수에 값을 증가
		      int[] randomCount = new int[500];
		     // int[] count = new int[]{1,2,3,4,5,6,7,8,9,10};
		      int[] result = new int[10];
		      //랜덤함수 500 출력
		      for(int i = 0; i < randomCount.length; i++){
		         randomCount[i] = (int)(Math.random() * 10)+1;
		         result[randomCount[i]-1]++;
		      //}
*/      
		      
		   
		      
		      
/*		      //500개의 배열과 숫자 비교할 배열에 따라 결과 카운트 증가
		      //방법2** 뽑은 배열과 비교할 배열에 따라 결과 배열에 카운트 증가
		      for(int i = 0; i < randomCount.length; i++){
		         for(int j = 0; j < count.length; j++){
		            if(randomCount[i]==count[j]){
		               result[j]++;
		            }
		         }
		      }
		      
		      
		      //방법3** 뽑자마자 결과 배열에 카운트 증가
		      int[] result = new int[10];
		      for(int i = 0; i < 500; i++){
		         result[((int)(Math.random() * 10)+1)-1]++;//1~10
		         
		          //방법 4** 변수로 받음
		           int random = (int)(Math.random()*10)+1;
		           count[random - 1]++;
		         
		      }
		      
		      //결과출력
		      System.out.println(Arrays.toString(result));
		      for(int i = 0; i < result.length; i++){
		         System.out.println(i+"개수 : "+result[i]);*/
		    //  }
			
			
	}

}