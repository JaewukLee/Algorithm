class Solution:
    def thirdMax(self, nums: List[int]) -> int:
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

        return third if third != float('-inf') else first