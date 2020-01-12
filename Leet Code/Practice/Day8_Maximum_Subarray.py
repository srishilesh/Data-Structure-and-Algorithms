# https://leetcode.com/problems/maximum-subarray/

# Approach 1
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # for i in range(1,len(nums)):
        #     nums[i] = nums[i-1] + nums[i]
        # s = 0
        
         for i in range(1,len(nums)):
                nums[i] = max(nums[i], nums[i-1] + nums[i])
         print(nums)
         return max(nums)
         
# Kadane Algorithm

# Dynamic Programming approach
