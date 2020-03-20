// https://leetcode.com/problems/jewels-and-stones/


// MY APPROACH

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char stones[] = J.toCharArray();
        for(int j=0;j<J.length();j++)
            map.put(J.charAt(j),0);
        int count = 0;
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(map.containsKey(ch)==true)
                    count++;
            
            
        }
        
        return count;
        
    }
}

// SOLUTION

public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set setJ = new HashSet();
        for (char j: J.toCharArray())
            setJ.add(j);
        for (char s: S.toCharArray())
            if (setJ.contains(s)) res++;
        return res;
    }



public static int numJewelsInStones(String J, String S) {
       int res=0;
       for(char c : S.toCharArray()){
           if(J.indexOf(c) != -1){
               res++;
           }
       }
       return res;
   }
