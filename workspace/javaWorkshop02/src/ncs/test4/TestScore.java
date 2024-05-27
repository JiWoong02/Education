package ncs.test4;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] score = new double[3][5];
		char ch = '0';
		for (int j = 0; j < 3; j++) {
			ch = (j == 0) ? '첫' : ((j == 1) ? '두' : '세');
			for (int i = 0; i < 3; i++) {
				System.out.print(ch + "번째 학생의 과목" + (i +1)+ " 의 점수를 입력해주세요. :");
				score[j][i] = sc.nextDouble();
				score[j][3] +=score[j][i];
			}
		}
		for(int i=0;i<3;i++) {
			score[i][4] = score[i][3]/3;
		}
		System.out.println("index   "+"과목1\t"+"과목2\t"+"과목3\t"+"총점\t"+"평균");
		for(int i =0; i<3;i++) {
			System.out.print(i + "        ");
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j] + "  ");
			}System.out.println();
		}
		
	}
}
