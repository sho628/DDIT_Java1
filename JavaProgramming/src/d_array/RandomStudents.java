package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		//302호 학생들 중 입력받은 수 만큼 랜덤으로 학생을 뽑는 프로그램을 만들어주세요.
		String[] students = {"강인혜", "권현지", "김건욱", "김건웅", "김동욱"
				, "김민현", "김진훈", "박경미", "소혜원", "송영관"
				, "여은정", "윤경식", "이민재", "이용희", "이원균"
				, "이전은", "이한규", "임정선", "장제원", "전희"
				, "정경민", "최무선", "정재희", "유밀", "정서윤"};
		
		Scanner s = new Scanner(System.in);
		System.out.print("몇명 뽑을까요?");
		int count = Integer.parseInt(s.nextLine());
		
		String[] pick = new String[count];
		int pickCount = 0;
		do{
			int random = (int)(Math.random() * students.length);
			
			boolean flag = true;
			for(int i = 0; i < pick.length; i++){
				if(students[random].equals(pick[i])){
					flag = false;
				}
			}
			
			if(flag){
				pick[pickCount++] = students[random];
			}
		}while(pickCount < count);
		
		System.out.println(Arrays.toString(pick));
	}

}













