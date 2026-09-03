class MinStack {
Scanner sc=new Scanner(System.in);
Stack<Integer> st;
Stack<Integer> min;
    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty()||val<=min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(st.peek().equals(min.peek())){
            min.pop();
        }
        st.pop();
    }
    
    public int top() {
        if(!st.isEmpty()){
        return st.peek();
        }
        return 0;
    }
    
    public int getMin() {
        return min.peek();
    }
}
