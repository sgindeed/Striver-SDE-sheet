class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > nums.length/2)
                return entry.getKey();
        }

        return 0;
    }
}
