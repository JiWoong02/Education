package test.string;

import java.util.StringTokenizer;

public class StringSample {
	public StringSample() {}
	
	public void immutableString() {
		//문자열값(문자열 리터럴)은 jvm에 의해 문자열 저장소(Literal Pool)에 따로 저장됨
		//문자열 저장소는 같은 문자열을 두 번 기록하지 않는다. (두번째 기록시에는 이미 기록된 문자열의 주소 리턴임)
		//문자열 저장소에 기록된 문자열값은 수정 불가능임 (immutable)
		//기록된 문자열 값을 수정하면, cpu 가 문자열을 읽어가서 수정 연산처리를 하고 ,
		//		변경된 문자열을 문자열 저장소에 새로 할당 기록함 => 메모리 사용량이 늘어나므로, 수정 작업 부적합
		
		//자바가 문자열을 취급하도록 String 클래스를 제공함
		//String 사용 방식을 기본자료형처럼 쓸 수 있게 제공함
		//기본적으로 클래스 사용 방식은 클래스명 레퍼런스변수 = new 생성자([초기값, 초기값, ...]);
		//기본자료형 사용 방식 : 자료형 변수명 = 값;
		String str = "test string";  //jvm이 literal pool에 자동 할당하고 주소 리턴함
		System.out.println("기록된 주소 확인 : "+ str.hashCode());
		
		String ttr = "test string";  //한번 기록된 문자열은 두번 기록하지 않는다.
		System.out.println("기록된 주소 확인 : "+ ttr.hashCode());
		//이전 기록된 문자열의 주소를 리턴함
		
		//문자열 저장소에 기록된 문자열값은 수정 불가능함 (immutable)
		String result = str.toUpperCase();
		System.out.println("str : " + str);	//원래 문자열 그대로임 (변경 안 됨)
		System.out.println("result : "+ result);
		System.out.println("result hashCode : "+ result.hashCode());  //새 위치에 변경된 문자열 기록됨
		
		String result2 = str.concat(" immutable check.");
		System.out.println("str : " + str);	//원래 문자열 그대로임 (변경 안 됨)
		System.out.println("result2 : "+ result2);
		System.out.println("result2 hashCode : "+ result2.hashCode());
		
		String result3 =str.replace('t', 'b');
		System.out.println("str : " + str);	//원래 문자열 그대로임 (변경 안 됨)
		System.out.println("result3 : "+ result3);
		System.out.println("result3 hashCode : "+ result3.hashCode());
		
		String str2 = new String("test string");
		System.out.println("주소가 같은지? " + (str == str2)); //false
		System.out.println(str.hashCode());		//실제 문자열의 기록 주소
		System.out.println(str2.hashCode());    //String 클래스가 hashCode()를 오버라이딩해 놓았음
		//오버라이딩 메소드 안에서 return this; ==> 참조하는 문자열값의 주소 리턴으로 바꿔 놓았음
		//return this.value;   ==>문자열값의 주소 리턴
		
		
	}public void usingStringBuilder() {
			//문자열 값의 조작(추가, 삭제, 변경)작업이 필요하다면, String 을 StringBuffer 로 바꿈
			//별도의 메모리 공간을 만들어서 문자열을 기록함 => 문자열 조작 처리 (기존 문자열 값을 변경함_
			//> String 으로 바꿈
		String s = "java string";// immutable
		StringBuilder sb = new StringBuilder(s);  //mutable
		//String ==> StringBuilder 로 바꿈
		
		System.out.println("s : " + s.hashCode());
		System.out.println("sb : "+ sb.hashCode());
		System.out.println("sb : "+ sb);//toString
		
		System.out.println("sb capacity : "+ sb.capacity()); //기본 16글자 저장 + 추가된 글자수
		
		StringBuilder result = sb.delete(6, 8);
		System.out.println("sb : "+sb);
		System.out.println("result : "+ result.hashCode());
		
		//StringBuilder 에 기록된 문자열을 char[]에 복사해 넣을 경우
		char[] car = new char[10];
		sb.getChars(0, 3, car, 0);
		
		for(int i=0;i<car.length;i++) {
			System.out.println(i + " : " + car[i]);
		}
		
		System.out.println("sb 가 참조하는 문자열의 s 문자의 순번 : " + sb.indexOf("s"));
		System.out.println("sb 가 참조하는 문자열의 s 문자의 순번 : " + sb.indexOf("ing"));
		
		result = sb.insert(0, "immutable ");
		System.out.println("sb : " + sb);
		System.out.println("result : " + result.hashCode());
		
		result = sb.replace(6, sb.length(), "String");
		System.out.println("sb : " + sb);
		System.out.println("result : " + result.hashCode());
		
		result = sb.reverse();		
		System.out.println("sb : " + sb);
		System.out.println("result : " + result.hashCode());
		
		sb.setCharAt(6, 's');
		System.out.println("sb : " + sb);
		
		String str = sb.substring(6);
		System.out.println("6번 인덱스부터 끝글자까지 추출 : "+ str);
		
		str = sb.substring(0, 5);
		System.out.println("0번 인덱스부터 5번 인덱스 앞 글자까지 추출 : "+ str);
		
		//StringBuilder ==> String 으로 바꿀 때
		str = sb.toString();
		System.out.println("String : "+ str);
		
	}
	
	public void usingSplit() {
//		String s = "java linux oracle cloud jdbc html5 css3 javascript jquery jsp servlet";
//		String[] star = s.split(" ");
		
		String s = "java,linux,oracle,cloud,jdbc,html5,css3,javascript,jquery,jsp,servlet";
		String[] star = s.split(",");
		
		
		System.out.println("분리된 문자열의 갯수 : "+ star.length);
		for(int i=0; i<star.length;i++) {
			System.out.println(i + " : " + star[i]);
		}
		
		//객체배열, 컬렉션은 for each 문 사용할 수 있음
		int count = 0;
		for(String a:star) {
			System.out.println(count + " : " + a);
			count++;
		}
	}
	public void usingTokenizer() {
//		StringTokenizer st = new StringTokenizer("java linux oracle cloud jdbc html5 css3 javascript jquery jsp servlet");
		
		StringTokenizer st = new StringTokenizer("java,linux,oracle,cloud,jdbc,html5,css3,javascript,jquery,jsp,servlet", ",");
		
		System.out.println("분리된 문자열(토큰) 갯수 : " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		} 
	}
	
	
}
