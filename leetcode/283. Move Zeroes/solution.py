class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        # check for edge cases
        if len(nums) == 1:
            return
        
        pre_idx = 0
        post_idx = 1
        size = len(nums)
        while post_idx < size and pre_idx < size:
            if nums[post_idx] == 0:
                post_idx += 1
            elif nums[pre_idx] == 0:
                nums[pre_idx] = nums[post_idx]
                nums[post_idx] = 0
            elif post_idx <= pre_idx:
                post_idx += 1
            else:
                pre_idx += 1
           