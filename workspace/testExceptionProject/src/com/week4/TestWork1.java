package com.week4;

import java.util.Calendar;
import java.util.Date;

public class TestWork1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Date td = today.getTime();
		int year = td.getYear()+1900;
		int month = td.getMonth()+1;
		int date = td.getDate();
		int d = td.getDay();
		char day = d==1?'월':d==2?'화':d==3?'수':d==4?'목':d==5?'금':d==6?'토':'일';
		int hour = td.getHours();
		int minute = td.getMinutes();
		int second = td.getSeconds();
		System.out.println(year+"년 "+month+"월 "+date+"일 " +day+"요일" );

	}

}
