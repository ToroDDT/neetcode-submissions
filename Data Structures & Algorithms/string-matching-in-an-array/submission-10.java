class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        List<String> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String substring = words[i];
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(substring) && !set.contains(substring)) {
                   res.add(substring);
                   set.add(substring);
                }
            }
        }
        return res;
    }
}