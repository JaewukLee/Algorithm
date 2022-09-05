class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if m == 0:
            nums1[0] = nums2[0]
        elif n == 0:
            pass
            
        else:
        
            i = m - 1
            j = n - 1
            back = m + n - 1
            while j > -1:
                if nums1[i] > nums2[j]:
                    nums1[back] = nums1[i]
                    i -= 1
                else:
                    nums1[back] = nums2[j]
                    j -= 1

                back -= 1
                    
            