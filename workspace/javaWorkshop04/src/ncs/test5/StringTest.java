package ncs.test5;

public class StringTest {

	public static void main(String[] args) {
		String str = " A, b, c, D, a, B, C, d, f, F";

		String[] st = str.split(",");
		/* str에서 ‘, ‘ 으로 데이터를 분리한다. */;
		// st 에서 char[] 로 바꾼다.
		char[] data = new char[st.length];
		/* 배열 할당 선언 */;
		int count = 0;
		for (String str1 : st) { // for~each 문 사용한다.
			// char[] 배열에 문자 데이터를 넣는다
			str1 = str1.trim();
			data[count] = str1.charAt(0);
			count++;
		}
		count = 0;
//		  char[] 에서 대문자만 골라서 출력 한다. continue 문 사용할 것
		while (count<data.length) {
			if (data[count] < 'A' || data[count] > 'Z') {
				count++;
				continue;
			}
			System.out.println("data["+count+"] : " +data[count]);
			count++;
		} // while loop 문 사용한다.

	}

}
