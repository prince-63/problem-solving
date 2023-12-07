package LinkedList;

/**
 * Class LinkedListCycle
 * This class provides a method to detect if a linked list has a cycle.
 */
public class LinkedListCycle {

    /**
     * Class ListNode
     * This class represents a node in the singly linked list, which contains a
     * value and a reference to the next node.
     */
    public static class ListNode {
        int val;
        ListNode next;

        /**
         * Default Constructor for ListNode
         */
        ListNode() {
        }

        /**
         * Constructor for ListNode
         * Initializes the value of the node.
         *
         * @param val - the value of the node
         */
        ListNode(int val) {
            this.val = val;
        }

        /**
         * Constructor for ListNode
         * Initializes the value of the node and the next node.
         *
         * @param val  - the value of the node
         * @param next - the next node
         */
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Method hasCycle
     * This method takes the head of a singly linked list and returns true if the
     * list has a cycle, and false otherwise.
     *
     * @param head - the head of the singly linked list
     * @return true if the list has a cycle, and false otherwise
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null)
                return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a singly linked
     * list with a cycle, and prints whether the list has a cycle.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ListNode head = null;
        head = new LinkedListCycle.ListNode(3);
        head.next = new LinkedListCycle.ListNode(2);
        head.next.next = new LinkedListCycle.ListNode(0);
        head.next.next.next = new LinkedListCycle.ListNode(-4);
        head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));
    }
}