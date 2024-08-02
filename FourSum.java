class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length-3; i++)
        {
            for(int j=i+1; j<nums.length-2; j++)
            {
                int left = j+1;
                int right = nums.length-1;

                while(left < right)
                {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target)
                    {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);

                        if(!set.contains(quad))
                            set.add(quad);

                        left++;
                        right--;
                    }
                    if(sum < target)
                        left++;
                    if(sum > target)
                        right--;

                }
            }
        }
        result.addAll(set);
        return result;
    }
}
