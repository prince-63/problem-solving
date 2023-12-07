/**
 * Class RemoveLinkedLisstElements
 * This class provides a method to remove all elements from a linked list of
 * integers that have a specific value.
 */
public class RemoveLinkedLisstElements {

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
     * Method removeElements
     * This method takes the head of a singly linked list and a value, and removes
     * all nodes that have that value.
     *
     * @param head - the head of the singly linked list
     * @param val  - the value to be removed
     * @return the head of the list after removing the nodes
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy, prev = dummy;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a singly linked
     * list, removes all nodes that have a specific value, and prints the values of
     * the remaining nodes.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ListNode head = null;
        head = new RemoveLinkedLisstElements.ListNode(1);
        head.next = new RemoveLinkedLisstElements.ListNode(2);
        head.next.next = new RemoveLinkedLisstElements.ListNode(6);
        head.next.next.next = new RemoveLinkedLisstElements.ListNode(3);
        head.next.next.next.next = new RemoveLinkedLisstElements.ListNode(4);
        head.next.next.next.next.next = new RemoveLinkedLisstElements.ListNode(5);
        head.next.next.next.next.next.next = new RemoveLinkedLisstElements.ListNode(6);
        ListNode res = removeElements(head, 6);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}