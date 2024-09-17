class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int next = target - nums[i];
            if(set.contains(next))
            {
                arr[1] = i;
                break;
            }
            set.add(nums[i]);
        }
            for(int i=0;i<nums.length;i++)
            {
                if(nums [i]==target - nums[arr[1]] && arr[1]!=i)
                    arr[0]=i;
        }
        return arr;
    }
}
