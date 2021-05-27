import java.util.LinkedList;
public class queueLL{
    private LinkedList<Integer> ll = new LinkedList();

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