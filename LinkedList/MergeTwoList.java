class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MergeTwoList {
    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (A != null && B != null) {
            if (A.val < B.val) {
                temp.next = A;
                A = A.next;
            } else {
                temp.next = B;
                B = B.next;
            }
            temp = temp.next;
        }
        if (A != null) {
            temp.next = A;
        }
        if (B != null) {
            temp.next = B;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(5);
        ListNode B = new ListNode(10);
        ListNode C = new ListNode(15);
        ListNode D = new ListNode(20);
        ListNode E = new ListNode(25);
        ListNode F = new ListNode(30);
        ListNode G = new ListNode(35);
        ListNode H = new ListNode(40);
        ListNode I = new ListNode(45);
        ListNode J = new ListNode(50);

        A.next = C;
        C.next = E;
        E.next = G;
        G.next = I;

        B.next = D;
        D.next = F;
        F.next = H;
        H.next = J;

        ListNode result = mergeTwoLists(A, B);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
