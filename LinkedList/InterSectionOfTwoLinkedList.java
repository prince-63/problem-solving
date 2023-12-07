/**
 * Class InterSectionOfTwoLinkedList
 * This class provides a method to find the node at which the intersection of
 * two singly linked lists begins.
 */
public class InterSectionOfTwoLinkedList {

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
     * Method getIntersectionNode
     * This method takes the heads of two singly linked lists and returns the node
     * at which the intersection of the two lists begins.
     *
     * @param headA - the head of the first singly linked list
     * @param headB - the head of the second singly linked list
     * @return the node at which the intersection of the two lists begins
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates two singly linked
     * lists that intersect at a certain node, and prints the value of the node at
     * which the intersection begins.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ListNode intersection = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode list1 = new ListNode(4, new ListNode(1, intersection));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(1, intersection)));
        ListNode mergedList = getIntersectionNode(list1, list2);
        System.out.println(mergedList.val);
    }
}