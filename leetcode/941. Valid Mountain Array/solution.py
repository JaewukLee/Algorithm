class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        if len(arr) < 3:
            return False
        
        i = 0
        j = len(arr) - 1
        while i < j:
            if arr[i] < arr[i+1]:
                i += 1
            elif arr[j] < arr[j-1]:
                j -= 1
            else:
                break
        
        if i == len(arr) -1:
            return False
            
        if j == 0:
            return False
            
        return i == j