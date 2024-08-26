class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        res = []
        l = 0
        r = len(nums)//2
        while(l<len(nums)//2 and r<len(nums)):
            res.append(nums[l])
            res.append(nums[r])
            l+=1
            r+=1
        return res

        
