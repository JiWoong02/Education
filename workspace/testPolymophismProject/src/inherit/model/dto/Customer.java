package inherit.model.dto;

import java.util.Objects;

public class Customer extends Person {
		//Field
		private String address;
		private double point;
		
		//Constructor
		public Customer() {
			super();
		}

		public Customer(String name, int age, char gender, String email, String phone,String address, double point) {
			super(name, age, gender, email, phone);
			this.address = address;
			this.point = point;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getPoint() {
			return point;
		}

		public void setPoint(double point) {
			this.point = point;
		}
		
		//toString(), equals(), clone(), overriding
		
		@Override
		public String toString() {
			return "Customer [" + super.toString() +"address=" + address + ", point=" + point + "]";
		}

		@Override
		public boolean equals(Object obj) {
			// 두 객체의 필드값들이 일치하는지 확인
			Customer other = (Customer)obj;
			return super.equals(obj)&&this.address.equals(other.address)&&this.point==other.point;
		}

		@Override
		public Object clone() {
			//this 가 참조하는 객체의 필드값들을 복사한 새 객체 할당하고 주소 리턴
			return new Customer(this.getName(),this.getAge(),this.getGender(),this.getEmail(),this.getPhone(),this.address,this.point);
		}
		
		

		
		
		
		
		
		

		
		

}
