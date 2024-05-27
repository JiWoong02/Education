package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		Book bk1 = new Book("기사단장 죽이기","히가시노 게이고", 15000);
		Book bk2 = new Book("천원을 경영하라","다이소회장", 19000);	
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		System.out.println(bk1.equals(bk2));
		Book bk3 = (Book)bk1.clone();
		System.out.println("bk1의 주소 : " + bk1.hashCode());
		System.out.println("bk3의 주소 : " + bk3.hashCode());
		System.out.println(bk1.equals(bk3));
	}

}
