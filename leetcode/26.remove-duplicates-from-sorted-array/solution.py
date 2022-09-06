class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        value = -101
        index = 0
        while index < len(nums):
            if nums[index] > value:
                value = nums[index]
                index += 1
            else:
                nums.pop(index)
                
        return len(nums)
    
    
    length = 0
        if len(nums) == 0: return length
        for i in range(1,len(nums)):
            if nums[length] < nums[i]:
                length += 1
                nums[length] = nums[i]
        return length+1