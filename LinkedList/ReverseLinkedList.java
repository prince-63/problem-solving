/**
 * Class ReverseLinkedList
 * This class provides a method to reverse a singly linked list.
 */
public class ReverseLinkedList {

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
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Method reverseList
     * This method takes the head of a singly linked list and returns the head of
     * the reversed list.
     *
     * @param head - the head of the singly linked list
     * @return the head of the reversed list
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a singly linked
     * list, reverses the list, and prints the values of the nodes in the reversed
     * list.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2, head);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(4, node2);
        ListNode node4 = new ListNode(5, node3);

        ListNode reversed = reverseList(node4);
        while (reversed != null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }
    }
}