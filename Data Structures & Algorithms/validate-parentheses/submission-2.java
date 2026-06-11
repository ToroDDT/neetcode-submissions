class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        closeToOpen.put('}', '{');
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        char[] brackets = s.toCharArray();
        for (char bracket : brackets){
            if (!stack.isEmpty() && stack.peek() == closeToOpen.get(bracket)) {
                stack.pop();
            }
            else {
                stack.push(bracket);
            }
        }
        return stack.isEmpty();
    }
}
