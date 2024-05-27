package var.practice;

import java.util.Scanner;

public class Practice {
	
	public void myProfile() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		String name = sc.next();
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		System.out.print("성별을 입력하세요 :");
		//String s = sc.next(); //"여" or "남"
		//char gender = s.charAt(0); // '여' or '남'
		//위 두줄의 코드를 합치면 아래 코드가 된다.
		char gender = sc.next().charAt(0);
		
		System.out.print("번호를 입력하세요 :");
		String phone = sc.next();
		System.out.print("이메일을 입력하세요 :");
		String email = sc.next();
		System.out.println("신상정보 : " + name + "," + age + "세" 
		+ "," + gender + "," + phone + "," + email);
		
	
	}
	
	public void inputEmployee() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번을 입력하세요 :");
		String empId = sc.next();
		System.out.print("이름을 입력하세요 :");
		String empName = sc.next();
		System.out.print("주민번호 입력하세요 :");
		String empNo = sc.next();
		System.out.print("급여를 입력하세요 :");
		long salary = sc.nextLong();
		System.out.print("보너스지급율을 입력하세요 :");
		double bonusPct = sc.nextDouble();
		System.out.print("소속 부서를 입력하세요 :");
		String deptName = sc.next();
		System.out.print("직급을 입력하세요 :");
		String jobName = sc.next();
		
		System.out.println("직원정보 : " + empId + "," + empName 
				+ "," + empNo + "," + salary + "," + bonusPct
				+ ","+ deptName + "," + jobName
				);
		System.out.println("연봉 : " + (int)((salary +(salary * bonusPct))*12));
	
	}
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 :");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " " + "+" +  " " + num2 + " " + "=" + " " + (num1 + num2));
		System.out.println(num1 + " " + "-" + " " + num2 + " " + "=" + " " + (num1 - num2));
		System.out.println(num1 + " " + "*" + " " + num2 + " " + "=" + " " + (num1 * num2));
		System.out.println(num1 + " " + "/" + " " + num2 + " " + "="  + " " + (num1 / num2));
		System.out.println(num1 + " " + "%" + " " + num2 + " " + "=" + " " + (num1 % num2));
	}
	
	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 :");
		char word = sc.next().charAt(0);
		
		System.out.println(word+ " "+ "is"+" "+"unicode"+" "+ (int)word);
		
	}
	
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 외자 :");
		int num = sc.nextInt();
//		System.out.println((num)+"*"+"1"+"="+(num*1));
//		System.out.println((num)+"*"+"2"+"="+(num*2));
//		System.out.println((num)+"*"+"3"+"="+(num*3));
//		System.out.println((num)+"*"+"4"+"="+(num*4));
//		System.out.println((num)+"*"+"5"+"="+(num*5));
//		System.out.println((num)+"*"+"6"+"="+(num*6));
//		System.out.println((num)+"*"+"7"+"="+(num*7));
//		System.out.println((num)+"*"+"8"+"="+(num*8));
//		System.out.println((num)+"*"+"9"+"="+(num*9));
//		
		//위의 출력구문을 반복문 사용으로 바꾼 다음
		for(int su = 1; su < 10; su++) {
			System.out.println(num+"*"+ su +"="+(num * su));
			
		}
	}
	
	public void rectangleCalculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로길이를 입력하세요 :");
		double width = sc.nextDouble();
		System.out.print("세로길이를 입력하세요 :");
		double height = sc.nextDouble();
		
		double perimeter = (width+height)*2;
		double area = width*height;
		
		System.out.println("둘레길이 : " + perimeter);
		System.out.println("면적 : " + area);
		
	}
	
}
