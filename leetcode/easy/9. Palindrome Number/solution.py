class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        if x < 10:
            return True

        reverseX = 0
        num = x
        while num > 0:
            reverseX = reverseX * 10 + num % 10
            num = int(num / 10)

        return reverseX == x