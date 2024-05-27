package ncs.test2;

public class ListTest {

	public static void main(String[] args) {

		int[] iarray = new int[10];
		ListTest lt=new ListTest();
		lt.init(iarray);
		System.out.print("정렬전 : ");
		lt.display(iarray);
		lt.sort(iarray);
		System.out.print("정렬후 : ");
		lt.display(iarray);

	}

	public void init(int[] array) {
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);
		}
	}

	public void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}System.out.println();
	}

	public int compare(int d1, int d2) {
		return d1 - d2;
	}

	public void sort(int[] array) {
		int temp =0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if(compare(array[i],array[j])<0) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}
}
