public class client{
    public static void main(String[] args) throws Exception{
        //linkedlist ll = new linkedlist();
        //System.out.println(ll.getFirst());
        linkedlist lla = new linkedlist();
        for(int i=1; i<=10; i++) lla.addLast(i * 10);
        System.out.println(lla.getAt(1));
        lla.display();
        /*
        linkedlist ll1 = new linkedlist();
        for(int i=0; i<10; i++) ll1.addFirst(i * 10);
        
        linkedlist ll2 = new linkedlist();
        for(int i=0; i<10; i++) ll2.addFirst(i * 100);
        
        linkedlist ll3 = new linkedlist();
        for(int i=0; i<10; i++) ll3.addFirst(i * 20);
        
        linkedlist ll4 = new linkedlist();
        for(int i=0; i<10; i++) ll4.addFirst(i * 30);
        */
    }
}