# path : loop\\loopMission.py
# module : loop.loopMission

# 리스트 안의 튜플아이템의 값들에 대해
# 둘 중의 큰값과 작은값을 분류해서 출력 처리

# 방법 1 : 조건식 직접 작성
def practice1():
    nlist = [(5,9),(14,59),(100,12),(200,11),(15,6),(99,100)]
    # for 문 안에서 if 문 사용
    for first, second in nlist:
        if first>second:
            max = first
            min = second
        else:
            max = second
            min = first
        print(f'큰값 : {max},작은값 : {min}')


# 방법 2 : 내장함수 이용
def practice2():
    nlist = [(5, 9), (14, 59), (100, 12), (200, 11), (15, 6), (99, 100)]
    for tuple in nlist:
        print(f'큰값 : {max(tuple)}, 작은값 : {min(tuple)}')

# 활용 실습 : 조건식 직접 작성
# 리스트 안의 군집아이템들이 가진 값들 중 각각 가장 큰 값을 골라 내서
# 별도의 리스트에 저장 처리하고 출력
def practice3():
    nlist = [[1,2,3,4,5], (6,7,8,9), {90,50,45,101}]
    maxlist=[]
    for item in nlist:
        max = 0
        for value in item:
            if max<value:
                max = value
        maxlist.append(max)

    print(maxlist)

def practice4():
    nlist = [[1, 2, 3, 4, 5], (6, 7, 8, 9), {90, 50, 45, 101}]
    maxlist=[]
    for item in nlist:
        maxlist.append(max(item))
    print(maxlist)
    
# 1. while 문으로 변경
''' while 문 실습문제
아래의 작성된 for문을 while문으로 변경하시오.
sungjuk_list = [[12, '홍길동', 98], [15, '김유신', 87], [23, '황지니', 45]]

for student in sungjuk_list:
    if(student[2] >= 60):
        print('{}번 {} 학생은 합격입니다.'.format(student[0], student[1]))
    else:
        print('{}번 {} 학생은 불합격입니다.'.format(student[0], student[1]))
'''
def practice_while():
    sungjuk_list = [[12, '홍길동', 98], [15, '김유신', 87], [23, '황지니', 45]]
    index =0
    while index < len(sungjuk_list):
        if (sungjuk_list[index][2] >= 60):
            print('{}번 {} 학생은 합격입니다.'.format(sungjuk_list[index][0], sungjuk_list[index][1]))
        else:
            print('{}번 {} 학생은 불합격입니다.'.format(sungjuk_list[index][0], sungjuk_list[index][1]))
        index += 1