package com.practice2.model.entitiy;

public class Circle extends Point {

 //Field
	private int radius;
//Constructor
	public Circle() {
		super();
	}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius =radius;
	}
//Method
	public void draw() {
		System.out.println("원의 x 좌표 : " + x);
		System.out.println("원의 y 좌표 : " + y);
		System.out.println("원의 면적 : " + (int)(Math.PI*radius*radius*10)/10);
		System.out.println("원의 둘레 : " + (int)(2*Math.PI*radius*10)/10);
	}
}
