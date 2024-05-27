package array.sample;

import java.util.Random;

public class ArraySample {
	// 기본자료형 확인용 기능 제공

	// 자바는 static(정적) 메모리와 heap(자유) 메모리에 할당되는 변수 방에는
	// 초기값 지정이 없으면 jvm이 준비한 기본값(default value)을 자동으로 기록해 넣음

	// static 은 멤버변수(Field), 멤버함수(Method)에만 사용할 수 있음
	// 필드선언형식 : 접근제한자 [예약어] 자료형 변수명[= 초기값];
	private static boolean flag;
	private static char level;
	private static int score;
	private static double point;
	private static String str; // 레퍼런스 변수, null로 초기화
	// 프로그램이 실행될 때 (main() 메소드가 start 될 때) 자동으로 static 메모리 쪽에 알아서 방을 만듬
	// main() 메소드가 종료될 때(프로그램이 끝날 때) 자동으로 소멸됨(제거됨)

	public void testStaticField() {
		System.out.println("ststic 메모리에 할당된 필드 초기값 확인");
		System.out.println("flag : " + flag);// false
		System.out.println("level : " + level);// u000
		System.out.println("score : " + score);// 0
		System.out.println("point : " + point); // 0.0
		System.out.println("str : " + str);
	}

	public void testDefaultValue() {
		// 지역변수(Local Valuable) : 메소드 안, 제어문 안에서 만들어진 변수
		// 선언형식 : [예약어] 자료형 변수명 = 초기값;
		// 예약어는 final 만 사용할 수 있음 => final 자료형 변수명 = 초기값; => 변수의 값 변경 불가능
		//
		boolean[] flags = new boolean[2];
		char[] codes = new char[2];
		int[] values = new int[2];
		double[] points = new double[2];
		String[] strValues = new String[2]; // 클래스를 자료형으로 만든 변수(레퍼런스변수임)

		// 기본값 기록 확인
		for (int i = 0; i < 2; i++) {
			System.out.println(i + "번째 방의 기록값 : " + flags[i] + ", " + codes[i] + ", " + values[i] + ", " + points[i]
					+ ", " + strValues[i]);
		}
	}

	public void testArray1() {
		// 1. 배열 선언 : 배열공간의 주소 저장용 레퍼런스변수 만들기
		// 자료형[] 배열명; => 배열명 == 배열 레퍼런스
		int[] ar;

		// 2. 배열 할당 : 자바에서는 배열공간을 힙(heap)에 할당하고,
		// 발생한 주소(위치정보)를 준비된 배열레퍼런스에 저장 처리함
		// 배열명 = new 자료형 [방갯수]; => 첨자(방갯수) : 정수값 | 정수변수 사용 가능함
		ar = new int[5];

		// 3. 베열공간 사용 : 값 기록 또는 값 읽어오기
		// 배열명[순번] => 순번(index) : 각 방에 부여된 순서에 대한 번호(0부터 시작함)
		ar[0] = 25;
		ar[1] = 33;
		ar[2] = 45;
		ar[3] = 55;
		ar[4] = 67;
		// ar[5] = 78; //error : ArrayIndexOutOfBoundsException (인덱스 범위 초과시 발생)
		System.out.println("할당된 방 갯수 : " + ar.length);
		// 배열 데이터 처리에는 주로 for 문을 사용함
		for (int index = 0; index < ar.length; index++) {
			System.out.println("ar[" + index + "] : " + ar[index]);
		}

	}

	public void testArray2() {
		// 배열 선언과 배열 할당을 한번에 선언할 수도 있음
		// 자료형[] 배열명 = new 자료형[첨자];
		// 자료형 []배열명 = new 자료형[첨자];
		// 자료형 배열명[] = new 자료형[첨자];
		double[] dar = new double[10];

		System.out.println("할당된 방 갯수 : " + dar.length);
		// 배열 데이터 처리에는 for 문을 주로 사용함

		for (int i = 0; i < dar.length; i++) {
			dar[i] = Math.random();
		}

		// 출력 확인
		for (int i = 0; i < dar.length; i++) {
			System.out.print(dar[i] + "             ");
		}
		System.out.println();

	}

	public void testArray3() {
		// 1부터 100까지 정수를 10개 난수로 발생시켜 기록 저장한 다음, 합계를 구해서 출력
		Random r = new Random();
		int[] samp = new int[10];
		int sum = 0;
		for (int i = 1; i < samp.length; i++) {
			samp[i] = r.nextInt(100) + 1;
			sum += samp[i];
		}

		// 값 출력

		for (int i = 1; i < samp.length; i++) {
			if (i == samp.length - 1)
				System.out.print(samp[i] + " = ");
			else {
				System.out.print(samp[i] + " + ");
			}
		}
		System.out.println(sum);
	}

	public void arrayInitialization() {
		// 배열 초기화 : 배열 선언과 동시에 초기값 기록 처리하는 것
		// 자료형[] 배열명 = {초기값, 초기값, 초기값, ......, 초기값};
		// int[] ar = {12, 23, 34, 45, 56}; ==> 초기화가 한개의 구문이어야 함
//		int[] ar; //레퍼런스 선언과 초기화를 분리할 수 없음
//		ar = {12, 23, 34, 45, 56};//에러남

		// 자료형[] 배열명 = new 자료형[]{초기값, 초기값, 초기값,......};
		int[] ar; // 레퍼런스 선언과 초기화를 분리할 수 있음
		ar = new int[] { 12, 23, 34, 45, 56 };
		// 초기값의 갯수가 할당될 방갯수가 되므로, 자료형[] 안에 첨자 사용하면 안됨

		System.out.println("ar.length : " + ar.length);

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}
	}

	public void arrayCopy() {
		// 배열 복사
		int[] ar = { 12, 54, 27, 43, 77 };

		int[] copyAr = ar; // 이건 주소를 복사받은거임 // 얕은복사(Shallow Copy) ==> 주소복사 !
		int[] br = new int[ar.length];
		for(int i=0; i<br.length;i++) {
			br[i] =ar[i]; //깊은 복사(Deep Copy) : 값을 복사함
		}
		int[] cr = new int[ar.length];
		System.arraycopy(ar, 0, br, 0, ar.length);
		//주의사항 : 배열의 인덱스 범위를 벗어나지 않도록 할 것
		//System.arraycopy(ar, 0, cr, 1, ar.length); //에러
		System.arraycopy(ar, 0, cr, 0, ar.length);
		//출력 확인
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i] + " ");
				}
		System.out.println();
		for(int i=0; i<br.length;i++) {
			System.out.print(br[i] + " ");
				}
		System.out.println();
		for(int i=0; i<cr.length;i++) {
			System.out.print(cr[i] + " ");
				}
		System.out.println();
	}
}
