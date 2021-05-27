class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> ans;
    Stack<Integer> min;
    public MinStack() {
        ans=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        ans.push(val);
        if(min.isEmpty() || min.peek()>=val){
            min.push(val);
        }
        
    }
    
    public void pop() {
        if(min.peek().equals(ans.peek())){
            min.pop();
        }
        ans.pop();
        
    }
    
    public int top() {
        return ans.peek();
    }
    
    public int getMin() {
        return min.peek();
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
