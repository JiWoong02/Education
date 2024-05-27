package test.controller;

public class Test2 {

	public static void main(String[] args) {
//		2단에서 5단까지의 구구단의 곱하기 결과 중 홀수인 것만 출력한다. 단, for문을 이용한다. 
		for(int i=2;i<6;i++)
		{
			for(int j =1; j<10;j++) {
				if((i*j)%2==1)
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}

}
