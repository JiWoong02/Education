# crawling\\carwling4_bs4.py
# movie 테이블에 기록된 행들을 모두 조회해 와서 출력 처리함
# 등수순 오름차순정렬해서 모두 조회해 옴
# 조회한 한 행의 정보를 Movie 클래스 객체로 생성해서, 객체를 리스트에 저장 처리함


import urllib.request, bs4
import cx_Oracle
import common.dbConnectTemplate as dbtemp
import entity.Movie as Mv


dbtemp.oracle_init()

conn=dbtemp.connect()

query = 'select * from Movie order by rank'
cursor = conn.cursor()
movieList = list()
cursor.execute(query)
movies = cursor.fetchall()
for movie in movies:
    movieEntity = Mv.Movie(movie[0], movie[1], movie[2], movie[3], movie[4], movie[5])
    movieList.append(movieEntity)
for movie in movieList:
    print(movie)
