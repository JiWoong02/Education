package com.practice2.model.entitiy;

public class Point {

	//Field
	protected int x;
	protected int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void draw() {
		System.out.println("x 좌표 : " + this.x + ", y 좌표 : " + this.y);
	}
}
