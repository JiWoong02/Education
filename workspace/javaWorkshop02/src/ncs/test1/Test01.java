package ncs.test1;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("5개의 점수를 공백으로 구분하여 입력해주세요.");
		String[] strScore = new java.util.Scanner(System.in).nextLine().split(" ");
		int[] score = new int[5];
		char pass = '0';
		if (strScore.length != 5) {
			System.out.println("다시 입력하세요 . ");
		} else {
			for (int i = 0; i < strScore.length; i++) {
				score[i] = Integer.parseInt(strScore[i]);
			}
			for (int i = 0; i < score.length; i++) {
				if (score[i] < 10 || score[i] > 99) {
					pass = 'F';
				}
			}
			if (pass == 'F') {
				System.out.println("다시 입력 하세요");
			}else
			{
				int totScore = ((score[0] + score[1]) / 2) * 60 / 100 + ((score[2] + score[3]) / 2) * 20 / 100
						+ score[4] * 20 / 100;
				String result;
				if (totScore >= 90) {
					result = "Gold Class";
				} else if (totScore >= 80) {
					result = "Silver Class";
				} else if (totScore >= 70) {
					result = "Bronze Class";
				} else {
					result = "Normal Class";
				}

				System.out.println("평가점수 : " + totScore);
				System.out.println("Class : " + result);
			}
		}
	}
}
