package test.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class TestProperties3 {

	public static void main(String[] args) {
		// 파일로 부터 읽어온 값들을 하나씩 꺼내기
		Properties prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("db_setting.xml"));
			
			System.out.println(prop);
			prop.list(System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//값 꺼내기
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("passwd");
		
		System.out.println("driver : "+ driver);
		System.out.println("url : "+ url);
		System.out.println("user : "+ user);
		System.out.println("passwd : "+ passwd);
		

	}

}
