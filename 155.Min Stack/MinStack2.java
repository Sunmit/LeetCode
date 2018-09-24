class MinStack {
    
    Node head;
    
    private class Node{
        int val,min;
        Node preNode;
        Node(int val,Node preNode){
            this.val=val;
            if(preNode==null||preNode.min>val){
                this.min =val;
            }else{
                this.min = preNode.min;
            }
            
            if(preNode!=null){
                this.preNode = preNode;
            }
        }
    }

    
    public void push(int x) {
        head = new Node(x,head);
    }
    
    public void pop() {
        if(head!=null){
            head = head.preNode;
        }
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
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
