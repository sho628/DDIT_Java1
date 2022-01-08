package i_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date(); //현재 날짜
		System.out.println(today);
		
		//날짜 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd(E) hh:mm:ss a");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//문자열 -> 날짜
		String str = "1987년 05월 01일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		try {
			Date strDate = sdf5.parse(str);
			System.out.println(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}














