package e_oop.score;

public class Score {

	public static void main(String[] args) {
		String[] names = {
				  "강인혜", "권현지", "김건욱", "김건웅", "김동욱"
				, "김민현", "김진훈", "박경미", "소혜원", "송영관"
				, "여은정", "윤경식", "이민재", "이용희", "이원균"
				, "이전은", "이한규", "임정선", "장제원", "전희"
				, "정경민", "최무선", "정재희", "유밀", "정서윤"
				};
		
		Student[] students = new Student[names.length]; //null
		
		for(int i = 0; i < students.length; i++){
			Student student = new Student();
			
			student.name = names[i];
			student.kor = (int)(Math.random() * 101);
			student.eng = (int)(Math.random() * 101);
			student.math = (int)(Math.random() * 101);
//			student.sum = student.kor + student.eng + student.math;
			
			student.rank = 1;
			
			students[i] = student;
		}
		
		/*
		 * name		kor		eng		math	sum		avg		rank
		 * {"홍길동"	80		90		70		0		0		1} : students[0]
		 * {"홍길동"	80		90		70		0		0		1} : students[1]
		 * {"홍길동"	80		90		70		0		0		1}
		 * {"홍길동"	80		90		70		0		0		1}
		 * {"홍길동"	80		90		70		0		0		1}
		 * {"홍길동"	80		90		70		0		0		1}
		 */
		
		//성적처리 프로그램을 완성해주세요.
		
		//합계 평균
		for(int i = 0; i < students.length; i++){
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}
		
		//석차
		for(int i = 0; i < students.length; i++){
			for(int j = 0; j < students.length; j++){
				if(students[i].sum < students[j].sum){
					students[i].rank++;
				}
			}
		}
		
		//석차순 정렬
		for(int i = 0; i < students.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < students.length; j++){
				if(students[j].rank < students[min].rank){
					min = j;
				}
			}
			
			Student s = students[i];
			students[i] = students[min];
			students[min] = s;
		}
		
		//과목 합계
		int[] sums = new int[3];
		for(int i = 0; i < students.length; i++){
			sums[0] += students[i].kor;
			sums[1] += students[i].eng;
			sums[2] += students[i].math;
		}
		
		//과목 평균
		double[] avgs = new double[3];
		for(int i = 0; i < avgs.length; i++){
			avgs[i] = (double)sums[i] / students.length;
		}
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){
			System.out.print(students[i].name);
			System.out.print("\t" + students[i].kor);
			System.out.print("\t" + students[i].eng);
			System.out.print("\t" + students[i].math);
			System.out.print("\t" + students[i].sum);
			System.out.print("\t" + students[i].avg);
			System.out.print("\t" + students[i].rank);
			System.out.println();
		}
		System.out.print("과목합계");
		for(int i = 0; i < sums.length; i++){
			System.out.print("\t" + sums[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < avgs.length; i++){
			System.out.print("\t" + avgs[i]);
		}
	}

}













