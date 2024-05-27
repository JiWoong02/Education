package test.method;

public class NonStaticSample {
	public NonStaticSample(){}
	
	//1. 반환값 없고 매개변수 없는 메소드
	//실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	//메소드명 : printLottoNumbers
	public void printLottoNumbers(){
		int[] lottos = new int[6];
		
		//값 발생
		for(int i = 0; i < lottos.length; i++){
			lottos[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++){  //중복검사
				if(lottos[i] == lottos[j]){
					i--;
					break;
				}
			}
		}
		
		//출력
		for(int i = 0; i < lottos.length; i++)
			System.out.print(lottos[i] + "   ");
		System.out.println();

		return;
	}
	
	//2. 반환값 없고 매개변수 있는 메소드
	//실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	//메소드명 : outputChar
	public void outputChar(int count, char c){
		for(int k = 1; k <= count; k++)
			System.out.print(c + "   ");
		System.out.println();
		
		return;
	}
	
	//3. 반환값 있고 매개변수 없는 메소드
	//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	//메소드명 : alphabette
	public char alphabette(){
		int code = 0;
		do{		//65 ~ 122 까지의 정수중 임의의 정수 발생시킴
			code = (int)(Math.random() * ('z' - 'A' + 1)) + 65;
			
			//if(Character.isAlphabetic(code)){
			if((code >= 'A' && code <= 'Z') || (code >= 'a' && code <= 'z'))
				break;
		}while(true);
		
		return (char)code;
	}
	
	//4. 반환값 있고 매개변수 있는 메소드
	//실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	//추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	//메소드명 : mySubstring
	public String mySubstring(String s, int beginIndex, int endIndex){
		String returnValue = null;
		
		if(s != null && s.length() > 0){  //전달된 문자열값이 있는지 확인
			if(beginIndex < s.length() && endIndex < s.length()){
				//인덱스가 글자 갯수보다 작은지 확인
				if(beginIndex < endIndex){
					//시작 인덱스가 끝 인덱스보다 작은 값인지 확인
					returnValue = String.valueOf(s.charAt(beginIndex)); //첫번째 값은 String 이어야 함
					for(int i = beginIndex + 1; i <= endIndex; i++){
						returnValue += s.charAt(i);
					}
				}
			}
		}
		
		return returnValue;
	}
}



