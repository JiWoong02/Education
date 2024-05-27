# image_show.py
# opencv 로 이미지(영상) 불러오기(읽어들이기)

import sys
import cv2

# 상대경로 가능
#img = cv2.imread('./images/cat.bmp')
# 절대경로 가능
img = cv2.imread('D:\\python_workspace\\opencvProject2\\images/cat.bmp')

if img is None:
    print('image load error')
    sys.exit() # 이미지가 없다면 프로그램 종료

print(type(img))    # <class 'numpy.ndarray'>   (이미지가 행렬로 읽혀짐)
print(img.shape)    # (480, 640, 3)     =>  (height, weight, channel)  행렬이 됨

# 이미지(영상) 화면 출력
cv2.namedWindow('imgshow')  # 실행시 나타날 윈도우 창 이름 지정
cv2.imshow('imgshow', img)
cv2.waitKey()   # 키보드 입력이 있을때까지 기다림 (아무 키나 누르면 창 닫아짐)

# 창 닫으면서 프로그램 종료 처리
cv2.destroyAllWindows()



