class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int sum = 0; 
        int maxLength = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            
            if(sum == 0)
                maxLength = i+1;
            
            else
            {
                if(map.containsKey(sum))
                    maxLength = Math.max(maxLength, i-map.get(sum));
                else
                    map.put(sum, i);
            }
        }
        return maxLength;
    }
}
