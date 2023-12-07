class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class DeleteDublicates {
    // public static ListNode deleteDuplicates(ListNode A) {
    // HashSet<Integer> data = new HashSet<>();

    // ListNode temp = A;

    // while (temp != null) {
    // data.add(temp.val);
    // temp = temp.next;
    // }

    // List<Integer> list = new ArrayList<>(data);
    // Collections.sort(list);

    // ListNode result = new ListNode(0); // dummy head node
    // ListNode ans = result;

    // for (int val : list) {
    // ans.next = new ListNode(val);
    // ans = ans.next;
    // }

    // return result.next; // skip the dummy head node
    // }

    public static ListNode deleteDuplicates(ListNode A) {
        ListNode temp = A;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next; // skip the next node
            } else {
                temp = temp.next;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        A.next = new ListNode(1);
        A.next.next = new ListNode(2);
        A.next.next.next = new ListNode(3);
        A.next.next.next.next = new ListNode(3);
        A.next.next.next.next.next = new ListNode(4);
        A.next.next.next.next.next.next = new ListNode(5);
        A.next.next.next.next.next.next.next = new ListNode(5);
        A.next.next.next.next.next.next.next.next = new ListNode(6);
        A.next.next.next.next.next.next.next.next.next = new ListNode(7);
        ListNode ans = deleteDuplicates(A);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
