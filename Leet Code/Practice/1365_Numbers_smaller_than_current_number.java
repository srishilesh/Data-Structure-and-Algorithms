// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

// MY APPROACH

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] out = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            count = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(j!=i && nums[j]<nums[i])
                    count++;
            }
            out[i] = count;
        }
        return out;
    }
}

// BEST SOLUTION

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];    
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else 
                res[i] = count[nums[i] - 1];
        }
        
        return res;        
    }
}
