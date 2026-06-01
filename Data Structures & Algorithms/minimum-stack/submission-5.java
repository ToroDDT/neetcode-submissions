class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        this.stack.push(val);
    
    // If minStack is empty, OR the new val is smaller/equal to the current min
        if (minStack.isEmpty() || val <= (int)minStack.peek()){
            this.minStack.push(val);
        }
    }
    
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = this.stack.pop();
        if ((int)this.minStack.peek() == top ){
            this.minStack.pop();
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}
