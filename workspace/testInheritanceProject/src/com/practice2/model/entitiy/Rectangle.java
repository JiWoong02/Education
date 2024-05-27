package com.practice2.model.entitiy;

public class Rectangle extends Point{
//Field
	private int width; //가로너비
	private int height;//세로높이
	
//Constructor
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width=width;
		this.height=height;
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	@Override
	public void draw() {
		System.out.println("사각형의  x좌표 : " + x);
		System.out.println("사각형의  y좌표 : " + y);
		System.out.println("사각형의 면적 : " + width * height);
		System.out.println("사격형의 둘레 : " + 2*width*height);
	}
	
}
