package array.premitive;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	public void test1() {
		Random r = new Random();
		int[] num = new int[10];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100) + 1;
			if (i == num.length - 1) {
				sum += num[i];
				System.out.print(num[i] + " = " + sum);
			} else {
				System.out.print(num[i] + " + ");
				sum += num[i];
			}
		}
	}

	public void test2() {
		int[] num = new int[10];
		int max = 0, min = 0;
		int maxi = 0, mini = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			System.out.print(num[i] + "      ");
		}
		max = num[0];
		min = num[0];
		for (int i = 0; i < num.length - 1; i++) {
			if (max < num[i + 1]) {
				max = num[i + 1];
				maxi = i + 1;
			}
			if (min > num[i + 1]) {
				min = num[i + 1];
				mini = i + 1;
			}
		}
		System.out.println();
		System.out.println("max num[" + maxi + "] : " + max + "\nmin num[" + mini + "] : " + min);
	}

	public void test3() {
		// 바이트와 쇼트 자료형은 계산 결과가 무조건 인트다.
		Random r = new Random();
		byte[] num = new byte[10];
		r.nextBytes(num);
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum += Math.abs(num[i]);
				System.out.print("num[" + i + "] : " + num[i] + "\t");
			}
		}
		System.out.println();
		System.out.println(" 짝수들의 합 :  " + sum);
	}

	public void test4() {
		System.out.print("숫자로된 문자열을 입력해 주세요 : ");
		String str = new Scanner(System.in).next();
		int[] num = new int[str.length()];
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			// String num = value.substring(i, i+1); //"8" => 8
			// String 형태의 기본자료형 값을 => 실제 계산이 가능한 기본자료형 값으로
			// 바꾸는 것 파싱(parsing) >> java.lang 패키지에 Wrapper 클래스에서 제공됨
			// 각 자료형별로 "false" -> false : Boolean.parse("false")
			// "7" -> 7 : Integer.parseInt("7")
			// "3.5" -> 3.5 : Double.parseDouble("3.5")
			num[i] = Integer.parseInt(str.substring(i, i + 1));
			sum += num[i];
		}
		System.out.println(sum);
	}

	public void test5() {
		Character ch = new Character('a');
		System.out.print("숫자로된 문자열을 입력해 주세요 : ");
		String str = new Scanner(System.in).next();
		int[] num = new int[str.length()];
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			num[i] = ch.getNumericValue(str.charAt(i));
			sum += num[i];
		}
		System.out.println(sum);

	}

	public void test6() {
		String personID = "881225-1234567";
		String birthday = personID.substring(0, 6);
//		char gender = personID.substring(7, 8).charAt(0);
		char gender = personID.charAt(7);
		int birthYear = Integer.parseInt(birthday.substring(0, 2)) + 1900;
		int birthMonth = Integer.parseInt(birthday.substring(2, 4));
		int birthDay = Integer.parseInt(birthday.substring(4, 6));
		GregorianCalendar birth = new GregorianCalendar(birthYear, birthMonth - 1, birthDay);
		// 1월이 0부터 기록되기 때문에 -1해줘야 정상작동
		switch (birth.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("일요일"); break;
		case 2:
			System.out.println("월요일");break;
		case 3:
			System.out.println("화요일");break;
		case 4:
			System.out.println("수요일");break;
		case 5:
			System.out.println("목요일");break;
		case 6:
			System.out.println("금요일");break;
		case 7:
			System.out.println("토요일");break;
		}
		System.out.println("성별 : " + (gender=='1'? "남자":"여자"));
		
		int bYear = birth.get(Calendar.YEAR);
		int todayYear= new GregorianCalendar().get(Calendar.YEAR);
		System.out.println(bYear + ", " + todayYear);
		
		System.out.println("현재 나이 : " + (todayYear = bYear));
		System.out.println(new Date());
		System.out.println(new GregorianCalendar());
		System.out.println(Calendar.getInstance());
	}

}
