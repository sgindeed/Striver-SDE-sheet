
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = A.size();
        
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int repeated = -1;
        int missing = -1;
        
        for (int i = 1; i <= n; i++) {
            if (countMap.containsKey(i)) {
                if (countMap.get(i) == 2) {
                    repeated = i;
                }
            } else {
                missing = i;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeated);
        result.add(missing);
        return result;
    }
