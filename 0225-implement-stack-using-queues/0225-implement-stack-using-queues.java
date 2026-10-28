class MyStack {
    Queue<Integer> front;
    Queue<Integer> rear;

    public MyStack() {
        front= new ArrayDeque<>();
        rear=new ArrayDeque<>();
    }
    
    public void push(int x) {
        if(front.isEmpty()){
            front.add(x);
        }
        else{
            rear.add(x);
            while(!front.isEmpty()){
                rear.add(front.remove());
            }
            Queue<Integer> temp=front;
            front=rear;
            rear=temp;
        }
        
    }
    
    public int pop() {
        return front.remove();
    }
    
    public int top() {
        return front.peek();
    }
    
    public boolean empty() {
        if(front.isEmpty() && rear.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */