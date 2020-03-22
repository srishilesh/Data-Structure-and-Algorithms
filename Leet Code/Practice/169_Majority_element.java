// https://leetcode.com/problems/majority-element


// MY APPROACH

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = nums.length;
        int max = (int)Math.floor(n/2);
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry mape:map.entrySet()){
            int key =  ((int)mape.getKey());
            int val=((int)mape.getValue());
            if(val>max)
                return key;
        }
        return 0;
    }
}

// https://leetcode.com/articles/majority-element/
