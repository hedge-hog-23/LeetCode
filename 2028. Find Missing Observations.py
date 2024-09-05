class Solution:
    def missingRolls(self, rolls: List[int], mean: int, n: int) -> List[int]:
        ans =  [0 for _ in range(n)]
        x = sum(rolls)
        m = len(rolls)
        sum1 = ((mean * (n+m)) - x )
        if(sum1>n*6 or sum1<n):
            return []
        
        quo = sum1//n
        rem = sum1 % n
        for i in range(0,len(ans)):
            ans[i] = quo
        for i in range(0,rem):
            ans[i] = quo+1
        return ans
        
