public class client {
    public static void main(String[] args) {
        queueUsingStack_push st = new queueUsingStack_push();
        for (int i = 1; i <= 10; i++) {
            st.add(i * 10);
        }

        while (st.size() != 0) {
            System.out.println(st.remove());
        }
        System.out.println(st.peek());
    }
}