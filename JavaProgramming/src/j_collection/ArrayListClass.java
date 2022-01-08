package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * List
		 * Map
		 * Set
		 * 
		 * boolean add(Object obj) : 미자막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * int size() : 저장된 객체의 수를 반환한다.
		 * Object remove(int index) : 지정된 위치의 객체를 제거한다.
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(10));
//		list.add("abc");
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list);
		
		list.add(1, 40);
		System.out.println(list);
		
		Integer before = list.set(2, 50);
		System.out.println("before : " + before);
		System.out.println("atfer : " + list.get(2));
		System.out.println(list);
		
		
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(i + " : " + list.get(i));
//			
//			list.remove(i);
//		}
//		System.out.println(list);
		
		//값을 제거 할 때는 뒤에서부터 제거해야 한다.
		for(int i = list.size() - 1; 0 <= i; i--){
			System.out.println(i + " : " + list.get(i));
			
			list.remove(i);
		}
		System.out.println(list);
		
		/*
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * boolean	Boolean
		 * char		Character
		 */
		
		//list에 1~100사이의 랜덤값을 10개 저장해주세요.
		for(int i = 0; i < 10; i++){
			int random = (int)(Math.random() * 100) + 1;
			list.add(random);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		
		double avg = (double)sum / list.size();
		System.out.println("sum : " + sum + " / avg : " + avg);
		
		//list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) < min){
				min = list.get(i);
			}
			if(max < list.get(i)){
				max = list.get(i);
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		//list를 오름차순으로 정렬해주세요.
		for(int i = 0; i < list.size() - 1; i++){
			int m = i;
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(j) < list.get(m)){
					m = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(m));
			list.set(m, temp);
		}
		System.out.println(list);
//		for(int i = 0; i < arr.length - 1; i++){
//			int min = i;
//			for(int j = i + 1; j < arr.length; j++){
//				if(arr[j] < arr[min]){
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
		
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> list3 = list2.get(i);
			for(int j = 0; j < list3.size(); j++){
				System.out.println(list3.get(j));
			}
		}
		//arr[0][1]
		System.out.println(list2.get(0).get(1));
	}

}















