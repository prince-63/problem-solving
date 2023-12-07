import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RemoveDublicateFromSortedList {
    // Given a sorted linked list, delete all nodes that have duplicate numbers,
    // leaving only distinct numbers from the original list.
    public static ListNode deleteDuplicates(ListNode A) {
        ListNode temp = A;
        ListNode prev = null;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                while (temp != null && temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }

                if (prev == null) {
                    A = temp.next;
                } else {
                    prev.next = temp.next;
                }
            } else {
                prev = temp;
            }
            temp = temp.next;
        }

        return A;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        // A.next = new ListNode(1);
        // A.next.next = new ListNode(2);
        // A.next.next.next = new ListNode(3);
        // A.next.next.next.next = new ListNode(3);
        // A.next.next.next.next.next = new ListNode(4);
        // A.next.next.next.next.next.next = new ListNode(5);
        // A.next.next.next.next.next.next.next = new ListNode(5);
        // A.next.next.next.next.next.next.next.next = new ListNode(6);
        // A.next.next.next.next.next.next.next.next.next = new ListNode(7);
        ListNode ans = deleteDuplicates(A);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
