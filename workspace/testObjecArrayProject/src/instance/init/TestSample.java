package instance.init;

public class TestSample {

	public static void main(String[] args) {
		// 초기화순서 테스트
		// 인스턴스변수는 클래스에 대한 객체를 new할 때, 객체 안에서 초기화됨
		Sample s = new Sample(300);
		s.printSample();

	}

}
