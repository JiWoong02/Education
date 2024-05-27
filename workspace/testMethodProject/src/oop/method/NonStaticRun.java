package oop.method;

public class NonStaticRun {

	public static void main(String[] args) {
		NonStaticSample samp = new NonStaticSample();
		int [] array = samp.intArrayAllocation(5);
		samp.display(array);
		
		samp.swap(array, 0, 3);
		samp.display(array);
		
		samp.sortDescending(array);
		samp.display(array);
		
		samp.sortAscending(array);
		samp.display(array);
		
		System.out.println(samp.totalValue(1, 100));
		System.out.println(samp.countChar("Hello", 'l'));
		System.out.println(samp.pCharAt("Hello", 3));
		System.out.println(samp.pConcat("Hello", " bro"));
		
	}

}
