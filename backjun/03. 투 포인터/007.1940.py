import sys

input = sys.stdin.readline

n = int(input())
m = int(input())
numbers = list(map(int, input().split()))

numbers.sort()

start = 0
end = n - 1
count = 0

while(start < end) :
    sum = numbers[start] + numbers[end]
    
    if sum < m:
        start += 1
    elif sum > m:
        end -= 1
    else:
        start += 1
        end -= 1
        count += 1

print(count)