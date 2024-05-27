package ncs.test2;

public class CharTest {

	public static void main(String[] args) {
		String str = args[0];
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			if(ch[i]>='a'&&ch[i]<='z')
			System.out.print((char)(ch[i]-32));
			else System.out.print(ch[i]);
		}
	}

}
