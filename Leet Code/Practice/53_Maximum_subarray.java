// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0 || nums == null)return 0;
        int sum = nums[0];
        int result = sum;
        for(int i=1;i<nums.length;i++)
        {
            if((sum+nums[i])>=nums[i])
                sum = sum+nums[i];
            else
                sum = nums[i]; 
            result = Math.max(sum,result);
        }
        return result;
        
    }
}
