package test.method;

public class NonStaticRun {
	public static void main(String[] args) {
		NonStaticSample test = new NonStaticSample();
//		test.printLottoNumbers();
//		test.outputChar(5, 'a');
//		System.out.println(test.alphabette());
		System.out.println(test.mySubstring("HelloWorld", 3, 5));
	}
}