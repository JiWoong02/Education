package array1.model;

public class Person {
	private String name; //이름
	private int age; //나이
	private char gender; //성별
	private double height; //키
	private double weight; //몸무게
	
	public Person() {}
	public Person(String name, int age ,char gender, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender =gender;
		this.height = height;
		this.weight = weight;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return this.gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public String information() {
		return name +"  "+gender + "  "+age +"  "+height +"  "+weight; 
	}
	
}//class
