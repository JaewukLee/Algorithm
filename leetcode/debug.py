a = [3,2,1]
b = [5,2,2]
c = [2,2,3,1]
d = [1,3,3,3]
e = [3,3,3,3,3,3]
f = [2,1,2,2,4]

def thirdMax(nums):
    if len(nums) == 1:
        return nums[0]
    
    if len(nums) == 2:
        return max(nums[0], nums[1])
    
    first = nums[0]
    second = third = float('-inf')
    for num in nums:
        if num > first:
            third = second
            second = first
            first = num
        elif num > second and num < first:
            third = second
            second = num
        elif num > third and num < second:
            third = num
            
    print(first, second, third, third if third != float('-inf') else first)
    return third if third != float('-inf') else first

thirdMax(a)
thirdMax(b)
thirdMax(c)
thirdMax(d)
thirdMax(e)
thirdMax(f)