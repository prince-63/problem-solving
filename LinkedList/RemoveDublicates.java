/**
 * Class RemoveDublicates
 * This class provides a method to remove duplicates from a sorted linked list.
 */
public class RemoveDublicates {

    /**
     * Class ListNode
     * This class represents a node in the singly linked list, which contains a value and a reference to the next node.
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
        ListNode(int x) { val = x; }

        /**
         * Constructor for ListNode
         * Initializes the value of the node and the next node.
         *
         * @param val - the value of the node
         * @param next - the next node
         */
        ListNode(int x, ListNode next) { val = x; this.next = next; }
    }

    /**
     * Method removeDublicates
     * This method takes the head of a sorted singly linked list and removes all duplicates.
     *
     * @param head - the head of the singly linked list
     * @return the head of the list after removing duplicates
     */
    public static ListNode removeDublicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a sorted singly linked list with duplicates, removes the duplicates, and prints the values of the nodes in the list.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode removedList = removeDublicates(list);
        while (removedList != null) {
            System.out.print(removedList.val + " ");
            removedList = removedList.next;
        }
    }
}