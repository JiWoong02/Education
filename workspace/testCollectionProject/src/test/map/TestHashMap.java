package test.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// HashMap 사용 테스트
//		Map hmap = new HashMap();
		HashMap hmap = new HashMap();

		// 저장시 키객체와 값객체 두 개를 한쌍(엔트리 라고 함)으로 저장함
		hmap.put(new String("one"), new Integer(1230));
		hmap.put(2, "java"); // auto boxing : data => Object 자동 변환해서 저장함
		hmap.put("three", 36.9);
		hmap.put(5, "jdbc");

		System.out.println(hmap/* .toString() */);
		// 키는 Set 방식임, 값은 List 방식임

		hmap.put(2, "oracle"); // 기존의 키에 연결된 값 객체를 바꿈 (set value 개념이 됨)
		System.out.println(hmap);

		hmap.put("two", 1230); // 값객체는 중복 저장됨
		System.out.println(hmap);

		// 저장된 객체들 중 하나만 조회할 경우 : get(key)
		System.out.println(hmap.get(2)); // value 객체가 리턴

		System.out.println("size : " + hmap.size());
		// 저장된 객체 삭제 : remove(key)
		hmap.remove("one");
		System.out.println(hmap);
		System.out.println("size : " + hmap.size());

		// 맵에 저장된 객체들을 연속으로 처리한다면, 기본 제공되는 메소드는 없음
		// 첫번째 해결 : 키들을 Set 으로 바꿈 keySet() 사용 => Iterator() 로 키 목록을 만듦
		System.out.println("keySet() => iterator() 로 키 목록 만들어 연속 처리 ===================");
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			Object key = keyIter.next();
			Object value = hmap.get(key);
			System.out.println(key + " = " + value);
		}
		// 두번째 해결 : 값객체들을 Collection 으로 바꿈 => for each문, iterator() or toArray() 로 연속처리
		System.out.println("values() => Collection() 로 키 목록 만들어 연속 처리 : for each 사용 ===================");
		Collection values = hmap.values();
		//for each 문 : 객체배열과 컬렉션 연속 처리에 사용하는 루프문임
		for(Object obj : values) {
			System.out.println(obj);
		}
		
		System.out.println("values() => Collection() 로 키 목록 만들어 연속 처리 : Object[] 사용 ===================");
		Object[] objArray = hmap.values().toArray();
		for(Object ref : objArray) {
			System.out.println(ref);
		}
		
		
		//세번째, 키와 값 한쌍(entry, 엔트리)을 Set 으로 바꿈 => 엔트리에 대한 목록 만들기함 => 연속처리함
		System.out.println("entrySet() => Collection() 로 키 목록 만들어 연속 처리 : Object[] 사용 ===================");
		Set entries = hmap.entrySet();
		Iterator entryIter = entries.iterator();
		while(entryIter.hasNext()) {
			Object entry = entryIter.next();	//다형성 : 부모타입은 부모것 밖에 사용 못하
			Map.Entry ent = (Map.Entry)entry;	//후손의 메소드를 사용하려면, 후손타입으로 형변환 필요함 : dow casting
			System.out.println(ent.getKey() + " = " + ent.getValue());
		}
	
	
	
	
	
	
	
	
	
	}

}
