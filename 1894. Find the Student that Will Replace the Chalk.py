class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        sum = 0
        for i in chalk:
            sum+=i
        k = k%sum

        for i in range(0,len(chalk)):
            if(chalk[i]>k):
                return i
            k = k - chalk[i]
        
        return -1
