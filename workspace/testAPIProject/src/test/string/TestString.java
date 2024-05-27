package test.string;

import java.util.Calendar;

public class TestString {

	public static void main(String[] args) {
		// String 사용 테스트
		
		// 생성자 사용 확인
		String s1 = new String("apple");
		String s2 = "apple"; // s1과 s2의 주소는 다르다. 하지만 값의 주소는 같다.
		String s3 = new String();

		byte[] bar = new byte[] { 10, 30, 50, 70, 90 };
		String s4 = new String(bar);

		char[] chAr = new char[] { 'j', 'a', 'v', 'a' };
		String s5 = new String(chAr);
		
		String s6 = new String(new StringBuilder("banana"));

		//메소드 사용 확인
		System.out.println(s1.length());
		System.out.println("apple".length());
		
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		System.out.println(s6.toString());
		
		System.out.println(s6.charAt(3));
		System.out.println(s6.codePointAt(3));
		System.out.println(s6.codePointBefore(3));
		System.out.println(s6.codePointCount(0, s6.length()));
		
		System.out.println(s6.compareTo("BANANA"));   // 'b' - 'B' => 98 - 66 =>32 리턴 > 0
		System.out.println(s6.compareTo("banana"));  // 'b' - 'b' = 98-98 => 0 리턴 ==0
		System.out.println(s6.compareTo("grape"));  //'b'-'g'   => 98-103 => -5 리턴 
		System.out.println(s6.compareTo("BANANA"));
	
		System.out.println("yellow-".concat(s6));
		
		String pid = "941225-1234567";
		
		int year = Integer.parseInt(pid.substring(0, 2));
		int month = Integer.parseInt(pid.substring(2, 4));
		int day = Integer.parseInt(pid.substring(4, 6));
		int gender =Integer.parseInt(pid.substring(7, 8)) ;
		
		System.out.println("생년월일 : " + (1900 + year) + "년 "+ month + "월 "+ day + "일");
		System.out.println("성별 : " + (gender ==1?"남자":"여자"));
		
		//나이 계산
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		
		java.util.GregorianCalendar birth = new java.util.GregorianCalendar(year,month,day);
		
		System.out.println("나이 : "+ (today.getYear() - birth.get(Calendar.YEAR)));
		
		
		
	
	}

}
