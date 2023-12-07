class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class SwapPairs {
    public ListNode swapPairs(ListNode A) {
        ListNode t = A;
        while (t != null && t.next != null) {
            int temp = t.val;
            t.val = t.next.val;
            t.next.val = temp;
            t = t.next.next;
        }
        
        return A;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        SwapPairs sp = new SwapPairs();
        ListNode result = sp.swapPairs(node1);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
