# fileio\\fileio_mission.py
# 파일입출력, 반복문, 리스트, 딕셔너리 사용 실습문제
import pickle
def readEmployee():
    f = open('employees.dat', 'rb')
    empDict = pickle.load(f)
    f.close()
    return empDict
def saveEmployee(empdict:dict):
    f = open('employees.dat', 'wb')
    pickle.dump(empdict, f)
    f.close()
    print('employees.dat 파일에 성공적으로 저장되었습니다.')
def addEmployee():
    empid = input('사번을 입력해주세요')
    empname = input('직원 이름을 입력해주세요')
    empno = input('직원 주민번호를 입력해주세요')
    email =   input('이메일을 입력해주세요')
    phone =   input('전화번호를 입력해주세요')
    salary =   int(input('급여를 입력해주세요'))
    job =   input('직급을 입력해주세요')
    dept =   input('부서를 입력해주세요')
    employeeList = [empid, empname, empno, email, phone, salary, job, dept]
    return employeeList
def printEmpoyee(dict:dict):
    for i in dict.keys():
        print(dict[i])
def employeesManager():
    employeeDictionary = {}
    prompt = '''
    1. 직원정보 추가
    2. 직원 삭제
    3. 직원 전체 출력
    4. 파일로 저장
    5. 저장된 파일 읽기
    9. 프로그램 종료
    '''
    while True:
        print(prompt)
        no=int(input('원하는 서비스를 입력해주세요 : '))
        if no==1:
            employeeList=addEmployee()
            dict = {employeeList[0]: employeeList}
            employeeDictionary.update(dict)
        elif no==2:
            empid = input('삭제할 사번을 입력해주세요')
            if empid in employeeDictionary.keys():
                del employeeDictionary[empid]
                print('성공적으로 삭제되었습니다 !')
            else:
                print('존재하지 않는 사번입니다. 사번을 다시 확인해주세요')
        elif no==3:
            printEmpoyee(employeeDictionary)
        elif no==4:
            saveEmployee(employeeDictionary)
        elif no==5:
            employeeDictionary=readEmployee()
            printEmpoyee(employeeDictionary)
        elif no==9:
            print('프로그램을 종료합니다')
            break
        else :
            print('정확한 메뉴를 선택해주세요')

if __name__ == '__main__':
    employeesManager()
