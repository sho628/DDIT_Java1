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
		 */
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		
		/*
		 * 변수 = 주소(100번지)
		 * 
		 * 100번지
		 * {0, 0, 0, 0, 0}
		 */
		
		array = new int[]{1, 2, 3, 4, 5};
		
//		array = {1, 2, 3, 4, 5};
		//선언과 초기화를 한번에 해야한다.
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		//for문
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = (i + 1) * 10;
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] arr = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		//배열에 저장된 값을 문자열로 반환
		
		//배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
		int sum = 0;
//		sum += arr[0];
//		sum += arr[1];
//		sum += arr[2];
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		
		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값을 섞어주세요.
		for(int i = 0; i < shuffle.length * 10; i++){
			int random = (int)(Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] counts = new int[10];
		
		for(int i = 0; i < 500; i++){
			int random = (int)(Math.random() * 10) + 1;
			
			counts[random - 1]++;
//			if(random == 1){
//				counts[0]++;
//			}else if(random == 2){
//				counts[1]++;
//			}else if(random == 3){
//				counts[2]++;
//			}
		}
		
		System.out.println(Arrays.toString(counts));
	}

}














