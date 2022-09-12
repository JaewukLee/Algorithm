class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        
        for i in range(len(arr) - 1):
            for j in range(i+1, len(arr)):
                if i == j:
                    continue
                    
                if arr[i] == 2 * arr[j] or arr[i] * 2 == arr[j]:
                    return True
                
                
        return False
            