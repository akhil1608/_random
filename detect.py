import os, cv2 as cv, numpy as np

def firepixels(img):
    hsvimg = cv.cvtColor(img,cv.COLOR_BGR2HSV)
    flamelow = np.array(([0, 0, 192]), dtype = "uint8")
    flamehigh = np.array(([40, 192, 255]), dtype = "uint8")
    flame = cv.inRange(hsvimg,flamelow,flamehigh) # highlight flame colors
    # cflame = cv.bitwise_and(img,img, mask=flame) # retain flame color
    return flame

images = os.listdir("temp/")
img1 = cv.imread("temp/"+images[0])
img2 = cv.imread("temp/"+images[1])

f1 = firepixels(img1)
f2 = firepixels(img2)

h1 = cv.calcHist(f1,[0],None,[256],[0,256])
h2 = cv.calcHist(f2,[0],None,[256],[0,256])
val = cv.compareHist(h1,h2,cv.HISTCMP_INTERSECT)
threshold = 2000.0

if val<threshold:
	print("fire")
else:
	print("nofire")

print(images[1])
# os.rename("temp/"+images[0],"images/"+images[0])