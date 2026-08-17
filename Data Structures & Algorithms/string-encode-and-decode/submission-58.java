class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for (String word : strs) {
            string.append(word.length()).append('#').append(word);
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            int end = j + 1 + length;
            res.add(str.substring(start, end));
            i = end;
        }
        return res;
    }
}
