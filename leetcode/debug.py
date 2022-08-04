nums = [-4, -1, 0, 3, 10]
arr = []

def solution():

    if nums[0] > -1:
        for num in nums:
            arr.append(num * num)
        return arr

    if nums[-1] < 0:
        for num in nums:
            arr.insert(0, num * num)
        return arr

    size = len(nums)
    pre = 0
    post = 0
    for idx in range(0, size):
        if nums[idx] > -1:
            print(nums[idx], idx)
            pre = idx -1
            post = idx
            break

    while pre > -1 and post < size:
        if nums[pre] * -1 < nums[post]:
            arr.append(nums[pre] * nums[pre])
            pre -= 1
        else:
            arr.append(nums[post] * nums[post])
            post += 1    

    
    while post < size:
        arr.append(nums[post] * nums[post])
        post += 1

    while pre > -1:
        arr.append(nums[pre] * nums[pre])
        pre -= 1
        
    return arr


print(solution())