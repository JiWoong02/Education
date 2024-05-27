package dice;

public class Dice {

	public static void main(String[] args) {
		int[][] q = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 3, 3, 3, 3, 4, 4 }, { 1, 3, 3, 4, 4, 4 },
				{ 1, 1, 4, 4, 5, 5 } };
		Solution solution = new Solution();
		int[] ans = solution.solution(q);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}

class Solution {
	public int[] solution(int[][] dice) {
		int[] sum = new int[dice.length];
		for (int i = 0; i < dice.length; i++) {
			int s = 0;
			for (int j = 0; j < dice[i].length; j++) {
				s += dice[i][j];
			}
			sum[i] = s;
		}
//		for(int i=0; i<sum.length;i++) {
//			for(int j=i+1; j<sum.length;j++) {
//				if(sum[j]>sum[i]) {
//					int bin = sum[j];
//					sum[j]=sum[i];
//					sum[i]=bin;
//				}
//			}
//		}
		// A가 가져가는 주사위 수 = dice.length/2;
		int answerLength = dice.length / 2;
		int[] answer = new int[answerLength];
		int max = 0;
		int maxIndex = 0;
		int index = 0;
		// 숫자 4개 가장 큰거 두개 뽑겠다.
		for (int k = 0; k < answerLength; k++) {
			for (int i = 0; i < sum.length; i++) {
				if ((sum[i] > max)&&(기존에 있던 값과 같지 않으면)) {
					max = sum[i];
					answer[k] = i + 1;
				}
			}
		}

		return answer;
		//4개의 배열에서 가장큰 숫자 순으로 2개의 index를 뽑겠다.
	}
}