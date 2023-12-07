class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class SortBinaryLinkedList {
    public static ListNode sortBinaryLinkedList(ListNode A) {
        // solution 1
        // ArrayList<Integer> list = new ArrayList<>();

        // ListNode temp = A;
        // while (temp != null) {
        // list.add(temp.val);
        // temp = temp.next;
        // }

        // Collections.sort(list);

        // int i = 0;
        // temp = A;
        // while (temp != null) {
        // temp.val = list.get(i);
        // temp = temp.next;
        // i++;
        // }

        // return A;

        // solution 2
        // ListNode temp = A;
        // while (temp != null) {
        //     ListNode temp1 = temp.next;
        //     while (temp1 != null) {
        //         if (temp.val > temp1.val) {
        //             int t = temp.val;
        //             temp.val = temp1.val;
        //             temp1.val = t;
        //             break;
        //         }
        //         temp1 = temp1.next;
        //     }
        //     temp = temp.next;
        // }

        // return A;
            
        // solution 3
        ListNode zero = new ListNode(0);
        ListNode one = new ListNode(0);
        ListNode temp = A;
        ListNode temp1 = zero;
        ListNode temp2 = one;
        while (temp != null) {
            if (temp.val == 0) {
                temp1.next = temp;
                temp1 = temp1.next;
            } else {
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp1.next = one.next;
        temp2.next = null;
        return zero.next;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(0);
        A.next = new ListNode(1);
        A.next.next = new ListNode(0);
        A.next.next.next = new ListNode(1);
        A.next.next.next.next = new ListNode(0);
        A.next.next.next.next.next = new ListNode(0);
        A.next.next.next.next.next.next = new ListNode(1);
        A.next.next.next.next.next.next.next = new ListNode(1);
        A.next.next.next.next.next.next.next.next = new ListNode(1);
        A.next.next.next.next.next.next.next.next.next = new ListNode(0);
        
        ListNode temp = sortBinaryLinkedList(A);
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
