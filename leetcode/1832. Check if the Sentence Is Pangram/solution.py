class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        if len(sentence) < 26:
            return False

        count = [0 for i in range(26)]
        for s in sentence:
            count[ord(s) - 97] += 1

        for num in count:
            if num == 0:
                return False

        return True
            
        