import java.util.ArrayList;
import java.util.List;

/**
 * Class OrderedStream
 * This class simulates a stream of data that can be inserted in any order but
 * must be read in order.
 */
public class OrderedStream {
    private String[] stream;
    private int ptr;

    /**
     * Constructor OrderedStream
     * This constructor takes the size of the stream as input, and initializes the
     * stream and the pointer.
     *
     * @param n - the size of the stream
     */
    public OrderedStream(int n) {
        stream = new String[n];
        ptr = 0;
    }

    /**
     * Method insert
     * This method takes an id key and a value as input, inserts the value at the
     * appropriate position in the stream, and returns a chunk of the stream from
     * the current pointer to the next null value.
     *
     * @param idKey - the id key of the value
     * @param value - the value to insert
     * @return a chunk of the stream from the current pointer to the next null value
     */
    public List<String> insert(int idKey, String value) {
        stream[idKey - 1] = value;
        List<String> chunk = new ArrayList<>();

        while (ptr < stream.length && stream[ptr] != null) {
            chunk.add(stream[ptr]);
            ptr++;
        }

        return chunk;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an ordered stream,
     * inserts several values into it, and prints the chunks of the stream that are
     * returned.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        System.out.println(os.insert(3, "ccccc")); // Output: []
        System.out.println(os.insert(1, "aaaaa")); // Output: ["aaaaa"]
        System.out.println(os.insert(2, "bbbbb")); // Output: ["bbbbb", "ccccc"]
        System.out.println(os.insert(5, "eeeee")); // Output: []
        System.out.println(os.insert(4, "ddddd")); // Output: ["ddddd", "eeeee"]
    }
}