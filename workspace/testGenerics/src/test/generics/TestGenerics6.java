package test.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics6 {

	public static void main(String[] args) {
		Map<String, Book> map;	// 책제목이 키, Book 객체가 값
		map = mapAllocation();  // 맵 객체 생성(메모리 할당) 해서 레퍼런스 리턴
		putMaps(map); //맵에 Book 객체 추가 메소드 실행 : 3개, key : 도서제목
		printMaps(map); // entry 로 추출해서 출력 처리 : 제목 = Book객체정보
	}
	public static Map<String,Book> mapAllocation(){
		return new HashMap<String,Book>();
	}
	
	public static void putMaps(Map<String,Book> map) {
		Book bk1 = new Book("java 정복","김철수");
		Book bk2 = new Book("oracle 완성", "이영희");
		Book bk3 = new Book("jdbc 코딩", "박문수");
		map.put(bk1.getTitle(), bk1);
		map.put(bk2.getTitle(), bk2);
		map.put(bk3.getTitle(), bk3);
	}
	
	public static void printMaps(Map<String,Book> map) {
		Set<Map.Entry<String, Book>> entryMap=map.entrySet();
		Iterator<Map.Entry<String,Book>> iterMap = entryMap.iterator();
		while(iterMap.hasNext()) {
			Map.Entry<String, Book> entry =iterMap.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
