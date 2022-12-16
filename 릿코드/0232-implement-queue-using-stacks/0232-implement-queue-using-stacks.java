class MyQueue {
    int[] queue;
    public MyQueue() {
        queue = new int[0];
    }
    public void push(int x) {
        int index = queue.length;
        int[] newQueue = new int[index+1];
        for(int i=0; i<index; i++) newQueue[i] = queue[i];
        newQueue[index] = x;
        queue = newQueue;
    }
    public int pop() {
        int size = queue.length;
        int[] newQueue = new int[size-1];
        int result = queue[0];
        for(int i=1; i<size; i++) newQueue[i-1] = queue[i];
        queue = newQueue;
        return result;
    }
    public int peek() {
        return queue[0];
    }
    public boolean empty() {
        return queue.length == 0;
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