# chap03_practice.py
# 문자자료형 실습문제

'''
키보드로 입력받아 요구대로 처리하고 출력하시오.
입력내용 :
회원이름 : 이순신(member_name : str)
회원아이디 : leess88@ict.org(member_id : str)
패스워드 : pass1234 (member_passwd : str)
나이 : 45 (age : int)
키 : 187.5 (height : float)
출력내용 : format() 메소드 사용함
이순신 회원의 아이디는 leess88@ict.org 이고, 암호는 pass**** 입니다.
나이는 45세이고, 키는 187.5cm 입니다.
- 출력시 처리조건 : 
암호는 첫글자부터 4글자만 슬라이싱한 다음 나머지 글자수에 맞춰서 *로 출력되게 함
키는 소숫점아래 첫자리까지만 출력되게 포멧팅함
'''
member_name = input('이름을 입력해주세요 : ')
member_id = input('아이디를 입력해주세요 : ')
pwd1 = input('패스워드를 입력해주세요 : ')
pwd2 = pwd1[0:4]
a = len(pwd1) - len(pwd2)
member_passwd = pwd2 + '*' * a
age = int(input('나이를 입력해주세요 : '))
height = float(input('키를 입력해주세요 : '))
print(f'{member_name} 회원의 아이디는 {member_id} 이고, 암호는{member_passwd} 입니다. \n나이는 {age}세이고, 키는 {height:.1f}cm 입니다. ')
print('{0} 회원의 아이디는{1} 이고, 암호는{2} 입니다. \n나이는{3}세이고, 키는{4:.1f}cm 입니다.'.format(member_name, member_id, member_passwd, age, height))