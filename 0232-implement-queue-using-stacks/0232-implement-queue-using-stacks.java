class MyQueue {
    Stack<Integer> st1,st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();

    }
    
    public void push(int x) {
        st1.push(x);// simply st1 mai push krte rho jb tk koe top element na mange 
        
    }
    
    public int pop() {
        //jb tk st2 mai elment hai pop krte rho
        if(!st2.isEmpty()){
           return st2.pop();    
        }
        // st1 se st2 mai element daalo fir st2 is pop kro
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
                
            }
            
        }
        return st2.pop();
        
    }
    
    public int peek() {
        //kb tk st2 mai element hai top st2 ko lo
        if(!st2.isEmpty()){
            return st2.peek();    
        }
        //nhi bache element toh st1 is st2 mai daalo fir st2 ka top lo
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            
        }
        return st2.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
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