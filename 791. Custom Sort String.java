class Solution:
    def customSortString(self, order: str, s: str) -> str:
        ans = ""
        for i in order:
            if i in set(s):
                ans+=(i*s.count(i))
        for i in s:
            if i not in set(ans):
                ans+=(i*s.count(i))
        return ans
