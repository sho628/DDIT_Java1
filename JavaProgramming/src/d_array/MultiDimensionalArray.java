package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 */
		
		//2차원
		int[][] array2;
		
		//3차원
		int[][][] array3;
		
		int[][] arr = new int[2][3];
		/*
		 * 변수 = 주소(100번지)
		 * 
		 * 100번지
		 * {200번지, 300번지}
		 * 
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 */
		
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		/*
		 * arr2 = 100번지
		 * 
		 * 100번지
		 * {200번지, 300번지}
		 * 
		 * 200번지
		 * {1, 2, 3}
		 * 
		 * 300번지
		 * {4, 5, 6}
		 */
		int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		/*
		 * arr3 = 100번지
		 * 
		 * 100번지
		 * {200번지, 300번지, 400번지}
		 * 
		 * 200번지
		 * {1, 2, 3}
		 * 
		 * 300번지
		 * {4, 5, 6}
		 * 
		 * 400번지
		 * {7, 8, 9}
		 */
		
		int[][] arr4 = new int[3][]; //가변 배열
		/*
		 * arr4 = 100번지
		 * 
		 * 100번지
		 * {200번지, 300번지, 400번지}
		 * 
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0, 0}
		 * 
		 * 400번지
		 * {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		 */
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		System.out.println(arr[0][1]);
		
//		arr[0] = 20; //값을 저장할 수 없다.
//		int[][] arr = new int[2][3];
		arr[0] = new int[5];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length); //2차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
		/*
		 * { {10, 20, 0, 0, 0},
		 *   {100, 0, 0} }
		 */
		
		int[][] scores = new int[3][5]; //int[학생수][과목수]
		int[] sum = new int[scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		//각 학생의 합계와 평균을 배열에 저장 후 출력해주세요.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				sum[i] += scores[i][j];
			}
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println("합계 : " + sum[i] + " / 평균 : " + avg[i]);
		}
	}

}
















