class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        # check for edge cases
        if len(arr) == 1:
            return [-1]
            
        max = -1
        for idx in range(len(arr)-1, -1, -1):
            if arr[idx] > max:
                tmp = arr[idx]
                arr[idx] = max
                max = tmp
            else:
                arr[idx] = max
                
        return arr
            