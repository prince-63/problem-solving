/**
 * Class ShuffleString
 * This class provides a method to restore a string from its shuffled state.
 */
public class ShuffleString {

    /**
     * Method restoreString
     * This method takes a string and an integer array as input, and returns the string restored from its shuffled state.
     * The method creates a character array and places each character from the input string at the index specified in the indices array.
     *
     * @param s - the input string
     * @param indices - the array of indices
     * @return the string restored from its shuffled state
     */
    public static String restoreString(String s, int[] indices) {
        char [] result = new char[indices.length];
        for(int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a string and an integer array, and restores the string from its shuffled state using the restoreString method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
}