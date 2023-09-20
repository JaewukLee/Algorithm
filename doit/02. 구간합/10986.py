import sys

input = sys.stdin.readline

n, m = map(int, input().split())
numbers = list(map(int, input().split()))

M = []
count = [0] * m
sum = 0

answer = 0    

for i in numbers:
    sum = sum + i
    mod = sum % m
    M.append(mod)
    count[mod] += 1
    if mod == 0 :
        answer += 1

for i in range(m):
    if count[i] > 1:
        # count[i] 개 중에서 2개를 뽑는 조합
        answer += (count[i] * (count[i] - 1) // 2)

print(answer)

