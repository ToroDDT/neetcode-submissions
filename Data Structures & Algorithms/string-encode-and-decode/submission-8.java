class Solution {

    public String encode(List<String> strs) {
        // create a new String builder that will store the new string
        StringBuilder string = new StringBuilder();

        for (String word : strs) {
            string.append(word.length()).append("#").append(word);
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        // start at the begginiing of the string
        int i = 0;
        while (i < str.length()) {
            int j = i; 
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
