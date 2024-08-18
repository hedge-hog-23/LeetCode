class Solution:
    def nthUglyNumber(self, n: int) -> int:
        k = [0] * n
        t1 = t2 = t3 = 0  #for 2,3,5 factors
        k[0] = 1
        for i in range(1,n):
            k[i] = min(k[t1]*2,k[t2]*3,k[t3]*5)
            if(k[i] == k[t1]*2): 
              t1 += 1
            if(k[i] == k[t2]*3): 
              t2 += 1
            if(k[i] == k[t3]*5): 
              t3 += 1
        return k[n-1]
