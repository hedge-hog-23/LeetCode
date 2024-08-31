class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        res = []
        # for i in range(0,len(nums)-k+1):
        #     res.append(max(nums[i:i+k]))

        # return res
        dq = deque()
        for i in range(0,len(nums)):
            if dq and dq[0] < i-k+1:
                dq.popleft()
            
            while dq and nums[dq[-1]] <nums[i]:
                dq.pop()

            dq.append(i)
            if(i >=k-1):
                res.append(nums[dq[0]])
            
        return res


            

        
