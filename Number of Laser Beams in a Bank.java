class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        ans = 0
        temp = 0
        for i in bank:
            n = s.count('1')
            if(n == 0):
                continue
            ans = ans + temp * n
            temp = n

        return ans

    //
