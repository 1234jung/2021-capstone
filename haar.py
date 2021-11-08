import cv2
import numpy as nu

def showimage():
    imgfile = './n/2.jpg'
    img = cv2.imread(imgfile, cv2.IMREAD_COLOR)

    cv2.imshow('2', img)
    cv2.wait(0)
    cv2.destoryAllWindows()

showimage()