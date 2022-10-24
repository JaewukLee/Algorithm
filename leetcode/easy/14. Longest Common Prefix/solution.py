class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        
        returnval = []
        for i in range(200):
            for j in range(len(strs)):
                if len(strs[j]) <= i:
                    if len(returnval) > i:
                        returnval.pop()
                    return "".join(returnval)
                
                if len(returnval) == i:
                    returnval.append(strs[j][i])
                elif returnval[i] != strs[j][i]:
                    returnval.pop()
                    return "".join(returnval)
                
        return "".join(returnval)
                    
                