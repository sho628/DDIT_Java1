package a_variable;

import java.util.Scanner;
//Ctrl + Shift + o

public class Variable {

	public static void main(String[] args) {
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용)
		
//		한줄 주석 : Ctrl + Shift + c
//		한줄 주석 : Ctrl + Shift + c
//		한줄 주석 : Ctrl + Shift + c
//		한줄 주석 : Ctrl + Shift + c
		
		/* 범위 주석 : Ctrl + Shift + /(해제 : \) */
		
		
		//프로그래밍 : 컴퓨터에게 일을 시키기 위해 일하는 과정을 만드는 것
		//재료 : 데이터와 조작
		
		/*
		 * 데이터
		 * 
		 * 1. 기본형
		 * - 숫자
		 * - 문자
		 * - 논리
		 * 
		 * 2. 참조형(데이터가 위치한 주소를 저장)
		 * - 배열(형태가 같은 여러개의 데이터를 묶어서 사용)
		 * - 클래스(형태가 다른 여러개의 데이터와 기능을 묶어서 사용)
		 */
		
		/*
		 * 기본형 타입
		 * - 정수 : byte(1), short(2), *int(4/약20억), long(8)
		 * - 실수 : float(4/7자리), *double(8/15자리)
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 * 
		 * 참조형 타입
		 * - 문자열 : String(4)
		 * 
		 * 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [낙타식 표기법을 사용한다.(mySampleVariable)]
		 * - [클래스명의 첫글자는 대문자로 한다.(MySampleClass)]
		 */
		
		//변수 선언(값을 저장할 공간을 만드는 것)
		int x;
		long y;
		float z;
		char abc;
		boolean boolean$;
		String name123; //중복되지 않게 이름을 지어준다.
		
		//Q. 9가지 타입을 모두 사용해 9개의 변수를 선언해주세요.
		
		
		//초기화(변수에 처음으로 값을 저장하는 것)
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장한다.
		x = 10; //타입에 맞는 값을 저장해야 한다.
		y = 20L; //접미사 L을 붙어야 long타입이 된다.
		z = 3.14f; //접미사 f를 붙어야 float타입이 된다.
		abc = '가'; //따옴표안에 반드시 한글자를 넣어야 한다.
		boolean$ = true; //true, false
		name123 = "가나다라 adbc 1234"; //쌍따옴표로 문자열을 표현한다.
		
		//Q. 위에서 선언한 9개의 변수들을 초기화 해주세요.
		
		
		//일반적으로 선언과 초기화를 한문장으로 한다.
		int a = 10;
		a = 20;
		
		//형변환(데이터의 타입을 다른 타입으로 변경하는 것)
		int _int = 10;
		long _long = 20L;
		
		_int = (int)_long;
		_long = _int; //표현범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다.
		
		_int = (int)(_int + _long); //서로 다른 타입은 연산할 수 없다.
		
		//Q. 변수 3개를 선언해 다른 타입의 데이터로 초기화 해주세요.
		int abcd = (int)3.14;
		char ch = 'a';
		short dd = (short)ch;
		
		
		//출력(콘솔)
		System.out.print("출력");
		System.out.println("출력 후 줄바꿈");
		System.out.printf("출력 포멧 지정\n"); //나중에
		
		//실행 단축키 : Ctrl + F11
		
		//탈출 문자(Escape 문자)
		System.out.println("탭은\t4칸에 맞춰 띄워줍니다.");
		System.out.println("줄바꿈을\n해줍니다.");
		System.out.println("\"쌍따옴표를 넣어줍니다.\"");
		System.out.println("\\역슬래시를 넣어줍니다.");
		
		//위에서 만든 9개의 변수를 출력해주세요.
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		
//		System.out.println("아무 문자열이나 입력해주세요>");
//		String str = sc.nextLine();
//		System.out.println(str);
		
//		System.out.println("int 입력>");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		System.out.println("문자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!!");
		
//		System.out.println("int 입력>");
//		int number = Integer.parseInt(sc.nextLine());
//		System.out.println(number);
		
		
		//Q. 자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 이름을 저장해주세요.
		System.out.println("이름을 입력해주세요>");
		String myName = sc.nextLine();
		System.out.println(myName);
		
		//Q. 자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 나이를 저장해주세요.
//		System.out.println("나이를 입력해주세요>");
//		int myAge = Integer.parseInt(sc.nextLine());
		double db = Double.parseDouble(sc.nextLine());
//		
//		//Q. 이름과 나이를 출력해주세요.
//		System.out.println("이름 : " + myName + " / 나이 : " + myAge);
		
	}

}













