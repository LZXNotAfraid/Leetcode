class MyQueue {
    
    private List<Integer> l;
    private int head;
    private int tail;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        l = new LinkedList<Integer>();
        head = 0;
        tail = 0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        l.add(x);
        tail ++;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return l.get(head ++);
    }
    
    /** Get the front element. */
    public int peek() {
        return l.get(head);
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(head == tail)
            return true;
        else
            return false;
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
