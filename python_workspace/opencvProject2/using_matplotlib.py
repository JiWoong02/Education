# using_matplotlib.py
# 이미지 읽어올 때 색상 채널 바꾸기

import matplotlib.pyplot as plt
import cv2

# 컬러 영상 출력
imgBGR = cv2.imread('./images/cat.bmp')     #  default는 BGR 순으로 읽어들임
imgRGB = cv2.cvtColor(imgBGR, cv2.COLOR_BGR2RGB)   # RGB순으로 다시 바꾸기
plt.axis('off')
#plt.imshow(imgBGR)
#plt.imshow(imgRGB)
#plt.show()

# 그레이스케일로 이미지 읽어 들이기
imgGray = cv2.imread('./images/cat.bmp', cv2.IMREAD_GRAYSCALE)

# 두 개의 영상을 함께 출력
plt.subplot(1, 2, 1), plt.axis('off'), plt.imshow(imgRGB)   # 1행 2열의 1번째
plt.subplot(1, 2, 2), plt.axis('off'), plt.imshow(imgGray, cmap='gray')   # 1행 2열의 2번째
plt.show()
