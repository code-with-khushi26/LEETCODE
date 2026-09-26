class MyQueue {
    Stack<Integer>front;
    Stack<Integer>back;

    public MyQueue() {
        front=new Stack <>();
        back=new Stack <>();    
    }
    
    public void push(int x) {
        back.push(x);
    }
    
    public int pop() {
        if(front.empty()){
            while(!back.isEmpty()){
                front.push(back.pop());
            }
        }
        return front.pop();
    }
    
    public int peek() {
        if(front.isEmpty()){
            while(!back.isEmpty()){
                front.push(back.pop());
            }
        }
        return front.peek();
    }
    
    public boolean empty() {
        return front.isEmpty() && back.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */