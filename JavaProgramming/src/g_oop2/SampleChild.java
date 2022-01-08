package g_oop2;

public class SampleChild extends SampleParent {

	void childMethod(){
		System.out.println(var); //상속받은 변수
		System.out.println(method(7, 13)); //상속받은 메서드
	}
	
	//오버라이딩
	//super, super()
	//다형성
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는것
	@Override //어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것
	int method(int a, int b){
		return a * b;
	}
	
	//super, super()
	int var;
	
	void test(double var){
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20)); //오버라이딩된 메서드
		System.out.println(super.method(10, 20)); //부모 클래스의 메서드
	}
	
	SampleChild(){
		super(); //부모 클래스의 생성자 호출
		//super()를 통해 부모클래스의 인스턴스 변수도 초기화한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	
	//다형성
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = (SampleParent)new SampleChild(); //SampleChild2, SampleChild3
//		sp = new SampleChild2();
//		sp = new SampleChild3();
		//부모타입의 변수로 자식타입의 객체를 사용하는 것이 다형성이다.
		
		sc = (SampleChild)sp;
		sp = sc;
		//자식타입 -> 부모타입 형변환은 생략 할 수 있다.
		
		SampleChild sc2 = (SampleChild)new SampleParent();
		//SampleParent : 2개
		//SampleChild : 5개
		
		SampleParent sp2 = new SampleChild();
	}
	
}














