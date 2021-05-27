public class stack{
    protected int[] arr = null;
    protected int capacity = 0; //max no. of ele array can hold
    protected int tos = -1;
    protected int elementCount = 0; // no. of ele present in stack

    //constructors======================================================================================
    protected void initialisedVariables(int capacity){
        this.capacity = capacity;
        this.tos = -1;
        this.elementCount = 0;
        this.arr = new int[this.capacity];
    }
    public stack(){
        initialisedVariables(10); //default capacity
    }
    public stack(int size){
        initialisedVariables(size);
    }

    //Exceptions ==========================================================================================
    
    private void OverFlowException() throws Exception{
        if(this.elementCount == this.capacity)
            throw new Exception("StackIsFull");
    }
    private void UnderFlowException() throws Exception{
        if(this.elementCount == 0)
            throw new Exception("StackIsEmpty");
    }

    //basic function ======================================================================================

    public int size(){
        return this.elementCount;
    }
    public boolean isEmpty(){
        return this.elementCount == 0;
    }
    public int top() throws Exception{
        UnderFlowException();
        return this.arr[this.tos];
    }
    public void push_(int data){
        this.arr[++this.tos] = data;
        this.elementCount++;
    }
    public void push(int data) throws Exception{
        OverFlowException();
        push_(data);
    }
    public int pop_(){
        int rv = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.elementCount--;
        return rv;
    }
    public int pop() throws Exception{
        UnderFlowException();
        return pop_();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.elementCount; i++){
            sb.append(this.arr[i]);
            if(i != elementCount - 1){
                sb.append(", ");
            }
        } 
        sb.append("]");
        return sb.toString();
    }
}