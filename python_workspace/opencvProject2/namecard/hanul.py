# namecard\\countours.py
# 3단계 : 명함 이미지 외곽선 추출

import numpy as np
import sys
import cv2
import random

src = cv2.imread('../images/hanul2.jpg')
print(src.shape)  # (810, 1080, 3)

if src is None:
    print('Error')
    sys.exit()
gray = cv2.cvtColor(src, cv2.COLOR_BGR2GRAY)
gray = cv2.GaussianBlur(gray, (5, 5), 0)
src = cv2.bitwise_not(gray)
src = cv2.resize(src, (600, 400))
# 이진화를 위해서 그레이스케일로 변환함
#src_gray = cv2.cvtColor(src, cv2.COLOR_BGR2GRAY)
# 이미지 가로, 세로를 행렬로 변환
h, w = src.shape[:2]
# 레이블링과 외곽선 저장용 3차원 행렬 만들기

dst1 = np.zeros((h, w, 3), np.uint8)
dst2 = np.zeros((h, w, 3), np.uint8)

# 이진화 처리
th, src_bin = cv2.threshold(src, 0, 255, cv2.THRESH_BINARY | cv2.THRESH_OTSU | cv2.THRESH_BINARY_INV)

cv2.imshow('src', src)
cv2.imshow('src_bin', src_bin)

# 외곽선 검출 : 모드를 다르게 해서 2가지 출력 확인
countour1, _ = cv2.findContours(src_bin, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_NONE)
countour2, _ = cv2.findContours(src_bin, cv2.RETR_TREE, cv2.CHAIN_APPROX_NONE)

# 외곽선  그리기  # 위에 키보드나 잡다한것도 다 나옴
'''
for i in range(1, len(countour1)):
    # 랜덤하게 rgb 색을 만듦
    random_color = (random.randint(0, 255), random.randint(0, 255), random.randint(0, 255))
    cv2.drawContours(dst1, countour1, i, random_color, 1) # 테두리선 그리기

for i in range(1, len(countour2)):
    # 랜덤하게 rgb 색을 만듦
    random_color = (random.randint(0, 255), random.randint(0, 255), random.randint(0, 255))
    cv2.drawContours(dst2, countour2, i, random_color, 1) # 테두리선 그리기
'''

# 외곽선 그리기 & 좌표값 추출

for i in range(1, len(countour1)):
    pts = countour1[i]  # 좌표값
    # print(pts)  # 외곽선 좌표값 확인
    approx = cv2.approxPolyDP(pts, cv2.arcLength(pts, True) * 0.5, True)
    cv2.drawContours(dst1, countour1, i, (255, 255, 255), 1)  # 테두리선 그리기
    # 컨벡스(닫혀진 다각형)가 아니면 제외
    if not cv2.isContourConvex(approx):
        continue
for i in range(1, len(countour2)):
    pts = countour2[i]  # 좌표값
    # print(pts)  # 외곽선 좌표값 확인

    cv2.drawContours(dst2, countour2, i, (255, 255, 255), 1)  # 테두리선 그리기
    # 외곽선 근사화 : 0.02 오차 범위 지정
    approx = cv2.approxPolyDP(pts, cv2.arcLength(pts, True) * 0.5, True)
    # 컨벡스(닫혀진 다각형)가 아니면 제외
    if not cv2.isContourConvex(approx):
        continue

cv2.imshow('dst1', dst1)
cv2.imshow('dst2', dst2)

cv2.waitKey()
cv2.destroyAllWindows()


