package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/* 
		 * 정렬
		 * -석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * 내 점수의 등수는 다른사람과 비교하기 전에는 내가 1등이다. 
		 * 나보다 점수가 높은사람이 있으면 등수를 증가시킨다. >2등.
		 * 이러면 내 등수만 나온다. 다른 사람들의 등수는 안나온다.다른사람도 비교를 해야한다.
		 * -선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * -버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * -삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식
		 * 
		 */
/*		int[] arr = new int[10];
		for(int i=0; i < arr.length; i++){
			arr[i]= (int)(Math.random()*100) +1;
		}	
		System.out.println(Arrays.toString(arr));		
*/		
		//석차구하기
/*		int[] rank = new int[arr.length];
		//전체 0이 저장되어있는 상황.
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}//전체 1이 저자되어있음.
		//내꺼 + 남들꺼 비교하려면 중첩 for문 2개가 필요하다.
		for(int i = 0; i <arr.length; i++){
			for(int j =0; j <arr.length; j++){
				if(arr[0]<arr[0]){//비교를 위해 조건문 사용 나보다 높으면 등수를 1만큼 등수 증가.
					rank[i]++; 		//1만큼 증가시켜.
				}
			}
		}//i가 나, j가 다른 모든 사람.
		//0일때도 1일때도,j가 0부터 9까지 돈다. 
		
		System.out.println(Arrays.toString(rank));*/
		
		//선택정렬
//		나의 오답		
/*		for(int i=0; i<10; i++){
			int min = arr[0];
			int max = arr[arr.length];
			if(min < arr[i]){
 			int temp = min;
 			min = arr[i];
 			arr[0] = temp;
 			
			}if(max < arr[i]){
				int temp = max;
				max = arr[i];
				arr[9] = temp;			}
		}
 			
 		
  			int min = arr[8];
			int max = arr[9];
				if(arr[i] < min){
				min = arr[i];
			}
			if(min < arr[i]){
				max = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}if(max > arr[i]){
				min = arr[i];
			}
			if(arr[0]>arr[i]){
				int temp = arr[0];
					arr[0] = arr[i];
					arr[i] = temp;
			}else if(arr[i]>arr[9]){
				int temp = arr[i];
						arr[i] = arr[9];
				arr[9] = temp;
			}			
				
			
			
			//어제부터 고민인것, i값이 딱 arr.length까지 하려면 어떻게?
		 
		System.out.println(Arrays.toString(arr));*/
		
	/* 선택정렬.
	 * i,j?
	 * 0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9
	 * 1,2 1,3 1,4 1,5 1,6 1,7 1,8 1,9
	 * 2,3 2,4 2,5 2,6 2,7 2,8 2,9
	 * 3,4 3,5 3,6 3,7 3,8 3,9
	 * 4,5 4,6 4,7 4,8 4,9
	 * 5,6 5,7 5,8 5,9
	 * 6,7 6,8 6,9
	 * 7,8 7,9
	 * 8,9	
	 */
		
		
/*해답	for(int i = 0; i < arr.length -1; i++){ // 값이 중요한게 아니라 위치가 중요한거다.
			int min = i; // 최소값을 찾는게 아니라 최소값이 있는 위치를 찾아야 한다. 
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[min]){ 값비교는 당연히 인덱스 값.
					min = j; // 최소값을 만나면 최소값의 인덱스를 저장한다. 
				}
			}
		int temp = arr[i]; // 자리바꾸기.
		arr[i] = arr[min];
		arr[min] = temp;
	} System.out.println(Arrays.toString(arr));*/
		
/*		int[] arr = new int[10];
		for(int i=0; i < arr.length; i++){
			arr[i]= (int)(Math.random()*100) +1;
		}	
		System.out.println(Arrays.toString(arr));		*/
		
		/* 버블정렬.
		 * i,j?
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7
		 * 0,1 1,2 2,3 3,4 4,5 5,6
		 * 0,1 1,2 2,3 3,4 4,5 
		 * 0,1 1,2 2,3 3,4 
		 * 0,1 1,2 2,3 
		 * 0,1 1,2 
		 * 0,1 
		 */
		//버블정렬은 한바퀴 돌동안 자리를 한번도 바꾸지 않으면 종료해버린다. 염두. 
		
/*나의 오답
 * 		for(int i=0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				int k = j-1;
				if(arr[k] > arr[j]){
					int temp = arr[j];
						arr[j] = arr[k];
						arr[k] = temp;
				
				}
				}
			}System.out.println(Arrays.toString(arr));*/
		
	//해답

/*오답		for(int i = 0; i < arr.length -1; i++){ //9번 돌기때문에 -1을 해줘야 한다.
			int count=0;	
			for(int j=0; j <arr.length -i -1; j++){//증가하는 수를 빼야 한다.i 근데 j가 8까지만 돈다 그래서 -1
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; //1차 정렬은 여기까지. 한바퀴 는 안쪽의 for문이 도는 것. 자리를 한번도 바꾸지 않으면 브레이크. 
					count++;
					} 
				
			}System.out.println(count + Arrays.toString(arr));
			if(count == 0){break;
			}
		}System.out.println("Final" + Arrays.toString(arr));*/
		
/*		for(int i = 0; i < arr.length -1; i++){ //9번 돌기때문에 -1을 해줘야 한다.
			boolean flag = false;	 // 확인시에는 보통 불린을 쓴다. 2개 밖에 없지않아?
			for(int j=0; j <arr.length -i -1; j++){//증가하는 수를 빼야 한다.i 근데 j가 8까지만 돈다 그래서 -1
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; //1차 정렬은 여기까지. 한바퀴 는 안쪽의 for문이 도는 것. 자리를 한번도 바꾸지 않으면 브레이크. 
					flag = true; // if문에 들어왔는지 아닌지 확인하는 방법
					} 
				
			}if(flag == false){ // if를 한번도 거치지 않았다면 계속 false 일 것이다. 따라서 if false면 break. 
				break; //== !flag라고 표현해도 된다. false 나 true. ! 붙여서 표현이 가능하다. 
			}
		}System.out.println("Final" + Arrays.toString(arr));*/
		
		/*삽입정렬
		 * 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식
		 * 큰수가 뒤로와서 빈칸이 생기면 뒤로 하나씩 밀고 빈자리를 그 숫자가 채우는 방식.
		 * 더 작은 수를 만나면 정렬을 끝내고 빈자리를 찾아감. 
		 */
/*		int[] arr = new int[10];
		for(int i=0; i < arr.length; i++){
			arr[i]= (int)(Math.random()*100) +1;
		}	
		System.out.println(Arrays.toString(arr));		*/
		

		
		
		/* defualt?
		 * for duble.
		 * for(int i =1; i <arr.length; i++){
		 * for(int j =1; j <arr.length; j++){}}
		 * 
		 * 0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9
		 * 1,1 1,2 1,3 1,4 1,5 1,6 1,7 1,8 1,9
		 * 2,1 2,2 2,3 2,4 2,5 2,6 2,7 2,8 2,9
		 * 3,1 3,2 3,3 3,4 3,5 3,6 3,7 3,8 3,9
		 * 4,1 4,2 4,3 4,4 4,5 4,6 4,7 4,8 4,9
		 * 5,1 5,2 5,3 5,4 5,5 5,6 5,7 5,8 5,9
		 * 6,1 6,2 6,3 6,4 6,5 6,6 6,7 6,8 6,9
		 * 7,1 7,2 7,3 7,4 7,5 7,6 7,7 7,8 7,9
		 * 8,1 8,2 8,3 8,4 8,5 8,6 8,7 8,8 8,9
		 * 9,1 9,2 9,3 9,4 9,5 9,6 9,7 9,8 9,9
		 */
		
/*		index[2]가  in[1]과 비교, 크면 그대로.
 * 		ind[3]가 in[1], in[2]와 비교, 크면 인3에.
 */
	
/*		int[] a = new int[3];
		a[0] = 6;
		a[1] =5;
		a[2] =2;	
		System.out.println(Arrays.toString(a));

		if (a[0] > a[1]) { //6 > 5
			int temp = a[1]; // 6 > ㅁ
			a[1] = a[0]; // ㅁ > 5
			a[0] = temp; // 6 > 5
		}
		if (a[1] > a[2]) { // 6 > 2
			int temp = a[2]; // 6 > ㅁ
			a[2] = a[1]; // ㅁ > 6
			a[1] = temp; // 2 > 6
		}
		if (a[0] > a[1]) { // 5 > 2
			int temp = a[1]; // 5 > ㅁ 
			a[1] = a[0]; // ㅁ > 5
			a[0] = temp; // 2 > 5
		}

		System.out.println(Arrays.toString(a));*/
		
		
/*해답
		*1,0
		*2,1 2,0
		*3,2 3,1 3,0
		*4,3 4,2 4,1 4,0
		*5,4 5,3 5,2 5,1 5,0
		*6,5 6,4 6,3 6,2 6,1 6,0
		*7,6 7,5 7,4 7,3 7,2 7,1 7,0
		*8,7 8,6 8,5 8,4 8,3 8,2 8,1 8,0
		*9,8 9,7 9,6 9,5 9,4 9,3 9,2 9,1 9,0
		
	
		for(int i=1; i < arr.length; i++){ //사라지는걸 막기위해 i를 저장해 놓고 시작.
			int temp = arr[i]; // j가 밀리면 i가 없어질 수도 있기때문에 
			//int j =0;
			for(int j=i-1; j>=0; j--){ //int를 삭제한다. 
				if(temp < arr[j]){ // 따라서 여기서도 temp arr[i]랑 비교가 아니라 temp와 비교해야한다. 
				arr[j+1] =arr[j];
				}else{
				break;					//뒤로 밀고 빈자리에 끼워 넣어야 한다. 경우의 수는 2가지 작은수를 만났을때, 반복이 끝났을때.
				}
			}
		}arr[j+1] = temp; */
		
		
/*		for(int i=1; i < arr.length; i++){ 
			int temp = arr[i]; 
			int j =0;
			for(j=i-1; j>=0; j--){ 
				if(temp < arr[j]){ 
				arr[j+1] =arr[j];
				}else{
				break;					
				}
			}arr[j+1] = temp;
		}
		System.out.println(Arrays.toString(arr));*/
		//정렬을 하기 위한 방법을 생각해 내는 것을 연습하는 것이다. 
		
		
		
		
		
	}

}
