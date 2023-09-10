import sys
input = sys.stdin.readline
su_no, quiz_no = map(int, input().split()) # 첫 번째 라인 입력. 숫자 갯수, 문제 갯수
numbers = list(map(int, input().split())) # 두 번째 라인 입력
prefix_sum = [0]
temp = 0

for i in numbers:
    temp = temp + i
    prefix_sum.append(temp)
    
# 문제 갯수 만큼 반복문 돌면서 문제 입력 받고, 결과 출력
for i in range(quiz_no):
    s, e = map(int, input().split())
    print(prefix_sum[e] - prefix_sum[s-1])