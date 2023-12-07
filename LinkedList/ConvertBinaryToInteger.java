package LinkedList;

/**
 * Class ConvertBinaryToInteger
 * This class provides a method to convert a binary number, represented as a
 * singly linked list, to an integer.
 */
public class ConvertBinaryToInteger {

    /**
     * Class ListNode
     * This class represents a node in the singly linked list, which contains a
     * value and a reference to the next node.
     */
    class ListNode {
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
     * Class Solution
     * This class provides a method to get the decimal value of a binary number
     * represented as a singly linked list.
     */
    static class Solution {
        /**
         * Method getDecimalValue
         * This method takes the head of a singly linked list, where each node in the
         * list represents a binary digit, and returns the decimal value of the binary
         * number.
         *
         * @param head - the head of the singly linked list
         * @return the decimal value of the binary number
         */
        public int getDecimalValue(ListNode head) {
            int num = 0;
            while (head != null) {
                num = num * 2 + head.val;
                head = head.next;
            }
            return num;
        }
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a singly linked
     * list representing a binary number, and prints the decimal value of the binary
     * number.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode head = null;
        head = new ConvertBinaryToInteger().new ListNode(1);
        head.next = new ConvertBinaryToInteger().new ListNode(0);
        head.next.next = new ConvertBinaryToInteger().new ListNode(1);
        System.out.println(s.getDecimalValue(head));
    }
}