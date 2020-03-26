// https://leetcode.com/problems/create-target-array-in-the-given-order/

// MY APPROACH

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            int ind = index[i];
            if(target[ind]==0)
                target[ind] = temp;
            else
            {
                int temp1 = target[ind];
                for(int j=ind;j<nums.length-1;j++){
                    int c = target[j+1];
                    target[j+1] = temp1;
                    temp1 = c;
                }
                target[ind] = temp;
            }
        }
        for(int i=0;i<nums.length;i++)
            System.out.println(target[i]);
        return target;
    }
}


// SHORT ANSWER

public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> lst = new ArrayList<>(); // use list to add elements at index
        for (int i = 0; i < index.length; i++) lst.add(index[i], nums[i]);
        
        int[] res = new int[nums.length]; // convert list to array
        for (int i = 0; i < index.length; i++) res[i] = lst.get(i);
        return res;
    }
    
// BEST ANSWER
// https://leetcode.com/problems/create-target-array-in-the-given-order/discuss/549583/O(nlogn)-based-on-"smaller-elements-after-self".
public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = i;
        }
        helper(a, 0, n, index, new int[n]);
        int[] result = new int[n];
        for(int i = 0; i < n; ++i) {
            result[index[i]] = nums[i];
        }
        return result;
    }
    
    static void helper(int[] a, int i, int j, int[] index, int[] tmp) {
        if (j - i <= 1) {
            return;
        }
        int k = (i + j) >>> 1;
        helper(a, i, k, index, tmp);
        helper(a, k, j, index, tmp);
        int x = i;
        int y = k;
        int z = 0;
        int count = 0;
        while(x < k && y < j) {
            while(y < j && index[a[y]] <= index[a[x]] + count) {
                ++count;
                tmp[z++] = a[y++];
            }
            index[a[x]] += count;
            tmp[z++] = a[x++];
        }
        while(x < k) {
            index[a[x]] += count;
            tmp[z++] = a[x++];
        }
        while(y < j) {
            tmp[z++] = a[y++];
        }
        for(int p = i, q = 0; p < j; ++p, ++q) {
            a[p] = tmp[q];
        }
    }
