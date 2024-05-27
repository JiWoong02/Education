package test.abst;

public class SubClass extends AbstractSample {

	@Override
	public void methodA() {    //메소드 사용 형식의 통일을 위함
		// 상속받은 부모의 미완성 메소드를 후손이 강제로 오버라이딩함
		// 내용 없는 메소드에 내용을 작성해 넣는 것
	}

//	@Override
//	public void display() {  //부모의 final 메소드는 오버라이딩 할 수 없음
//		System.out.println();
//	}
	
	
}
