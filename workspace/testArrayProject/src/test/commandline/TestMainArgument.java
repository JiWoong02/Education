package test.commandline;

public class TestMainArgument {

	public static void main(String[] args) {
		// 명령프롬프트에서 프로그램 실행 시 main() 메소드로 값을 전달할 수 있음
		// ...>명령어 전달값 전달값
		if (args.length == 5) {
			String name = args[0];
			char gender = args[1].charAt(0);
			int age = Integer.parseInt(args[2]);
			
			double height = Double.parseDouble(args[3]);
			double weight = Double.parseDouble(args[4]);

			System.out.println("이름 : " + name);
			System.out.println("성별 : " + gender);
			System.out.println("나이 : " + age);
			System.out.println("키 : " + height);
			System.out.println("몸무게 : " + weight);
		} else {
			System.out.println("전달값은 반드시 5개여야 합니다.");
		}
	}

}
