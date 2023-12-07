class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RemoveNthFromTheEnd {
    public static ListNode removeNthFromEnd(ListNode A, int B) {
        // ListNode temp = A;
        // int count = 0;

        // // finding the length of the list
        // while (temp != null) {
        // count++;
        // temp = temp.next;
        // }

        // // if B is greater than the length of the list, remove the first node
        // if (B >= count) {
        // return A.next;
        // }

        // temp = A;
        // int index = count - B - 1;

        // // finding the node before the node to be removed
        // while (index > 0) {
        // temp = temp.next;
        // index--;
        // }

        // temp.next = temp.next.next;

        // return A;

        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 1; i <= B + 1; i++) {
            if (first != null) {
                first = first.next;
            }
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        if (second.next != null) {
            second.next = second.next.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        A.next.next.next = new ListNode(4);
        A.next.next.next.next = new ListNode(5);
        A.next.next.next.next.next = new ListNode(6);
        // A.next.next.next.next.next.next = new ListNode(7);
        // A.next.next.next.next.next.next.next = new ListNode(8);
        // A.next.next.next.next.next.next.next.next = new ListNode(9);
        // A.next.next.next.next.next.next.next.next.next = new ListNode(10);
        ListNode ans = removeNthFromEnd(A, 4);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
