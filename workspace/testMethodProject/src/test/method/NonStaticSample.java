package test.method;

import java.util.Scanner;

public class NonStaticSample {
	public NonStaticSample() {
	}

	public void printLottoNumbers() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) ((Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}

	public void outputChar(int num, char ch) {
		for (int i = 1; i <= num + 1; i++) {
			System.out.print(ch + "\t");
		}
	}

	public char alphabette() {
		int a = 0;
		do {
			a = (int) (Math.random() * (122 - 65 + 1) + 65);
		} while (a > 90 && a < 97);
		return (char) a;
	}

	public String mySubstring(String str, int beginIndex, int endIndex) {
		String returnValue = null;
		
		if(str!=null&&str.length()>0)
			if(beginIndex<str.length()&&str.length()<endIndex)
				if(beginIndex<endIndex) {
					returnValue = String.valueOf(str.charAt(beginIndex));//첫번째 값은 String 이어야 함
					for(int i=beginIndex+1;i<=endIndex;i++)
					{
						returnValue += str.charAt(i);
					}
				}
		return returnValue;
	}
}
