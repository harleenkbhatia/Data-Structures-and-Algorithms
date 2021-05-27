public class queue{

    protected int[] arr = null;
    protected int capacity = 0; //max no. of ele array can hold
    protected int elementCount = 0; // no. of ele present in queue
    protected int front = 0;
    protected int back = 0;

    //constructors======================================================================================
    protected void initialisedVariables(int capacity){
        this.capacity = capacity;
        this.elementCount = 0;
        this.arr = new int[this.capacity];
        this.back = 0;
        this.front = 0;
    }
    public queue(){
        initialisedVariables(10); //default capacity
    }
    public queue(int size){
        initialisedVariables(size);
    }

    //Exceptions ==========================================================================================
    
    private void OverFlowException() throws Exception{
        if(this.elementCount == this.capacity)
            throw new Exception("QueueIsFull");
    }
    private void UnderFlowException() throws Exception{
        if(this.elementCount == 0)
            throw new Exception("QueueIsEmpty");
    }

    //basic function ======================================================================================

    public int size(){
        return this.elementCount;
    }
    public boolean isEmpty(){
        return this.elementCount == 0;
    }
    public int front() throws Exception{
        UnderFlowException();
        return this.arr[this.front];
    }
    public void push_(int data){
        this.arr[this.back] = data;
        this.elementCount++;
        this.back = (this.back + 1) % this.capacity;
    }
    public void push(int data) throws Exception{
        OverFlowException();
        push_(data);
    }
    public int pop_(){
        int rv = this.arr[this.front]; //return value
        this.arr[this.front] = 0;
        this.elementCount--;
        this.front = (this.front + 1) % capacity;
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
            int idx = (this.front + i) % this.capacity;
            sb.append(this.arr[idx]);
            if(i != elementCount - 1){
                sb.append(", ");
            }
        } 
        sb.append("]");
        return sb.toString();
    }
}