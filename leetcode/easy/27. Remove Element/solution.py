nums = [0,1,2,2,3,0,4,2]
val = 2

k = len(nums)
i = 0
while i < len(nums):
    print(i, len(nums))
    if nums[i] == val:
        nums.pop(i)
        k -= 1
    else:
        i += 1
        
print(k, nums)