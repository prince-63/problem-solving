/**
 * Class DesignHashSet
 * This class provides a simple implementation of a HashSet.
 */
public class DesignHashSet {

    /**
     * Class MyHashSet
     * This class provides methods to add, remove, and check if an element exists in the HashSet.
     */
    class MyHashSet {
        private boolean[] arr;

        /**
         * Constructor for MyHashSet
         * Initializes the array to a size of 1000001, assuming the keys are non-negative and the maximum size is 1000000.
         */
        public MyHashSet() {
            arr = new boolean[1000001];
        }

        /**
         * Method add
         * Adds an element to the HashSet.
         *
         * @param key - the element to be added
         */
        public void add(int key) {
            arr[key] = true;
        }

        /**
         * Method remove
         * Removes an element from the HashSet.
         *
         * @param key - the element to be removed
         */
        public void remove(int key) {
            arr[key] = false;
        }

        /**
         * Method contains
         * Checks if an element exists in the HashSet.
         *
         * @param key - the element to be checked
         * @return true if the element exists, false otherwise
         */
        public boolean contains(int key) {
            return arr[key];
        }
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a MyHashSet object and performs operations on it.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        DesignHashSet design = new DesignHashSet();
        MyHashSet hashSet = design.new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));    // returns true
        System.out.println(hashSet.contains(3));    // returns false (not found)
        hashSet.add(2);
        System.out.println(hashSet.contains(2));    // returns true
        hashSet.remove(2);
        System.out.println(hashSet.contains(2));    // returns false (already removed)
    }
}