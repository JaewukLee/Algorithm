from collections import deque

N, L = map(int, input().split())
A = list(map(int, input().split()))

deq = deque()

for i in range(N):
    # tail쪽에서, 입력 수 보다 큰 값 제거
    while deq and deq[-1][0] > A[i]:
        deq.pop()
        
    # 입력 수 append
    deq.append((A[i], i))
    
    # head 쪽에서, 윈도우 크기보다 크면 하나 제거
    if deq[0][1] <= i - L:
        deq.popleft()
        
    # print answer
    print(deq[0][0], end=' ')