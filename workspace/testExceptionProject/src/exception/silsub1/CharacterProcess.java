package exception.silsub1;

public class CharacterProcess {
	public CharacterProcess() {
		super();
	}
	public int countAlpha(String s) throws CharCheckException {
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isSpaceChar(ch)) {
				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
			}else {
				if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
					count++;
				}
			}
		}
		return count;
	}
}
