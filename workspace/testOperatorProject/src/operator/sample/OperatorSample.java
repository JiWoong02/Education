package operator.sample;

import java.util.Scanner;

public class OperatorSample {
	
	public void 괄호연산자테스트() {
//			int num1 = 12;
//			int num2 = 33;
		int num1 = 12, num2 = 33;//자료형이 같은 변수라면 ,(쉼표, 나열연산자)를
											  //사용하여 한번에 입력 가능하다.
		System.out.println("계산1 : " + (num1 + 5 * num2)); //예상 값 : 177
		System.out.println("계산2 : " + ((num1 + 5) * num2)); //예상 값 : 561	
	}
	
	public void 부호연산자테스트() {
		
		int num = -25;
		System.out.println("num : " + +num); // +1 * -25 = -25
		System.out.println("num : " + -num); // -1 * -25 = +25
		
	}
	public void 증감연산자테스트() {
		//++ : 1증가, -- : 1감소
		int num=10;//메소드 안에서 만들어 졌기 때문에 지역변수, 메소드가 끝나면 알아서 지워짐. 동적메모리 stack에 생성
		System.out.println("num : " + num); //num : 10
		
		num++; //num = num + 1;  오른쪽은 cpu에서 계산하고 다시 메모리로 넣기 때문에 왼쪽이 훨씬 속도가 빠르다.
		System.out.println("num : " + num);//num : 11
		
		++num; //num = num + 1;  
		System.out.println("num : " + num);//num : 12
		
		num--; //num = num - 1;  
		System.out.println("num : " + num);//num : 11
		
		--num; //num = num - 1;  
		System.out.println("num : " + num);//num : 10
		//증감연산자가 변수와 함께 단독 사용시에는 변수 앞/뒤 구분 안 함 : 결과는 동일함
		
		//증감연산자가 변수와 함께 다른 문장 또는 계산식의 일부로 사용될 경우
		//변수 앞/뒤 구분해야 함 : 계산 결과가 달라짐
		int result = num++; //단독사용이 아님. ++이 뒤에 붙으면처리 후 증가를 의미함
		//result = num;  num++;
		System.out.println("result : " + result); //10
		System.out.println("num : " + num); //11 
		//result 는 10, num은 11 즉, 계산 후 증가됨
		
		int result2 = ++result; //선증가 후처리를 의미함
		//++result; ==> result2 = result;
		System.out.println("result : " + result); // 11
		System.out.println("result2 : " + result2); //11
		
		System.out.println("result2++ : " + result2++); //11  출력구문 안에서도 선증가 후증가를 따진다.
		System.out.println("result2 : " + result2); //12
		
		System.out.println("result2++ : " + ++result2);  //13
	}
	
	public void 형변환_연산자테스트() {
		byte b1 = Byte.MAX_VALUE; //127 static이 붙어있다면 new를 사용하지 않아도 가능하다
		short s1 = Short.MAX_VALUE; // 32767
		
		int result = b1 + s1; //바이트 쇼트던 바이트 바이트던 결과는 인트
									  //byte와 short 의 연산 결과형은 int다.
		short result2 = (short)(b1+s1); //overflow가 될것이다 short 최대값은 32767
		
		System.out.println("result : "+ result);
		System.out.println("result2 : " + result2);
	}
	public void 비교연산자테스트() {
		
		int first = 100, second = 123;
		
		System.out.println("first > second : " + (first>second)); //false
		System.out.println("first < second : " + (first<second)); //true
		System.out.println("first > 0 : " + (first>0)); //양수냐? true
		System.out.println("first >= 100 : " + (first>=100)); //> or ==  true /100이상이냐?
		System.out.println("second <= 200 : " + (second<=200)); //200이하냐? true
		System.out.println("first == 100 : " + (first==100)); //true
		System.out.println("first != 100 : " + (first!=100)); //100이 아니냐 false
	}
	
	public void 일반논리연산자테스트() {
		//논리값(true, false)을 계산에 사용하는 연산자
		//&& : 11순위, || : 12순위
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		System.out.println("------------------------------------------------------");
		
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
	}
	
	public void 일반논리연산자연습() {
		//&& : 제시한 모든 조건이 다 맞는지(true) 확인할 때
		//값의 범위를 확인하는 용도로 많이 쓰임
		
		
		//예 : 키보드로 정수를 하나 입력받아,
		//입력된 정수가 1부터 100사이의 값인지 확인 출력 처리함
		//1<= 정수 && 정수 <=100
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		//int num = sc.nextInt();
		int num = new Scanner(System.in).nextInt(); //한 줄로도 표현 가능하당//여러 구문을 처리할때는 이렇게하면
																		//계속해서 new를 선언해서 메모리를 새로 할당하기 때문에 안좋은 방법
		
		System.out.println((num>=1)&&(num<=100)?//보통 비교연산자를 오른쪽 항에 둔다.
				"당신이 입력한 정수는 1~100사이의 수 입니다." : "당신이 입력한 정수는 1~100을 벗어납니다.");
	}
	
		public void isPositiveNumber() {
			// 연습 1 : 키보드로 정수를 하나 입력받아, 양수인지 확인하는 출력 구문 작성
			System.out.print("정수를 입력해 주세요 : ");
			int num = new Scanner(System.in).nextInt();
			
			System.out.println(num + "은 양수인가 ? " + (num>0));
			
		}
	
		public void isUppercase() {
			//연습2 : 
			//키보드로 문자 하나를 입력받아, 영문대문자인지 확인 출력
			//'A' <= 문자 <= 'Z' 또는 'A'의 유니코드가 65 'Z'의 유니코드는 91
			
			/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
			//CASE1
//			System.out.print("문자를 입력해 주세요 : ");
//			char word = new Scanner(System.in).next().charAt(0);
//			int num =(int)(word);
//			
//			System.out.println((num>=65&&num<=91)? ("문자 "+ word +" 는 대문자 입니다.")
//																						: ("문자 " + word + " 는 대문자가 아닙니다."));
			/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
			//CASE2		
			System.out.print("문자를 입력해 주세요 : ");
			char word = new Scanner(System.in).next().charAt(0);
			
			System.out.println((word>='A'&&word<='Z')? ("문자 "+ word +" 는 대문자 입니다.")
																						: ("문자 " + word + " 는 대문자가 아닙니다."));		
		}
		public void isYes() {
			//연습3 :
			//문자 하나를 입력받아, 'Y' 또는 'y'이냐에 대한 결과 출력
			System.out.print("문자를 입력해 주세요 : ");
			char word = new Scanner(System.in).next().charAt(0);
			
			System.out.println((word=='y'||word=='Y')? ("문자 "+ word +" 는 yes입니다.")
																						: ("문자 " + word + " 는 yes가 아닙니다."));
		}
		
		public void isPass() {
			//연습4 : 
			//국어(kor), 영어(eng), 수학(mat) 3과목의 점수를 정수로 입력받아
			//총점(tot)과 평균(avg)을 계산하고
			//3과목의 점수가 각각 40점이상이고, 평균이 60점 이상이면 true,
			//아니면 false가 출력되게 처리
			Scanner sc = new Scanner(System.in);
			System.out.print("국어 점수를 입력해 주세요 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수를 입력해 주세요 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수를 입력해 주세요 : ");
			int mat = sc.nextInt();
			int tot = kor + eng + mat;
			double avg = (double)tot/3;
//			System.out.println(avg);
			System.out.println((kor>=40)&&(eng>=40)&&(mat>=40)&&(avg>=60));
		}
		
		//&&, || 연산자의 특징 확인
		//&& 는 앞이 거짓이면 뒤를 실행 안 함
		// true && true => true 이 경우 뒤까지 연산
		// true && false, false && true, false && false => false
		// || 는 앞이 참이면 뒤를 실행 안 함
		// true || true, true || false, false || true ==> true
		// false || false => false
		public void 일반논리연산자특징확인() {
			int num = 10;
			
			System.out.println(false && ++num > 0);//만약 뒤까지 연산을 한다면 num변수는 11로 바뀌어야 함
			                                                           //연산순서 상 num에 1이 가산된 후 비교연산자 실행
			                                                            //false
			System.out.println("num : " + num); //10으로 출력된다.
			System.out.println(true || ++num > 0); //true
			System.out.println("num : " + num);
			//비트논리연산자인 & , | 를 논리식에 사용할 경우 뒤까지 모두 실행
			//계산은 적게할 수록 좋기 때문에 일반논리연산자가 권장
			System.out.println(false & ++num > 0);//false
			System.out.println("num : " + num); //11로 출력된다.
			System.out.println(true | ++num > 0); //true
			System.out.println("num : " + num);//11
		}
		
		public void 삼항연산자테스트() {
			//첫번째 ? 두번째 : 세번째
			//첫번째는 조건식을 사용함 : 반드시 참 또는 거짓의 결과가 나오게 작성
			//(조건식) ? 참일 때 사용할 값 : 거짓일 때 사용할 값
			
			//연습 : 정수를 하나 입력받아
			//         짝수이면 "짝수다" 라고 출력하고, 짝수가 아니면 "홀수다" 라고 출력 처리
			//2로 나누었을 때 나머지가 0이냐 1이냐
			System.out.print("정수를 입력해 주세요 : ");
			int num = new Scanner(System.in).nextInt();
			
			System.out.println(num + "은" +" "+ ((num % 2==0)? "짝수다" : "홀수다"));	
			
		}
		
		//삼항연산자 중첩 사용
		// 조건1 ? 값1 : (조건 2 ? 값2 : (조건 3? 값3 : 값4))
		public void 삼항연산자중첩사용() {
			//예 : 정수를 하나 입력받아, 양수이면 "양수다", 0이면 "0이다", 둘 다 아니면 "음수다" 출력
			System.out.print("정수 하나 입력 : ");
			int num = new Scanner(System.in).nextInt();
			
			String result = (
					(num > 0)? "양수다." : ((num ==0)? "0이다." : "음수다.") 
							);
					System.out.println(num + "은 " +result);
		}		
		public void 삼항연산자중첩사용2() {
			//연습 : 
			//문자를 하나 입력받아서 
			//영어대문자이면"upper", 소문자이면 "lower", 숫자문자이면"digit", 그 외 문자는 "etc"
			System.out.print("문자를 입력해 주세요 : ");
			char word = new Scanner(System.in).next().charAt(0);
			
			String result =(word>='A')&&(word<='Z')?"upper":
				((word>='a')&&(word<='z')?"lower":
					((word>='0')&&(word<='9')?"digit":"etc"));
			
			System.out.println( word + " is a "+result);	
		}
		public void printScoreGrade() {
			//연습 : 
			//점수(score : int)를 입력받아
			//점수가 90점 이상이면 'A', 80점이상 90점 미만이면 'B', 70점이상 80점 미만이면 'C',
			//60점 이상 70점 미만이면 'D', 60점 미만이면 'F' 를 문자변수에 기록하고
			//점수와 등급을 출력 처리함
			System.out.print("점수를 입력해 주세요 : ");
			
			int score = new Scanner(System.in).nextInt();
			
				char grade = score>100||score<0?'N':
								   (score>=90?'A':
								   (score>=80?'B':
									score>=70?'C':
									score>=60?'D':'F'));
			System.out.println((grade=='N')? "0과 100사이의 올바른 점수를 입력하세요" : ("점수 : " + score + ",등급 : " + grade));
		}
		
		public void isPass2() {
			//연습 : 
			//국어(kor), 영어(eng), 수학(mat) 3과목의 점수를 정수로 입력받아
			//총점(tot)과 평균(avg)을 계산하고
			//3과목의 점수가 각각 40점이상이고, 평균이 60점 이상이면 합격,
			//아니면 불합격이 출력되게 처리
			Scanner sc = new Scanner(System.in);
					System.out.print("국어 점수를 입력해 주세요 : ");
					int kor = sc.nextInt();
					System.out.print("영어 점수를 입력해 주세요 : ");
					int eng = sc.nextInt();
					System.out.print("수학 점수를 입력해 주세요 : ");
					int mat = sc.nextInt();
					int tot = kor + eng + mat;
					double avg = (double)tot/3;
					String result = kor>=40&&eng>=40&&mat>=40&&avg>=60?"합격":"불합격";
			System.out.println("결과 : "+result);
		}
		public void printGender() {
			//연습 : 
			//키보드로 주민등록번호를 입력받아, 8번째 자리 문자를 추출해서
			//'1'또는'3'이면 "남자", '2'또는 '4'이면 "여자"로 출력
			//'5'이면 "해외교포(남)" '6'이면 "해외교포(여)" 라고 출력
			//그 외 다른 값이면 "잘못된 주민번호입니다." 출력
			//입력 예 : 
			//주민등록번호 : 771225-1234567
			//출력 예 : 당신은 남자입니다.
			System.out.print("주민번호를 입력해 주세요.");
			char idnum = new Scanner(System.in).next().charAt(7);
			
			String gender = idnum=='1'||idnum=='3'? "남자":
							  idnum=='2'||idnum=='4'? "여자":
							 idnum=='5'?"해외교포(남)":
								 idnum=='6'?"해외교포(여)":"undefined";
			System.out.println(idnum);
			System.out.println(idnum>='1'&&idnum<='6'? "당신은 "+gender+" 입니다.":"잘못된 주민번호 입니다.");
			
		}
}
