class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() % 2 == 0){
                even.add(entry.getValue());
            }
            else {
                odd.add(entry.getValue());
            }
        }
        
        Collections.sort(odd);
        Collections.sort(even);
        
        // Grab the largest odd frequency (last element after sorting)
        int maxOdd = odd.get(odd.size() - 1);
        
        // Grab the smallest even frequency (first element after sorting)
        int minEven = even.get(0);
        
        // The maximum difference is strictly maxOdd - minEven
        return maxOdd - minEven;
    }
}