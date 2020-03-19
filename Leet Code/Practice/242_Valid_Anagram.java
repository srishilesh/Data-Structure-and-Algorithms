// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> maps = new HashMap<Character,Integer>();
        HashMap<Character,Integer> mapt = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(maps.containsKey(ch)==false)
                maps.put(ch,1);
            else
                maps.put(ch,maps.get(ch)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(mapt.containsKey(ch)==false)
                mapt.put(ch,1);
            else
                mapt.put(ch,mapt.get(ch)+1);
        }
        System.out.println(maps);
        System.out.println(mapt);
        if(maps.equals(mapt))
            return true;
        else
        return false;
        
    }
}

// https://leetcode.com/problems/valid-anagram/solution/
