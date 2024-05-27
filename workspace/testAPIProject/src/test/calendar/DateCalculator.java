package test.calendar;

import java.util.Date;

public class DateCalculator {
	
	public long getDays() {
		DateCalculator dc = new DateCalculator();
		long sumDays =0L;
		Date today = new Date();
		for(int y =1; y<today.getYear()+1900;y++) {
			sumDays += (dc.isLeapYear(y)?366:365);
		}
		for(int m=1; m<today.getMonth()+1;m++)
		{
			if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
				sumDays += 31;
			}else if(m==2) {
				sumDays += dc.isLeapYear(today.getYear()+1900)?29:28;
			}else {
				sumDays += 30;
			}
		}
		sumDays += today.getDate();
		return sumDays;
	}
	
	
	public boolean isLeapYear(int year) {
		return year % 4 == 0 ? ((year % 100 != 0)||(year % 400 == 0) ? true: false) : false;
	}
}
