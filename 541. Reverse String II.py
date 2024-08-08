class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        s = list(s)
        for i in range(0,len(s),2*k):
            t = s[i:i+k]
            s[i:i+k] = t[::-1]
        return "".join(s)
  
