package array2.model;

public class Student {
		//Field
		private char sclass;//반 클래스 종류 : A, B, C 클래스로 분류
		private String sname;//학생이름
		private int score;//점수
		
		public Student() {}
		public Student(char sclass, String name, int score) {
			this.sclass=sclass;
			this.sname =sname;
			this.score=score;
		}
		public void setSclass(char sclass) {
			this.sclass=sclass;
		}
		public char getSclass() {
			return this.sclass;
		}
		public void setSname(String sname) {
			this.sname=sname;
		}
		public String getSname() {
			return this.sname;
		}
		public void setScore(int score) {
			this.score=score;
		}
		public int getScore() {
			return this.score;
		}
		public String information() {
			return "["+this.sclass+"]" + this.sname + " : " + this.score;
		}
}//class
