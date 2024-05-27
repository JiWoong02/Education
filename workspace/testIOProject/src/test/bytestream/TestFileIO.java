package test.bytestream;

public class TestFileIO {

	public static void main(String[] args) {
		// 바이트 스트림 파일 입출력 테스트
//		FileIOSample fsamp = new FileIOSample();
		FileIOSample2 fsamp = new FileIOSample2();
		fsamp.fileSave();
		fsamp.fileRead();
		
		System.out.println( "메인 종료!!");

	}

}
