class GFG{
  static long maxSubarraySum(int k, ArrayList<Integer> arr)
  {
    long maxSum = 0;
    long winSum = 0;

    for(int i-0; i<k; i++)
      winSum += arr.get(i);

    maxSum = Math.max(maxSum, winSum);

    for(int i=k; i<n; i++)
      {
        winSum += arr.get(i) - arr.get(i-k);
        maxSum = Math.amx(maxSum, winSum);
      }

  return maxSum;
  }
}
