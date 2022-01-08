package g_oop2;

//추상 클래스 : 추상 메서드를 하나라도 가지고 있는 클래스
public abstract class SampleAbstractParent {

	void method(){
		
	}
	
	//추상 메서드 : 선언부만 있고 구현부가 없는 메서드
	abstract void abstractMethod();
	
}

class SampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {
		
	}
	
}















