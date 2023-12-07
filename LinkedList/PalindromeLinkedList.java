package LinkedList;

/**
 * Class PalindromeLinkedList
 * This class provides a method to check if a singly linked list is a
 * palindrome.
 */
public class PalindromeLinkedList {

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
     * Method isPalindrome
     * This method takes the head of a singly linked list and returns true if the
     * list is a palindrome, and false otherwise.
     *
     * @param head - the head of the singly linked list
     * @return true if the list is a palindrome, and false otherwise
     */
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode prev = null, curr = slow;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Compare the first half and the reversed second half
        ListNode firstHalf = head, secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a singly linked
     * list, checks if the list is a palindrome, and prints the result.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(isPalindrome(list));
    }
}