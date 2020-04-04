// https://leetcode.com/problems/move-zeroes/

// My approach

class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1;j++)
            {
                if(nums[j]==0)
                {
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }
        }
        
    }
}

// Approach 1
// Count number of zeros
// Push all non zero inside a stack, then zero elements
// Shift back to array


// Approach 2
// Shift non zero elements first, by using a pointer starting from 0
// Make all the elements from the last non zero element + 1 to end as zero
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                nums[lastNonZero++] = nums[i];
        }
        for(int i=lastNonZero;i<nums.length;i++)
            nums[i] = 0;
        
    }
}

// Approach 3

class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int c = nums[lastNonZero];
                nums[lastNonZero] = nums[i];
                nums[i] = c;
                lastNonZero++;
            }
        }
    }
}
