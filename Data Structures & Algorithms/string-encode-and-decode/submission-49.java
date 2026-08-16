class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (String s : strs) {
            str.append(s.length());
            str.append("#");
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
        int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
        int length = Integer.parseInt(String.valueOf(str.substring(i, j)));
        int start = j + 1;
        int end = j + length + 1;
        String word = str.substring(start, end);
        res.add(word);
        i = end;
        }
        return res;
    }
}
