package test.abst;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestAbstract {

	public static void main(String[] args) {
		// abstract class(미완성 클래스) 사용 테스트
		// 레퍼런스 변수 선언은 가능함
			AbstractSample samp = null;
			
			//미완성 클래스이므로 객체 생성은 못함
//			new AbstractSample();   //error
		
			//상속받은 미완성 메소드를 완성시킨 후손클래스는 객체생성 가능함
			samp = new SubClass();

			Calendar today = null;
//			today =new calendar(); //error
			today = new GregorianCalendar();
			System.out.println(today); //toString()
			samp.display();

	}

}
