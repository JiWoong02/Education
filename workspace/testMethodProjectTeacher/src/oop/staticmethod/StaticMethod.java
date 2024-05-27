package oop.staticmethod;

public class StaticMethod {
	// Field
	private static String value;

	// Constructor : 필드가 모두 static 일 때는 생성자 필요없음
	/*
	 * public StaticMethod(){}
	 * 
	 * public StaticMethod(String value){ this.value = value; }
	 */

	// value 필드 값 변경용 : 필드가 static이면 setter 도 static 이어야 함
	public static void setValue(String v) {
		//static 메소드 안에는 this 레퍼런스가 없음 : 사용못함
		value = v;
	}

	// value 필드 값 조회용 : 필드가 static 이면 getter 도 static 이어야 함
	public static String getValue() {
		return value;
	}

	// 필드가 모두 static 일 때는 메소드도 전부 static 이어야 함
	// static method
	// 1. 반환값 없고 매개변수 없는 메소드
	// value 필드 값을 모두 대문자로 바꾸는 static 메소드
	// 메소드명 : toUpper
	public static void toUpper() {
		//java.lang.String 가 제공하는 대문자로 변환하는 toUpperCase() 사용
		//value = value.toUpperCase();
		if(value != null && value.length() > 0) {  //문자열값이 있다면
			//String -> char[]
			char[] values = value.toCharArray();
			for(int i = 0; i < values.length; i++) {
				if(values[i] >= 'a' && values[i] <= 'z') {
					values[i] -= 32;
				}
			} //for
			
			//char[] 배열을 다시 String 으로 바꿈
			value = String.valueOf(values);
		}
	}

	// 2. 반환값 없고 매개변수 있는 메소드
	// 인덱스와 문자를 전달받아
	// value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
	// 메소드명 : setChar
	public static void setChar(int index, char c) {
		if(value != null && value.length() > 0) {
			//String 타입의 문자열값에서 문자 하나를 변경하는 방법
			//java.lang.String 클래스에는 원하는 위치의 문자 하나 변경하는 메소드 없음
			
			//String -> StringBuilder 로 변경하고 setCharAt(index, ch) 사용하는 방법
//			StringBuilder sb = new StringBuilder(value);
//			sb.setCharAt(index, c);
//			value = sb.toString();
			
			//또는 String -> char[] 문자 하나 변경하고, 다시 String 으로 바꿈
			char[] values = value.toCharArray();
			values[index] = c;
			value = String.valueOf(values);
		}
	}

	// 3. 반환값 있고 매개변수 없는 static 메소드
	// value 필드에 기록된 글자갯수 리턴 처리
	// 메소드명 : valueLength
	public static int valueLength() {
		return value.length();
	}

	// 4. 반환값 있고 매개변수 있는 static 메소드
	// 문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
	// 메소드명 : valueConcat
	public static String valueConcat(String other) {
		if(value != null && value.length() > 0) {
			return value + other;
		}else {
			return null;
		}
	}
}







