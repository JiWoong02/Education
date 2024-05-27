package test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// HashSet 의 후손(sub) 클래스
		// 중복검사 기능 있음, 저장 순서가 유지됨
		LinkedHashSet linkSet = new LinkedHashSet();
		
		linkSet.add("apple");
		linkSet.add(123);
		linkSet.add(3.45);
		linkSet.add(123);  //중복 저장 안됨
		linkSet.add(new User("user02","pass02", "이영희"));
		
		System.out.println(linkSet);
		System.out.println(linkSet.size());
		
		//Set => Object[] : toArray()
		System.out.println("toArray-------------------------------------");
		Object[] objArray = linkSet.toArray();
		for(Object obj : objArray) {
			System.out.println(obj);
		}
		
		//Set => Iterator : iterator()
		System.out.println("iterator-------------------------------------");
		Iterator objIter = linkSet.iterator();
		while(objIter.hasNext()) {
			Object obj = objIter.next();
			System.out.println(obj);
		}

	}

}
