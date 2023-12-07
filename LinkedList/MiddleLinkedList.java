package LinkedList;

/**
 * Class MiddleLinkedList
 * This class provides a method to find the middle node of a singly linked list.
 */
public class MiddleLinkedList {

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
     * Method middleNode
     * This method takes the head of a singly linked list and returns the middle
     * node of the list.
     *
     * @param head - the head of the singly linked list
     * @return the middle node of the list
     */
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a singly linked
     * list, finds the middle node of the list, and prints the value of the middle
     * node.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;

        ListNode middle = middleNode(head);
        // print or use the middle node here
        System.out.println(middle.val);
    }
}