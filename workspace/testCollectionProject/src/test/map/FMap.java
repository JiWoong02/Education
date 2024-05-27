package test.map;

public interface FMap {
	//상수 필드를 멤버로 가질수 있음 
	//public static final 자료형 필드명 = 초기값;
	
	//추상메소드만 멤버로 가질수 있음
//	public abstract 반환형 메소드명 ( 자료형 매개변수 );
	
	//내부(Nested) 인터페이스를 가질 수도 있음 : 멤버로 봐야 함
	//접근제한자 [static] interface 인터페이스명 { 추상메소드 선언; }
	public static interface FEntry {
		
	}
}
