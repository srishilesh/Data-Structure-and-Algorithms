# https://leetcode.com/problems/search-insert-position/

class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if(target in nums):
            return nums.index(target)
        else:
            nums.append(target)
            nums.sort()
            return nums.index(target)
            
# OTHER APPROACH

def searchInsert(self, nums, target):
    return sorted(nums + [target]).index(target)
