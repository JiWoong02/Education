package oop.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Triangle;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Circle(10.5);
		iarr[1] = new Rectangle(20,13.5);
		iarr[2] = new Triangle(11.2,13.3);
		iarr[3] = new Circle(14.3);
		iarr[4] = new Triangle(13.1,14.3);
		//5개의 객체를 무작위로 생성함(Circle, Rectangle, Triangle)	
		//for loop 문으로 각 객체의 면적과 둘레를 출력 처리함
		//단, Triangle 객체는 빗변길이도 출력 처리함	
		
		for(IShape i:iarr) {
			if(i instanceof Circle ) {
				Circle c = (Circle)i;
				System.out.println("원 면적 : " + c.area());
				System.out.println("원 둘레 : " + c.perimeter());
			} else if (i instanceof Rectangle) {
				Rectangle r=(Rectangle)i;
				System.out.println("사각형면적 : " + r.area());
				System.out.println("사각형둘레 : " + r.perimeter());
			}
			else {
				Triangle t =(Triangle)i;
				System.out.println("삼각형면적 : " + t.area());
				System.out.println("삼각형둘레 : " + t.perimeter());
				System.out.println("빗변 길이 : " + t.getHypotenuse());
			}
		}//for
		
	}

}
