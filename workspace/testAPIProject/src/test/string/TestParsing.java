package test.string;

public class TestParsing {

	public static void main(String[] args) {
		// 문자열 형태의 기본값을 기본자료형 데이터로 바꾸는 것 : 파싱(parsing)
		// 각 Wrapper 클래스에서 메소드로 제공함
		
		String s1 = "100";
		String s2 = "2.56";
		String s3 = "true";
		String s4 = "A";
		
		//String => 기본자료형(Primitive Type)의 값으로 변경
		int num = Integer.parseInt(s1);
		double dnum = Double.parseDouble(s2);
		boolean bflag = Boolean.parseBoolean(s3);
		char ch = s4.charAt(0);
		
		System.out.println("정수 : " + (num * 3));
		System.out.println("실수 : " + (dnum * 1.0));
		System.out.println("논리 : " + (bflag? "맞다" : "틀리다"));
		System.out.println("문자의 유니코드 : " + (int)ch);

	}

}
