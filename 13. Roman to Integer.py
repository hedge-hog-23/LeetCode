class Solution:
    def romanToInt(self, s: str) -> int:
        d = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        ans = 0
        for i in range(0,len(s)-1):
            if(d[s[i]] < d[s[i+1]]):
                ans-=d[s[i]]
            else:
                ans+=d[s[i]]

        return ans + d[s[-1]]
    

        
