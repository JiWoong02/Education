package com.practice2.controller;

import com.practice2.model.entitiy.Circle;
import com.practice2.model.entitiy.Point;
import com.practice2.model.entitiy.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle[] cArray = new Circle[] { new Circle(10, 10, 50), new Circle(100, 100, 35), new Circle(200, 200, 40) };
		Rectangle[] rArray = new Rectangle[] { new Rectangle(50, 50, 100, 100), new Rectangle(150, 150, 200, 200),
				new Rectangle(250, 250, 300, 300) };

		for (Rectangle r : rArray) {
			r.draw();
		}

		Point[] pArray = new Point[6];
		pArray[0] = new Circle(100, 100, 50);
		pArray[1] = new Rectangle(100, 100, 50, 100);
		pArray[2] = new Circle(150, 100, 40);
		pArray[3] = new Rectangle(200, 100, 50, 100);
		pArray[4] = new Circle(100, 130, 20);
		pArray[5] = new Point(50, 100);

		for (int i = 0; i < pArray.length; i++) {
			pArray[i].draw(); // 컴파일시 부모의 draw()가 연결됨 : 정적 바인딩
								// 실행시 참조하는 객체타입에 따라 draw()의 연결이 바뀜 : 동적 바인딩
			// 참조하는 객체 인스턴스 클래스의 오버라이딩된 draw() 메소드로 연결이 바뀜
		}
		
		
		

}}
