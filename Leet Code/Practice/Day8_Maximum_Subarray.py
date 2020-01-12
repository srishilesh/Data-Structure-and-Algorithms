# https://leetcode.com/problems/maximum-subarray/

# Approach 1
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # for i in range(1,len(nums)):
        #     nums[i] = nums[i-1] + nums[i]
        # s = 0
        
         # for i in range(1,len(nums)):
         #        nums[i] = max(nums[i], nums[i-1] + nums[i])
         # print(nums)
         # return max(nums)
        
# Kadane Algorithm        
        # max_so_far = 0
        # max_ending_here = 0
        # for i in range(len(nums)):
        #     max_ending_here = max_ending_here + nums[i]
        #     if(max_ending_here<0):
        #         max_ending_here = 0
        #     if(max_so_far<max_ending_here):
        #         max_so_far = max_ending_here
        # return max_so_far

# Dynamic Programming approach        
        max_so_far = nums[0]
        curr_max = nums[0]
        for i in range(1,len(nums)):
            curr_max = max(nums[i],nums[i]+curr_max)
            max_so_far = max(max_so_far,curr_max)
        return max_so_far
