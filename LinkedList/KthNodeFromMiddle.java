class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class KthNodeFromMiddle {
    public static int middle(ListNode A) {
        int count = 0;
        ListNode slow = A, fast = A;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = (fast.next).next;
            count++;
        }
        return count;
    }

    public static int kthNodeFromMiddle(ListNode A, int B) {
        // check for null
        if (A == null)
            return -1;

        // find middle
        int count = middle(A);
        // find kth node from middle
        int k = (count - 1) - B;

        // check if k is negative
        if (k < 0)
            return -1;

        // traverse k nodes from middle
        ListNode temp = A;
        while (k > 0) {
            temp = temp.next;
            k--;
        }

        return temp.val;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(3);
        A.next = new ListNode(4);
        A.next.next = new ListNode(7);
        A.next.next.next = new ListNode(5);
        A.next.next.next.next = new ListNode(6);
        A.next.next.next.next.next = new ListNode(16);
        A.next.next.next.next.next.next = new ListNode(15);
        A.next.next.next.next.next.next.next = new ListNode(61);
        A.next.next.next.next.next.next.next.next = new ListNode(16);

        int B = 3;

        System.out.println(kthNodeFromMiddle(A, 2));
    }
}
