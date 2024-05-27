package ncs.test7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		GregorianCalendar gc2 = new GregorianCalendar(1997,4,27);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(gc2.getTime()));
		System.out.println(sdf2.format(gc.getTime()));
		System.out.println((gc.get(Calendar.YEAR)-gc2.get(Calendar.YEAR))+" 세");
	}
}
