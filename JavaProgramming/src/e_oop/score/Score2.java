package e_oop.score;

public class Score2 {

	public static void main(String[] args) {
		String[] names = {
				  "강인혜", "권현지", "김건욱", "김건웅", "김동욱"
				, "김민현", "김진훈", "박경미", "소혜원", "송영관"
				, "여은정", "윤경식", "이민재", "이용희", "이원균"
				, "이전은", "이한규", "임정선", "장제원", "전희"
				, "정경민", "최무선", "정재희", "유밀", "정서윤"
				};
		
		Student[] students = new Student[names.length];
		
		for(int i = 0; i < students.length; i++){
			students[i] = new Student();
			students[i].name = names[i];
			students[i].createRandomScore();
			students[i].getSum();
			students[i].getAverage();
		}
		
		for(int i = 0; i < students.length; i++){
			students[i].getRank(students);
		}
		
		for(int i = 0; i < students.length - 1; i++){
			int max = i;
			for(int j = i + 1; j < students.length; j++){
				if(students[max].getSum() < students[j].getSum()){
					max = j;
				}
			}
			
			Student s = students[i];
			students[i] = students[max];
			students[max] = s;
		}
		
		int[] subSum = new int[3];
		double[] subAvg = new double[3];
		
		for(int i = 0; i < students.length; i++){
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
		
		for(int i = 0; i < subAvg.length; i++){
			subAvg[i] = Math.round((double)subSum[i] / students.length * 100) / 100.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){
			System.out.println(students[i].getInfo());
		}
		System.out.print("과목합계");
		for(int i = 0; i < subSum.length; i++){
			System.out.print("\t" + subSum[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subAvg.length; i++){
			System.out.print("\t" + subAvg[i]);
		}
	}

}











