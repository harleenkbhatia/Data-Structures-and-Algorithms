import java.util.Stack;
public class queueUsingStack_push{
    Stack<Integer> st = new Stack();
    Stack<Integer> temp = new Stack();
    int peekVal = 0;

    public int size(){
        return st.size();
    }
    public boolean isEmpty(){
        return st.isEmpty();
    }
    //O(1)
    public void add(int data){
        transferToAnotherStack();
        this.st.push(data);
        while (this.temp.size() != 0)
            this.st.push(this.temp.pop())
    }
    //O(1)
    public int peek(){
        return this.st.peek();
    }
    private void transferToAnotherStack(){
        while(st.size() != 0)
            temp.push(st.pop());
    }
    //O(n)
    public int remove(){
        return this.st.pop();
    }

}