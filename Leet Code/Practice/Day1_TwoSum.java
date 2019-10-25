// https://leetcode.com/problems/two-sum

// My Solution

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int finala[]= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                { finala[0] = i;
                    finala[1] = j;
                    return finala; 
                }
            }
        }
        return null;
    }
}

