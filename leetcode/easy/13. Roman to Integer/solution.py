class Solution:
    def romanToInt(self, s: str) -> int:
        values = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        returnVal = 0

        for r in reversed(s):
            if (r == 'V' or r == 'X'):
                values['I'] = -1

            if (r == 'L' or r == 'C'):
                values['X'] = -10

            if (r == 'D' or r == 'M'):
                values['C'] = -100

            returnVal += values[r]
            
        return returnVal