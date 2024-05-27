# path : entity/Movie.py
# module : entity.Movie
# 크롤링해서 추출한 영화 정보 저장용 클래스 정의 스크립트


class Movie:
    # field (attribute) : private (이름 앞에 __ 2개 붙임)
    rank = 0       # 영화순위
    title = ''         # 영화제목
    star_point = 0.0        # 별점(평점)
    release_date = ''       # 개봉일
    genre = ''          # 장르
    link = ''       # 상세페이지 url

    # 생성자 (constructor)
    def __init__(self, rank, title, star_point, release_date, genre, link):
        self.rank = rank
        self.title = title
        self.star_point = star_point
        self.release_date = release_date
        self.genre = genre
        self.link = link
    
    # 메서드
    # 연산자 오버로딩
    # 자바의 toString() == 파이썬 __str__(self)
    # 객체가 가진 필드값들을 하나의 문장(str)으로 만들어서 리턴함
    def __str__(self):
        return f'rank : {self.rank}, title : {self.title}, start_point : {self.star_point}, release_date : {self.release_date}, genre: {self.genre}, link: {self.link} '
    