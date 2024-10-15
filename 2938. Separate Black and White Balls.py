class Solution:
    def minimumSteps(self, s: str) -> int:
        res = 0
        black = 0
        for i in s:
            if i == '0':
                res+=black
            else:
                black+=1
        return res
