package test.properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class TestProperties2 {

	public static void main(String[] args) {
		// 설정 파일로 부터 값들 읽어오기 테스트
		Properties prop1 = new Properties();
		Properties prop2 = new Properties();
		Properties prop3 = new Properties();
		
		try {
			prop1.load(new FileInputStream("db_setting.dat"));
			prop2.load(new FileReader("db_setting.txt"));
			prop3.loadFromXML(new FileInputStream("db_setting.xml"));
			
			prop1.list(System.out);
			prop2.list(System.out);
			prop3.list(System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
