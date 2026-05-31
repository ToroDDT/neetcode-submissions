class Solution {
    public boolean isValid(String s) {
        // I need to create a hashmap that will store closing and opening brackets
        // Goal of the stack is to either pop or push 
        // Pop from the stack only if the stack is not empty 
        // if the stack is empty, you can not pop so i need to just add it 
        // if the stack is not empty 
        // check if the bracket on the stack is the correct opening braket if yes 
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closeToOpen = new HashMap<>();
            closeToOpen.put('}', '{');
            closeToOpen.put(']', '[');
            closeToOpen.put(')', '(');   
        char[] word = s.toCharArray();
        for (char character : word) {
            if (!stack.isEmpty() && stack.peek() == closeToOpen.get(character)){
                stack.pop();
            }
            else {
                stack.push(character);
            }
        }
        return stack.isEmpty();
    }
}
