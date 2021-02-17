package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
/*		 
		 * 다차원 배열
		 * -배열안에 배열이 저장되어 있는 형태이다.
		 * 주로 2차원까지만 사용을 한다.
		 
		//2차원
		int [][] array2;
		
		//3차원
		int[][][] array3;
		
		 2차원배열의 형태
		 * 변수 : 주소1
		 * 주소1: {값, 값} >> 1차원 배열
		 * 주소1: {주소2, 주소3} >> 2차원배열
		 * 주소2: {값, 값} >>주소를 참조해서 들어가면 값이 있다.
		 * 주소3: {값, 값}
		 
		
		int [][] arr = new int[2][3]; // 2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
		int arr2[][] = new int[][]{{1,2,3}, {4,5,6}}; //값의 개수로 배열의 길이가 정해진다.
		int[] arr3[] = { {1,2,3}
						,{4,5,6}
						,{7,8,9} }; //선언과  초기화를 동시에 해야한다. 
		
		int[][] arr4 = new int[3][]; // 가변배열
		arr4[0] = new int[3];
		arr4[1] = new int[5];
		arr4[2] = new int[10]; // 이렇게 하면 각각의 배열도 서로 길이가 다르게 사용 가능.

		System.out.println(arr[0][1]); // arr[0] 이렇게 1차원까지만 넣으면 값이 아니라 배열이다.
										//1차원만 출력하면 이상한 값이 나온다.(주소다 저게)
										//2차원 배열을 사용하고 싶으면 2차원까지 접근해야 한다.
//		arr[0] = 10; // 1차원만 접근하면 값을 저장할 수가 없다.
		arr[0] = new int[5]; // 배열을 저장해야 한다.
		arr[0][0] = 10; // 2차원에 값을 저장할 수 있다. 
		arr[0][1] = 20;
		arr[1][0] = 100;
		// 1차원은 배열이고 2차원에 값이 들어있다는 것을 생각하라.
		
		System.out.println(arr.length); // 1차원 배열의 길이였다.
		System.out.println(arr[0].length); // 2차원 배열의 길이. 인덱스까지 접근을 해야한다.
		System.out.println(arr[1].length); // 서로 인덱스에 따라서 배열의 길이가 다를 수 있다.
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
				arr[i][j]= i*j;
			}
		}
		*/
		int[][] scores = new int[3][5]; //int[학생수][과목수]
		/*[i{j1,2,3,4,5}
		 * i{j1,2,3,4,5}
		 * i{j1,2,3,4,5}]
		 * 
		 * 
		 * 
		 */
		int[] sum = new int[scores.length]; //합계 5
		double[] avg = new double[scores.length]; //평균 5
		int count =0;
		int count2 =0;
		for(int i =0; i<scores.length; i++){
			for(int j=0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*101);
			}
			System.out.println(Arrays.toString(scores[i]));
			
		}
		int[] temp = new int[15];
		for(int i =0; i<scores.length; i++){
				for(int j=0; j < scores[i].length; j++){
			temp[count] = scores[i][j];
					count++;
		}
		}System.out.println(Arrays.toString(temp));
		count =0;
		for(int i = 0; i < sum.length ;i++){
				for(int j = 0; j < scores.length;j++){
				sum[i] = temp[i] + temp[j];
				}
		}System.out.println(Arrays.toString(sum));
		for(int i = 0; i < avg.length ;i++){
			for(int j = 0; j < sum.length;j++){
				avg[i] = sum[i]/(scores.length);
			}
		}
		System.out.println(Arrays.toString(avg));

	
	  for(int i =0; i < scores.length; i++){ //1차 배열이 앞에꺼
	  for(int j=0; j<scores[i].length; j++){ //2차 배열이 뒤에꺼
		  sum[i] += scores[i][j];
	 }
	  avg[i] = Math.round((double)sum[i] / scores[i].length*10)/10; //소수 첫째짜리. 반올림. 
	  System.out.println("합계 " + sum[i] + " / 평균 : " + avg[i]);		
	 }

	
	}

}
