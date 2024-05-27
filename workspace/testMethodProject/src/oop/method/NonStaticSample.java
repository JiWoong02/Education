package oop.method;

public class NonStaticSample {
	public NonStaticSample() {
	}

	public int[] intArrayAllocation(int num) {
		if (num > 0) {
			int[] array = new int[num];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) (Math.random() * 100) + 1;
			}
			return array;
		} else {
			return null;
		}
	}

	public void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}

	public void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public void sortDescending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					swap(array, i, j);
				}
			}
		}
	}

	public void sortAscending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}

	public int countChar(String str, char ch) {
		if (str != null && str.length() > 0) {
			char[] strch = str.toCharArray();
			int count = 0;
			for (int i = 0; i < strch.length; i++) {
				if (strch[i] == ch) {
					count++;
				}
			}
			return count;
		} else
			return 0;
	}

	public int totalValue(int a, int b) {
		int max, min, sum=0;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		for(int i=min;i<max+1;i++) {
			sum+= i;
		}
		return sum;
	}

	public char pCharAt(String str, int index) {
		if (str != null && str.length() > 0) {
			char[] strch = str.toCharArray();
			return strch[index];
		} else
			return '0';
	}

	public String pConcat(String str1, String str2) {
		if (str1 != null && str1.length() > 0 && str2 != null && str2.length() > 0)
			return str1 + str2;
		else {
			return null;
		}
	}

}
