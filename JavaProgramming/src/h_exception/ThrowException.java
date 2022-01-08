package h_exception;

import java.io.IOException;

public class ThrowException {

	static String str;
	
	public static void main(String[] args) {
		/*
		 * 예외 발생시키기
		 * - throw new Exception();
		 * - throw 예약어와 예외 클래스의 객체로 예외를 발생시킬 수 있다.
		 */
		
		try {
			throw new IOException("예외가 발생한 원인");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		throw new NullPointerException();
		
		
//		System.out.println(str.equals("abc"));
		
		
		int[] a = new int[10];
		
		//ArrayIndexOutOfBoundsException
		for(int i = 0; i <= 10; i++){
			System.out.println(a[i]);
		}
	}

}












