class MinStack {
    
    Stack<Long> stack = null;
    long min ;

    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()){
            this.stack.push(0l);
            min = x;
        }else{
            this.stack.push(x-min);
            if(x<min){
                min = x;
            }
        }
        
    }
    
    public void pop() {
        long pop = this.stack.pop();
        if(pop<0){
            min = min-pop;
        }
    }
    
    public int top() {
        long top = this.stack.peek();
        if(top>0){
            return (int) (min+top);
        }else{
            return (int) min;
        }
    }
    
    public int getMin() {
        return (int) this.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
