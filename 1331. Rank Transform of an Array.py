class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        # sorted_arr = sorted(set(arr))
        # return [sorted_arr.index(x)+1 for x in arr]

        res = {}

        rank = 1 #initial
        for i in sorted(set(arr)):
            res[i] = rank
            rank+=1
        
        ans = []
        for i in arr:
            ans.append(res[i])
        return ans


        
