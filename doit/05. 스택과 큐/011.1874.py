SIZE = int(input())

ARR = []

for i in range(SIZE):
    ARR.append(int(input()))
    
curr = 1

stk = []
answer = ""
for i in range(SIZE):
    num = ARR[i]
    if curr <= num:
        while curr <= num:
            stk.append(curr)
            curr += 1
            answer += "+\n"
            
        stk.pop()
        answer += "-\n"
        
    else:
        n = stk.pop()
        if n > num:
            answer = "NO"
            break
        else:
            answer += "-\n"
    
print(answer)