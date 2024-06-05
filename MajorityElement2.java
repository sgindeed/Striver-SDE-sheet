class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > nums.length/3)
                result.add(entry.getKey());
        }

        return result;
    }
}
