package test.charstream;

public class TestFileIO {

	public static void main(String[] args) {
		// 문자스트림 기반 파일 입출력 테스트
		FileIOSample fsamp = new FileIOSample();
		
//		fsamp.fileSave();
		fsamp.fileRead();  //추가쓰기 전 출력 확인
		fsamp.fileAppend();
		fsamp.fileRead();  //추가쓰기 후 출력 확인

	}

}
