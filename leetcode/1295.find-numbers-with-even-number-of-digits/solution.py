class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        returnVal = 0
        for num in nums:
            digit = 0
            while num > 0:
                num = num // 10
                digit += 1
                
            if digit % 2 == 0:
                returnVal += 1
                
        return returnVal
        