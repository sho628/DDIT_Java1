package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String answer = null;
		int sum = 0;
		
		System.out.println("=========== 탄수화물 중독 자가진단 ============");
		
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다(Y/N)>");
		answer = s.nextLine();
//		if(answer.equals("Y") || answer.equals("y")) sum++;
//		if(answer.toUpperCase().equals("Y")) sum++;
		if(answer.equalsIgnoreCase("Y")) sum++;
		
		System.out.println("========== 진단 결과 ==============");
		if(sum < 3){
			System.out.println("안전!");
		}else if(sum == 3){
			System.out.println("주위!");
		}else if(4 <= sum && sum <= 6){
			System.out.println("위험!");
		}else if(7 <= sum){
			System.out.println("중독!");
		}
	}

}








