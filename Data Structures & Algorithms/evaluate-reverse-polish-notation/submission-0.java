
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        
        for (String token : tokens) {
            // Use .equals() instead of == for String comparison
            if (token.equals("+")) {
                Integer a = Integer.valueOf(stack.pop()); // Added ;
                Integer b = Integer.valueOf(stack.pop()); // Added ;
                stack.push(String.valueOf(b + a));
                continue;
            }
            if (token.equals("-")) {
                Integer a = Integer.valueOf(stack.pop()); // Added ;
                Integer b = Integer.valueOf(stack.pop()); // Added ;
                stack.push(String.valueOf(b - a));
                continue;
            }
            if (token.equals("*")) {
                Integer a = Integer.valueOf(stack.pop()); // Added ;
                Integer b = Integer.valueOf(stack.pop()); // Added ;
                stack.push(String.valueOf(b * a));
                continue;
            }
            if (token.equals("/")) {
                Integer a = Integer.valueOf(stack.pop()); // Added ;
                Integer b = Integer.valueOf(stack.pop()); // Added ;
                stack.push(String.valueOf(b / a));
                continue;
            } else {
                stack.push(token);
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
}