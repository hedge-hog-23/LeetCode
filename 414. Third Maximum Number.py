class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        s = set(nums)
        nums = sorted(list(s))
        if(len(nums) == 1):
            return nums[0]
        elif(len(nums) == 2):
            return nums[1]
        else:
            return nums[-3]        
