class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();
        for (String str : strs) {
            build.append(str.length()).append('#').append(str);
        }
        return build.toString();
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
            int end = j + length + 1;
            res.add(str.substring(start, end));
            i = end;
        }
        return res;
    }
}
