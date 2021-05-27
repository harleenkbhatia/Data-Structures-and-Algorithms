// import java.util.LinkedList;
public class queue01{
    private class Node{
        int data = 0;
        Node next = null;

        Node(int data){
            this.data;
        }
    }
    private Node head = null;
    private Node tail = null;
    private Node elementCount = 0;

    private void addLast(int data){
        Node node = new Node(data);
        if(this.elementCount == 0){
            this.head = this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
    }
    private int removeFirst(){
        Node rn = this.head;
        if(this.element == 1)
            this.head = this.tail = null;
        else{
            this.head = rn.next;
        }
        rn.next = null;
        this.elementCount--;

        return rn.data;
    }

    public int size(){
        return ll.size();
    }
    public boolean isEmpty(){
        return ll.size() == 0;
    }
    public int front(){
        return ll.getFirst();
    }
    public void push(int ele){
        return ll.addLast(ele);
    }
    public int pop(){
        return ll.removeFirst();
    }

}