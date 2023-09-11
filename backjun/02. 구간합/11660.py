import sys

input = sys.stdin.readline

n, m = map(int, input().split())
A = [[0] * (n + 1)]
D = [[0] * (n + 1) for _ in range(n + 1)]

# 부분합 공식을 편리하게 사용하려면 더미 row, col을 추가하면 됨
# 다른 방법은?
for i in range(n):
    a_row = [0] + [int(x) for x in input().split()]
    A.append(a_row)

for i in range(1, n + 1):
    for j in range(1, n + 1):
        # 부분합 공식
        D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j]

for _ in range(m):
    x1, y1, x2, y2 = map(int, input().split())
    # 지정된 구간의 부분합 공식
    result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]
    print(result)
