# mission\\dict_mission2.py  또는  mission/dict_mission2.py
# mission.dict_mission2
# 사전 자료형 복습문제 2
'''     키보드로 값을 입력받고 요구대로 처리한 다음 출력 확인하시오.
입력내용 :
    번호 : 12 (sno : int)
    이름 : 황지니 (sname : str)
    국어 : 85 (kor : int)
    영어 : 85 (eng : int)
    수학 : 85 (mat : int)
처리내용 :
    입력받은 값들을 사전(sungjuk_dict)에 저장하시오.      키는 위의 변수이름을 문자형으로 사용하시오.
    3과목의 총점 (tot : int) 과 3과목의 평균 (avg : float)을 사전에 추가하시오.
출력내용 :
    12번 황지니의 총점은 255 점, 평균은 85.0 점.
    국어 : 85 점, 영어 : 85 점, 수학 : 85 점입니다.
'''
def sungjuk_dict_func():
    sno = int(input('번호 : '))
    sname = input('이름 : ')
    kor = int(input('국어점수 : '))
    eng = int(input('영어점수 : '))
    mat = int(input('수학점수 : '))
    sungjuk_dict = {}
    # Case 1.
    # sungjuk_dict['sno'] = sno
    # sungjuk_dict['sname'] = sname
    # sungjuk_dict['kor'] = kor
    # sungjuk_dict['eng'] = eng
    # sungjuk_dict['mat'] = mat
    # sungjuk_dict['total_score'] = kor + eng + mat
    # sungjuk_dict['avg'] = sungjuk_dict['total_score'] / 3
    # print(f'{sungjuk_dict['sno']}번 {sungjuk_dict['sname']}의 총점은 {sungjuk_dict['total_score']} 점, \
    # 평균은 {sungjuk_dict['avg']}점.\n국어 : {sungjuk_dict['kor']} 점, \
    # 영어 : {sungjuk_dict['eng']} 점, 수학 : {sungjuk_dict['mat']} 점입니다.')
    # dict 저장 방식을 변경해 보시오.   # 학생번호를 키로 사용하고, 나머지 학생정보를 리스트로 만들어서
    # 번호 : [이름, 국어, 영어, 수학, 총점, 평균]  # sungjuk_dict 에 저장한 다음 출력하시오.
    # Case 2.
    sungjuk_dict[sno] = [sname, kor, eng, mat, kor+eng+mat, (eng+mat+kor)/3]
    print(f'{sno}번 {sungjuk_dict[sno][0]}의 총점은 {sungjuk_dict[sno][4]} 점, \
    평균은 {sungjuk_dict[sno][5]:.2f}점.\n국어 : {sungjuk_dict[sno][1]} 점, \
    영어 : {sungjuk_dict[sno][2]} 점, 수학 : {sungjuk_dict[sno][3]} 점입니다.')

