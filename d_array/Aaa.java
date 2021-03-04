package d_array;

import java.util.Arrays;

public class Aaa {

	public static void main(String[] args) {
		/*정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는
		두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
		제한사항 길이는 2이상 100이하, 모든 수는 0이상 100이하.*/
		
		int array = 0;
		do{array = (int) (Math.random() * 100) + 1;
		}while(array ==1 || array > 100);
		System.out.println(array);
	
		int[] numbers = new int[array]; //렌덤 수 뽑기. 
		System.out.println(Arrays.toString(numbers));
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100); // 랜덤 수 넣기. 
		}System.out.println(Arrays.toString(numbers));

		
		int count = 0;
		int[] temp = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			boolean flag = false;
			for (int j = 0; j < temp.length; j++) {
				if (numbers[i] == temp[j]) {
					flag = true;
				}
			}
			if (!flag) {
				temp[count++] = numbers[i];
			}
		}


		int[] result = new int[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result)); //새로운 배열을 만들었다. 여기까지가 문제.

		int combination = (result.length * (result.length - 1)) / 2; // 경우의 수만큼 수가 나올것이다. 
		System.out.println(combination);
		int[] combine = new int[combination];
		int ct=0;
		//result[0,1,2] = 2,4,8
		for (int i = 0; i < result.length-1; i++) {
			for (int j = i+1; j < result.length; j++) {
				combine[ct] = result[i] + result[j];
				ct++;
			}
		}System.out.println(Arrays.toString(combine));

		int count2 = 0;
		int[] temp2 = new int[combine.length];
		for (int i = 0; i < combine.length; i++) {
			boolean flag = false;
			for (int j = 0; j < temp2.length; j++) {
				if (combine[i] == temp2[j]) {
					flag = true;
				}
			}
			if (!flag) {
				temp2[count2++] = combine[i];
			}
		}
		System.out.println(Arrays.toString(temp2)); //중복을 없애서

		int[] result2 = new int[count];
		for (int i = 0; i < result2.length; i++) {
			result2[i] = temp2[i];
		}
		System.out.println(Arrays.toString(result2)); //새로운 배열을 만들었다. 여기까지가 문제.
		
		for(int i = 0; i < result2.length -1; i++){ // 값이 중요한게 아니라 위치가 중요한거다.
			int min = i; // 최소값을 찾는게 아니라 최소값이 있는 위치를 찾아야 한다. 
			for(int j = i+1; j < result2.length; j++){
				if(result2[j] < result2[min]){ //값비교는 당연히 인덱스 값.
					min = j; // 최소값을 만나면 최소값의 인덱스를 저장한다. 
				}
			}
		int temp3 = result2[i]; // 자리바꾸기.
		result2[i] = result2[min];
		result2[min] = temp3;
	} System.out.println(Arrays.toString(result2));

	}

}
