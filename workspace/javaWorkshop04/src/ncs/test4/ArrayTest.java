package ncs.test4;

import java.util.Random;

public class ArrayTest {
	
	public static void main(String[] args) {
//		+main(String args[]): void main 함수 안에서 
//		배열 할당, 값 기
//		록 처리, 메소드 실행, 결과 출력 처
//		리함
//		+ sum(arr : int[]) : int 배열의 합계를 
//		계산해서 리턴함
//		+ avg(arr : int[]) : double 배열의 평균을 
//		계산해서 리턴함
//		+ max(arr : int[]) : int 배열에서 가장 큰 값을 찾아서 리턴
//		+ min(arr : int[]) : int 배열에서 가장 작은값 찾아서 리턴
//		+ evenCount(arr : int[]) : int 배열에서 짝수의 개수를 리턴함
//		+ oddCount(arr : int[]) : int 배열에서 홀수의 개수를 리턴함
//		+ print(arr : int[]) : void 배열 값들 출력
		int [] array = new int[10];
		Random r = new java.util.Random();
		ArrayTest at = new ArrayTest();
		for(int i=0;i<array.length;i++) {
			array[i]=r.nextInt(100);
		}
		System.out.println("할당된 배열의 크기 : " + array.length);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+"  ");
		}
		System.out.println("가장 큰 값 : "+ at.max(array) );
		System.out.println("가장 작은 값 : "+ at.min(array));
		System.out.println("짝수의 개수 : "+ at.evenCount(array));
		System.out.println("홀수의 개수 : "+ at.oddCount(array));
		System.out.println("합계 : "+ at.sum(array));
		System.out.println("평균 : "+ at.avg(array));
	}
	public int sum(int[] arr) {
		int sum = 0;
		for(int a : arr) {
			sum +=a;
		}
		return sum;
	}
	public double avg(int[] arr) {
		int sum = 0;
		for(int a : arr) {
			sum +=a;
		}
		return sum/arr.length;
	}
	public int max(int[] arr) {
		int max = 0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}return max;
	}
	public int min(int[] arr){
		int min = arr[0];
		for(int i =0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}return min;
	}
	public int  evenCount(int[] arr) {
		int count = 0;
		for(int a : arr) {
			if(a%2==0) {
				count++;
			}
		}
		return count;
	}
	public int  oddCount(int[] arr) {
		int count = 0;
		for(int a : arr) {
			if(a%2!=0) {
				count++;
			}
		}
		return count;
	}
	public void print(int[] arr) {
		for(int a:arr) {
			System.out.print(a+ "   ");
		}
	}
}
