

input = [444, 901, 482, 1771]

returnVal = 0
for num in input:
    digit = 0
    while num > 0:
        print(num)
        num =  num // 10
        digit += 1
        
    if digit % 2 == 0:
        returnVal += 1
        
print(returnVal)