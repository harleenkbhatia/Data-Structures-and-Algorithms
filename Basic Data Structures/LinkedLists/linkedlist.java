public class linkedlist{
    private class Node{
        int data = 0;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }
    private Node head = null;
    private Node tail = null;
    private int sizeOfLL = 0;
    
    public boolean isEmpty(){
        return this.sizeOfLL == 0;
    } 
    public int size(){
        return this.sizeOfLL;
    }   
    public void display(){
        Node curr = this.head;
        while(curr != null){
            System.out.print(curr.data + "--> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public int size(){
        int len = 0;
        Node curr = this.head;
        while(curr != null){
            curr=curr.next;
            len++;
        }
        return len;
    }

//exception===============================================================

    public void EmptyException() throws Exception{
        if(this.sizeOfLL == 0){
            throw new Exception("LinkedList is Empty: -1");
        }
    }
    //used in get
    public void IndexOutOfBoundExclusiveException(int idx) throws Exception{
        if(idx < 0 || idx >= this.sizeOfLL) //exclude krna h size ko toh size ki val dene pe error throw krna h
            throw new Exception("Index Out Of Bound: -1");
    }
    //used in add
    public void IndexOutOfBoundInclusiveException(int idx) throws Exception{
        if(idx < 0 || idx > this.sizeOfLL) //include krna h size ko toh size ki val se bda dene pe error throw krna h
            throw new Exception("Index Out Of Bound: -1");
    }

//get=====================================================================
    
    public int getFirst() throws Exception{
        EmptyException();
        return this.head.data;
    }
    public int getLast() throws Exception{
        EmptyException();
        return this.tail.data;
    }
    private Node getNodeAt(int idx){
        Node curr = this.head;
        while (idx-- > 0) {
            curr = curr.next;
        }
        return curr;
    }
    public int getAt(int idx) throws Exception{
        IndexOutOfBoundExclusiveException(idx);
        Node node = getNodeAt(idx);
        return node.data;
    } 
//Add===================================================
    private void addFirstNode(Node node){
        if(this.head == null){
            this.head = node;
            this.tail = node;
        } else{
            node.next = this.head;
            this.head = node;
        }
        this.sizeOfLL++;
    }
    public void addFirst(int data){
        Node node = new Node(data);
        addFirstNode(node);
    }
    private void addLastNode(Node node){
        if(this.head == null){
            this.head = node;
            this.tail = node;
        } else{
            this.tail.next = node;
            this.tail = node;
        }
        this.sizeOfLL++;
    }
    void addLast(int val) {
        Node node = new Node(val);
        //node.data = val;
        addLastNode(node);
    }
    private void addAtNode(int idx, Node node){
        if(idx == 0) addFirstNode(node);
        else if(idx == sizeOfLL) addLastNode(node);
        else{
            Node prev = getNodeAt(idx - 1); //iski vjh se O(n) hua h
            Node forw = prev.next;
            prev.next = node;
            node.next = forw;
            this.sizeOfLL++;
        }
    }
    public void addAt(int idx, int val) throws Exception{
        IndexOutOfBoundInclusiveException(idx);
        Node node = new Node(val);
        addAtNode(idx, node);
        
    }

//remove ===============================================================

    private Node removeFirstNode(){
        Node removeNode = this.head;
        if(this.sizeOfLL == 1){
            this.head = null;
            this.tail = null;
        } else{
            Node forw = this.head.next;
            removeNode.next = null;
            this.head = forw;
        }
        this.sizeOfLL--;
        return removeNode;
    }
    public int removeFirst() throws Exception{
        EmptyException();
        Node node = removeFirstNode();
        return node.data;
    }
    private Node removeLastNode(){
        Node removeNode = this.tail;
        if(this.sizeOfLL == 1){
            this.head = null;
            this.tail = null;
        } else{
            Node secondLastNode = getNodeAt(this.sizeOfLL - 2);
            this.tail = secondLastNode;
            this.tail.next = null;
        }
        this.sizeOfLL--;
        return removeNode;
    }
    public int removeLast() throws Exception{
        EmptyException();
        Node node = removeLastNode();
        return node.data;
    }
    private Node removeNodeAt(int idx){
        if(idx == 0) return removeFirstNode();
        else if(idx == this.sizeOfLL - 1){
            return removeLastNode();
        }
        else{
            Node prev = getNodeAt(idx - 1);
            Node curr = prev.next;
            Node forw = curr.next;

            prev.next = forw;
            curr.next = null;

            this.sizeOfLL--;
            return curr;
        }

    }
    public int removeAt(int idx) throws Exception{
        EmptyException();
        IndexOutOfBoundExclusiveException(idx);
        Node node = removeNodeAt(idx);
        return node.data;
    }
    
    
}