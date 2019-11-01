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
