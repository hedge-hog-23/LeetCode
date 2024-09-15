class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        left = [0]
        sum = 0
        for i in range(0,len(nums)-1):
            sum+=nums[i]
            left.append(sum)
        
        right = [0]

        sum1 = 0
        for i in range(len(nums)-1,0,-1):
            sum1+=nums[i]
            right.append(sum1)

        right.reverse()

        for i in range(0,len(left)):
            nums[i] = abs(left[i]-right[i])

        print(left,right)
        return nums
        
