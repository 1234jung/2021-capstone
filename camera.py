import cv2
#opencv 호출

capture = cv2.VideoCapture(0)
#비디오 출력 (0) = 카메라 번호
capture.set(cv2.CAP_PROP_FRAME_WIDTH, 640)
#propid 속성, value 값
capture.set(cv2.CAP_PROP_FRAME_HEIGHT, 480)

while cv2.waitKey(33) < 0:
    ret, frame = capture.read()
    cv2.imshow("VideoFrame", frame)
#while 문을 통해 지속적으로 프레임 유지

capture.release()
cv2.destroyAllWindows()