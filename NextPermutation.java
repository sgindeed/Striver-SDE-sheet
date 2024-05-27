class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int index2 = -1;
        int temp = 0;

        for(int i=nums.length-2; i>=0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                index = i;
                break;
            }
        }

        if(index == -1)
            reverse(nums, 0);
        else
        {
            for(int i=nums.length-1; i>=0; i--)
            {
                if(nums[i] > nums[index])
                {
                    index2 = i;
                    break;
                }
            }

            swap(nums, index, index2);
            reverse(nums, index+1);
        }
    }

    void swap(int []nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int []nums, int start){
        int i = start;
        int j = nums.length-1;
        while(i<j)
        {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
