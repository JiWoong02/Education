package test.objectio;

public class TestObjectIO {

	public static void main(String[] args) {
		// 객체를 파일에 저장하는 객체입출력 스트림 사용 테스트
		Member[] array = new Member[] {
				new Member("홍길동", 27, '남',"hong99@naver.com", "010-1234-5787", 13500.0),
				new Member("대장금", 23, '여',"jangguem112@yahoo.co.kr", "010-2747-1123", 20340.0),
				new Member("신동엽", 52, '남',"godeast114@google.com", "010-1347-9913", 74650.0)
		};
		
		MemberManager manager = new MemberManager(array);
		
//		manager.fileSave();
		manager.fileRead();

	}

}
