from pip import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:

        over = 1
        for i in range(len(digits) - 1, -1, -1):
            origin = digits[i]
            digits[i] = (origin + over) % 10
            over = int((origin + over) / 10)

        if over > 0:
            digits.insert(0, 1)

        return digits