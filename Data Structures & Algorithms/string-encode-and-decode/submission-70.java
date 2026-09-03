class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for (String s : strs) {
            string.append(s.length()).append('#').append(s);
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
            int length = Integer.parseInt(str.substring(i,j));
            int start = j + 1;
            int end = start + length;
            res.add(str.substring(start, end));
            i = end;
        } 
        return res;
    }
}
