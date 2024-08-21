class Solution:
    def minMoves(self, target: int, maxDoubles: int) -> int:
        ct = 0
        while(target>1 and maxDoubles>0):
            if(target%2 == 0):
                target = target//2
                ct+=1
                maxDoubles -= 1
            else:
                target-=1
                ct+=1

        return ct+target-1
