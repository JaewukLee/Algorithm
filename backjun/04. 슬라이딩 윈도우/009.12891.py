import sys

input = sys.stdin.readline

S, P = map(int, input().split())
DNA = input()
CHECK = list(map(int, input().split()))

start = 0
end = 0
status = {'A': 0, 'C': 0, 'G': 0, 'T': 0}
count = 0

def isValidSlice(state, check) -> bool:
    if state['A'] < check[0]:
        return False
    if state['C'] < check[1]:
        return False
    if state['G'] < check[2]:
        return False
    if state['T'] < check[3]:
        return False
    
    return True

while end < P:
    status[DNA[end]] += 1
    end += 1
    
if isValidSlice(status, CHECK):
    count += 1
    
while end < S:
    status[DNA[start]] -= 1
    status[DNA[end]] += 1
    
    if isValidSlice(status, CHECK):
        count += 1
    
    start += 1
    end += 1
    
print(count)