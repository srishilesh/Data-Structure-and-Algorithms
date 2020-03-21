// https://leetcode.com/problems/rotate-array/

// MY SOLUTION

class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k==0){
            for(int i=0;i<len;i++)
                System.out.println(nums[i]);
        }
        else
        {
            int x = nums[len-1];
            int temp = nums[0];
            for(int i=1;i<(len);i++){
                int m = nums[i];
                nums[i] = temp;
                temp = m;
            }
            nums[0] = x;
            rotate(nums,k-1);   
        }       
    }
}


// https://leetcode.com/problems/rotate-array/solution/
