class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) == 1:
            return False
        
        open_brackets = ['(', '{', '[']
        bracket_pairs = {
            '(': ')',
            '{': '}',
            '[': ']'
        }
        stack = []
        for bracket in s:
            if bracket in open_brackets:
                stack.append(bracket)
            elif len(stack) < 1:
                return False
            elif bracket_pairs[stack.pop()] != bracket:
                return False
            else:
                pass
            
        return len(stack) == 0
            