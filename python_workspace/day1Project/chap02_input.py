# chap02_input.py

# 파이썬에서 실행시 키보드로 값 입력받기 : input() 함수 사용함
# 변수 = input('입력을 위한 메세지 문장 ')
#num = input()   # input 은 무조건 스트링
#num = input('숫자를 입력하세요')
# print('num : ', num, type(num))

# 파이썬의 input() 함수로 입력 들어오는 값은 모두 문자형(str)이다.
# print('더하기 : ' , num + 100)     # 숫자와 문자는 계산할 수 없다

# 숫자형으로 바꾸고자 한다면
# 정수는 int('정수문자'), 실수는 float('실수문자') 함수 사용함
# inum = int(num)
# print('inum : ', inum, type(inum))
# print('더하기 : ', inum + 100)

# 입력 예
# 정수 2개를 각각 입력받아서, 사칙연산 결과 출력 처리
# first = int(input("첫 번째 정수 : "))
# second = int(input("두 번째 정수 : "))
# print(first, ' + ', second, ' = ', (first + second))
# print(f'{first}-{second}={first-second}')   # f'str' : format string
# print('{} * {} = {}'.format(first, second, first * second))     # format() 함수 이용
# # format() 함수와 순번(index)을 적용한 출력문
# print('{1} / {0} = {2:.1f}'.format(first, second, first / second))
# print(f'{first} ** 2 = {first**2}')
# print(f'{second}**2 = {second**2}')
      
# 입력 연습
'''
신상정보를 입력받아, 각 변수에 저장하시오. 변수 이름은 임의대로 지정함
이름(str), 나이(int), 성별(str, 남 | 여 로 입력), 키(float), 몸무게(float)
각 변수의 값을 아래의 형식으로 출력하는 코드를 작성하시오.
홍길동은 27세 남자이고, 키는 178.5 cm 몸무게는 72.0kg 입니다.
'''

# name = input('이름을 입력해주세요')
# age = int(input('나이를 입력해주세요'))
# gender = input('성별을 입력해주세요(남|여)')
# height = float(input('키를 입력해주세요'))
# weight = float(input('몸무게를 입력해주세요'))
# print(f'{name}은 {age}세 {gender}자이고 키는 {height:.1f}cm 몸무게는 {weight:.1f}kg 입니다.')

# 입력 연습2
'''
키보드로 값을 입력받아 요구조건대로 처리하고 출력되게 코드를 작성하시오
기본값을 가진 변수 생성 할당해 둠 : 
    total_point = 12500
입력 내용 : 
    고객 이름 : 황지니 (custom_name : str)
처리 내용 : 
    결제금액의 5% 를 포인트(point : float)로 처리
    계산된 포인트를 누적포인트(total_point)에 증가 연산 처리함
출력 내용 : 
    황지니 고객님의 사용금액은 3000000 원, 발생 포인트는 150000
    현재 이용하실 수 있는 누적포인트는 162500 점입니다.    
'''
price = input('총 사용 금액은 ? ')
total_point = 12500
custom_name = '황지니'
# format() 사용
point = float(price) * 0.05
total_point += point
print('{0} 고객님의 사용금액은 {1} 원, 발생 포인트는 {2}\n현재 이용하실 수 있는 누적포인트는 {3} 점 입니다.'.format(custom_name,price,int(point),int(total_point)))
# f-string 포매팅 사용 : print(f'출력문장 {변수명} 출력문장')
print(f'{custom_name} 고객님의 사용금액은 {price} 원, 발생 포인트는 {int(point)}\n현재 이용하실 수 있는 누적포인트는 {int(total_point)} 점입니다.')




