class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RotateList {
    public static int length(ListNode A) {
        int count = 0;
        ListNode fast = A;
        while (fast != null) {
            fast = fast.next;
            count++;
        }
        return count;
    }

    public static ListNode rotateRight(ListNode A, int B) {
        ListNode temp = A;
        int len = length(A);
        B = B % len; // If B is greater than the length of the list
        if (B == 0) {
            return A;
        }
        int cnt = len - B;
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);

        ListNode one = first;
        ListNode two = second;

        while (cnt > 0) {
            one.next = temp;
            temp = temp.next;
            one = one.next;
            cnt--;
        }

        while (temp != null) {
            two.next = temp;
            temp = temp.next;
            two = two.next;
        }

        two.next = first.next;
        one.next = null;

        return second.next;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode temp = A;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(5);
        temp = temp.next;
        temp.next = new ListNode(6);
        temp = temp.next;
        temp.next = new ListNode(7);
        temp = temp.next;
        temp.next = new ListNode(8);
        temp = temp.next;
        temp.next = new ListNode(9);
        temp = temp.next;
        temp.next = new ListNode(10);
        temp = temp.next;
        temp.next = new ListNode(11);
        temp = temp.next;
        temp.next = new ListNode(12);
        temp = temp.next;
        temp.next = new ListNode(13);
        temp = temp.next;
        temp.next = new ListNode(14);
        temp = temp.next;
        temp.next = new ListNode(15);
        temp = temp.next;
        temp.next = new ListNode(16);
        temp = temp.next;
        temp.next = new ListNode(17);
        temp = temp.next;
        temp.next = new ListNode(18);
        temp = temp.next;
        temp.next = new ListNode(19);
        temp = temp.next;
        temp.next = new ListNode(20);
        temp = temp.next;
        temp.next = new ListNode(21);
        temp = temp.next;
        temp.next = new ListNode(22);
        temp = temp.next;
        temp.next = new ListNode(23);
        temp = temp.next;
        temp.next = new ListNode(24);
        temp = temp.next;
        temp.next = new ListNode(25);
        temp = temp.next;
        temp.next = new ListNode(26);
        temp = temp.next;
        temp.next = new ListNode(27);
        temp = temp.next;
        temp.next = new ListNode(28);
        temp = temp.next;
        temp.next = new ListNode(29);
        temp = temp.next;
        temp.next = new ListNode(30);
        temp = temp.next;
        temp.next = new ListNode(31);
        temp = temp.next;
        temp.next = new ListNode(32);
        temp = temp.next;
        temp.next = new ListNode(33);
        temp = temp.next;
        temp.next = new ListNode(34);
        temp = temp.next;
        temp.next = new ListNode(35);
        temp = temp.next;
        temp.next = new ListNode(36);

        int B = 100;
        ListNode ans = rotateRight(A, B);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        System.err.println();
    }
}
