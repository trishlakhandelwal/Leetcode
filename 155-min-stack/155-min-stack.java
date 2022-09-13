class MinStack {

    Stack<Integer> stack;
        
    //stack to store min after every operation
    Stack<Integer> minStack;
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        //push in both stacks
        stack.push(val);
        //compare val and top value in minStack(previous min)
        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
        minStack.push(val);
    }
    
    public void pop() {
        //pop from both stacks
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        //check stack
        return stack.peek();
    }
    
    public int getMin() {
        //check minStack
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */