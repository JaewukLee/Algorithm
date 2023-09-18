import sys

input = sys.stdin.readline

n = int(input())
numbers = list(map(int, input().split()))

numbers.sort()
k = 0
count = 0
while(k < n):
    i = 0
    j = n - 1
    find = numbers[k]
    while(i < j):
        sum = numbers[i] + numbers[j]
        if sum < find:
            i += 1
        elif sum > find:
            j -= 1
        else:
            if i != k and j != k:
                count += 1
                break
            elif i == k:
                i += 1
            elif j == k:
                j -= 1
    
    k += 1
        
print(count)