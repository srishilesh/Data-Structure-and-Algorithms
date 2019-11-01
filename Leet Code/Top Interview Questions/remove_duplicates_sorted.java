// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

// MY SOLUTION

import java.util.*;
import java.lang.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 1;
        Map<Integer,Integer> hash = new HashMap();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(hash.containsValue(nums[i])==false)
            {
                hash.put(k,nums[i]);
                //System.out.println(k);
                k++;
            }
        }
        count = hash.size();
        //System.out.println(count);
        int arr[] =new int[count];
        for(int i=0;i<count;i++)
        {
            nums[i] = hash.get(i);
            //System.out.println(arr[i]);
        }   
        //nums = arr;
        //System.arraycopy(arr,0,nums,0,count-1);
        //System.out.println(arr.length);
        return count;
        
    }
}

// ORIGINAL SOLUTION

public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
