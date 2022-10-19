class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        if len(nums) == 1:
            return nums
        
        odd = 0
        for i in range(len(nums)):
            if nums[i] % 2 == 0:
                nums[odd], nums[i] = nums[i], nums[odd]
                odd += 1
                
        return nums