class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for (String word : strs) {
            string.append(word.length()).append('#').append(word);
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> res = new ArrayList<>();
        while (i < str.length()) {
            int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }
        int length = Integer.parseInt(str.substring(i, j));
        int start = j + 1;
        int end = length + start;
        res.add(str.substring(start, end));
        i = end;
     }
     return res;
    }

}