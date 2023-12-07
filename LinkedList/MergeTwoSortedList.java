import java.util.ArrayList;

/**
 * Class MergeTwoSortedList
 * This class provides a method to merge two sorted linked lists into a new
 * sorted linked list.
 */
public class MergeTwoSortedList {

    /**
     * Class ListNode
     * This class represents a node in the singly linked list, which contains a
     * value and a reference to the next node.
     */
    public static class ListNode {
        int val;
        ListNode next;

        /**
         * Constructor for ListNode
         * Initializes the value of the node.
         *
         * @param val - the value of the node
         */
        ListNode(int x) {
            val = x;
        }

        /**
         * Constructor for ListNode
         * Initializes the value of the node and the next node.
         *
         * @param val  - the value of the node
         * @param next - the next node
         */
        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

    /**
     * Method mergeTwoLists
     * This method takes two sorted singly linked lists and merges them into a new
     * sorted singly linked list.
     *
     * @param list1 - the first sorted singly linked list
     * @param list2 - the second sorted singly linked list
     * @return the head of the new sorted singly linked list
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        list2.next = mergeTwoLists(list1, list2.next);
        return list2;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates two sorted singly
     * linked lists, merges them into a new sorted singly linked list, and prints
     * the values of the nodes in the new list.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList = mergeTwoLists(list1, list2);
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
