public static long multiplyTwoLists(LinkedList one, LinkedList two){
    one.reversePI();
    two.reversePI();

    LinkedList ans = new LinkedList();

    Node c1 = one.head;
    Node c2 = two.head;
    int carry = 0;
    while(c2 != null || carry != 0){
        while(c1 != null){
            int product = (c1 != null ? c1.data : 0) * (c2 != null ? c2.data : 0) + carry;
            carry = product / 10;
            product = product % 10;

            if (c1 != null) c1 = c1.next;
        }
        if (c2 != null) c2 = c2.next;
    }

    one.reversePI();
    two.reversePI();

    return ans;
}