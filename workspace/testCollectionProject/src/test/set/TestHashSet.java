package test.set;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// Set 계열 테스트
		HashSet hset = new HashSet(); // 저장공간 : 16, 확장비율 : 0.75
//		Set hset2 = new HashSet();
//		Collection hset3 = new HashSet();

		// 객체만 저장할 수 있다.
		hset.add(new String("apple"));
		hset.add(new Integer(120));
		hset.add(new Double(32.5));
		hset.add("banana"); // 자동으로 객체로 바꿔서 저장 (auto boxing)
		hset.add(300);// (auto boxing) : data => object
		hset.add(45.6);// (auto boxing)
		hset.add(new User("user01", "pass01", "홍길동"));
	
		// 저장 순서 유지 안 됨
		System.out.println(hset/* .toString() */);
		System.out.println("저장된 객체수 : " + hset.size());
		
		//Set 은 중복 저장 허용 안 함 (중복 검사 기능 내장되어 있음)
		hset.add("apple");
		hset.add(300);
		System.out.println(hset);
		System.out.println("저장된 객체수 : " + hset.size());
		
		//제거
		hset.remove("banana");
		System.out.println(hset);
		System.out.println("저장된 객체수 : " + hset.size());
		
		//Set 은 저장순서가 없으므로, 하나씩 저장된 객체를 꺼내는 기능이 없음
		//toArray() 로 Object[] 로 바꾸어서 하나씩 다루거나,
		//iterator() 로 저장된 객체에 대한 목록을 만들어서 목록으로 하나씩 꺼내도록 처리함
		
		System.out.println("\ntoArray() 로 연속 처리 ------------------------------------");
		
		//Set => Object[] : toArray()
		Object[] array = hset.toArray();
		for(Object ref : array) {
			System.out.println(ref);
		}
		
		System.out.println("\niterator() 로 연속 처리 ------------------------------------");
		Iterator iter = hset.iterator();
		while(iter.hasNext()) {
			Object ref = iter.next();
			System.out.println(ref);
		}
		
		
		
		//저장공간 비우기
		hset.clear();
		System.out.println(hset.isEmpty());
		System.out.println(hset.size());
		
	}

}

//값을 저장할 목적의 클래스 vo (value object) == dto (data transfer object) ==do(domain object) == entity == bean
//데이터 저장을 목적으로 하는 클래스를 가리키는 용어임
//작성규칙 : 
//모든 필드는 반드시 private (캡슐화, encapsulation)
//매개변수 없는 기본생성자와 매개변수 있는 생성자 있어야 함
//모든 필드에 대한 getters and setters 있어야 함
//반드시 직렬화할 것
class User implements Serializable {
	private static final long serialVersionUID = -2908855280540267133L; //UID가 같지 않도록 주의 
	
	private String userId;
	private String userPwd;
	private String userName;
	
	public User() {}

	public User(String userId, String userPwd, String userName) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + "]";
	}
	
	
	
	
	

}
