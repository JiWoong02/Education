package test.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap2 {

	public static void main(String[] args) {
		// Map 에 저장된 객체들을 연속으로 처리하고자 한다면, 기본 제공 메소드 없음
		
		HashMap hmap = new HashMap();
		
		//5개의 객체를 샘플로 맵에 저장 처리
		//키는 1~100사이의 임의의 정수객체
		//값은 랜덤값으로 실수객체
		for(int i =0; i <5; i ++) {
			Integer key = new Random().nextInt(100)+1;
			Double value = Math.random();
			hmap.put(key, value);
		}
		
		System.out.println(hmap);
		
		//맵에 저장된 객체 전부를 하나씩 연속으로 처리해야 한다면
		//첫번째 : 키들을 Set으로 바꿈 => 키에 대한 목록 만들기, iterator() 
		//                    	=> 목록에서 키를 하나씩 꺼내서 get(키) 를 적용해서 연속 처리
		
		Iterator keyIter = hmap.keySet().iterator();
		
		while(keyIter.hasNext()) {
			Object key = keyIter.next();
			System.out.println(key + " = " + hmap.get(key));
		}
		
		//두번째 : 엔트리들을 Set 으로 바꿈 => 엔트리 목록을 만들어서 => 엔트리들을 하나씩 꺼내서 처리
		System.out.println("============================");
		Set entry = hmap.entrySet();
		Iterator entryIter = entry.iterator();
		while(entryIter.hasNext()) {
			Map.Entry mentry = (Map.Entry)entryIter.next();
			System.out.println(mentry.getKey() + " = "+ mentry.getValue());
			
		}
		
		//세번째 : 값객체들을 Collection 으로 바꿈 => for each 문으로 연속 처리 
		System.out.println("======================================");
		Collection values = hmap.values();
		for(Object obj : values) {
			System.out.println(obj);
		}
		//네번째 : 값객체들을 Collection 으로 바꿈 =>toArray 문으로 연속 처리 
		System.out.println("======================================");
		Collection ovalues = hmap.values();
		Object[] objArray = ovalues.toArray();
		for(Object obj:objArray) {
			System.out.println(obj);
		}
		
		
		
		//TreeMap : 키에 대한 오름차순정렬 기능을 내장한 클래스임
		//주의사항 : 키가 한가지 타입으로 저장되어 있어야 함
		System.out.println("=========================================");
		TreeMap tmap = new TreeMap(hmap);
		System.out.println(tmap);
		
		//키에 대한 내림차순정렬이 필요하면
		Map tmap2 = tmap.descendingMap();
		System.out.println(tmap2);
		
		
		
		
		
		
		

	}

}
