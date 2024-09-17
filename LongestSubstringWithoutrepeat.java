class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        int length = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            map.put(s.charAt(i), i);
            length = Math.max(length, i-j+1);
        }
        return length;
    }
}
