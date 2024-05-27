package com.week4;

public class ExamString {
	public ExamString() {
		super();
	}
	public String preChar(String s) {
		return s.replaceFirst(s.substring(0,1),s.toUpperCase().substring(0, 1));
		
	}
	
	public int charSu(String s, char ch) {
		int count = 0;
		char[] chArray = s.toCharArray();
		for(int i =0; i<chArray.length;i++) {
			if(chArray[i]==ch) {
				count++;
			}
		}
		return count;	
	}
	
	
}
