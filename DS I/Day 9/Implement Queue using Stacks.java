class MyQueue {
        public Stack<Integer> stack = new Stack<>();
        public Stack<Integer> q = new Stack<>();
    public MyQueue() {
        
    } 
    public void push(int x) {
        stack.push(x);
        
    }
    
    public int pop() {
        peek();
        return q.pop();
    }
    
    public int peek() {
        if(q.isEmpty()){
            while(!stack.isEmpty()){
            q.push(stack.pop());
            }
        }  
        return q.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty() && q.isEmpty();
        
    }
}