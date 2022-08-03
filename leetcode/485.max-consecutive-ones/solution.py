class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_length = 0
        length = 0
        for num in nums:
            if num == 0:
                if length > max_length:
                    max_length = length
                length = 0
                continue
                    
            length += 1
            
        if length > max_length:
            max_length = length
                
        return max_length