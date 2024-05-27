package test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	public static void main(String[] args) {
		// 날짜, 시간 처리용 클래스 테스트
		Date today = new Date();
//		java.sql.Date birth = new java.sql.Date(2024,01,24);
		Calendar current =Calendar.getInstance();
		GregorianCalendar current2 = new GregorianCalendar();
		
		
		
		
		System.out.println("today : " + today);
		System.out.println("current : " + current);
		System.out.println("current2 : "+ current2);
		
		//format 을 적용한 출력 처리
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'년' MM'월' dd'일' kk'시' mm'분' ss'초' E'요일'");
		String stoday = sdf.format(today);
		
		System.out.println(stoday);
		
		//current2 에 포맷을 적용해서 출력을 하려면
		
		System.out.println(sdf.format(current.getTime()));
		System.out.println(sdf.format(current2.getGregorianChange()));
		
	}

}
