class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        last_length = 0
        length = 0
        for c in s:
            if c != ' ':
                length += 1
                
            elif c == ' ' and length > 0:
                last_length = length
                length = 0
                
        return length if length > 0 else last_length