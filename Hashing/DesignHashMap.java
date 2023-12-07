/**
 * Class DesignHashMap
 * This class provides a simple implementation of a HashMap.
 */
public class DesignHashMap {

    /**
     * Class MyHashMap
     * This class provides methods to add, remove, and check if an element exists in
     * the HashMap.
     */
    class MyHashMap {
        private Node[] nodes;

        /**
         * Class Node
         * This class represents a node in the HashMap, which contains a key, a value,
         * and a reference to the next node.
         */
        class Node {
            int key;
            int value;
            Node next;

            /**
             * Constructor for Node
             * Initializes the key and value of the node.
             *
             * @param key   - the key of the node
             * @param value - the value of the node
             */
            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        /**
         * Constructor for MyHashMap
         * Initializes the nodes array to a size of 10000.
         */
        public MyHashMap() {
            nodes = new Node[10000];
        }

        /**
         * Method put
         * Adds an element to the HashMap or updates the value if the key already
         * exists.
         *
         * @param key   - the key of the element
         * @param value - the value of the element
         */
        public void put(int key, int value) {
            int index = getIndex(key);
            Node prev = findElement(index, key);
            if (prev.next == null)
                prev.next = new Node(key, value);
            else
                prev.next.value = value;
        }

        /**
         * Method get
         * Returns the value to which the specified key is mapped, or -1 if this map
         * contains no mapping for the key.
         *
         * @param key - the key whose associated value is to be returned
         * @return the value to which the specified key is mapped, or -1 if this map
         *         contains no mapping for the key
         */
        public int get(int key) {
            int index = getIndex(key);
            Node prev = findElement(index, key);
            return prev.next == null ? -1 : prev.next.value;
        }

        /**
         * Method remove
         * Removes the mapping for the specified key from this map if present.
         *
         * @param key - key whose mapping is to be removed from the map
         */
        public void remove(int key) {
            int index = getIndex(key);
            Node prev = findElement(index, key);
            if (prev.next != null)
                prev.next = prev.next.next;
        }

        /**
         * Method getIndex
         * Returns the index in the nodes array that the key should be placed.
         *
         * @param key - the key to be placed
         * @return the index in the nodes array that the key should be placed
         */
        private int getIndex(int key) {
            return Integer.hashCode(key) % nodes.length;
        }

        /**
         * Method findElement
         * Returns the previous node of the key in the linked list at the specified
         * index of the nodes array.
         *
         * @param index - the index of the nodes array
         * @param key   - the key to be found
         * @return the previous node of the key in the linked list at the specified
         *         index of the nodes array
         */
        private Node findElement(int index, int key) {
            if (nodes[index] == null)
                return nodes[index] = new Node(-1, -1);
            Node prev = nodes[index];
            while (prev.next != null && prev.next.key != key) {
                prev = prev.next;
            }
            return prev;
        }
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a MyHashMap object
     * and performs operations on it.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        DesignHashMap design = new DesignHashMap();
        MyHashMap hashMap = design.new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1)); // returns 1
        System.out.println(hashMap.get(3)); // returns -1 (not found)
        hashMap.put(2, 1); // update the existing value
        System.out.println(hashMap.get(2)); // returns 1
        hashMap.remove(2); // remove the mapping for 2
        System.out.println(hashMap.get(2)); // returns -1 (not found)
    }
}