class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        
        for mz in magazine:
            ransomNote = ransomNote.replace(mz, '', 1)
            
        if len(ransomNote) > 0:
            return False
        
        return True
                