/**
 * Class JewelsAndStones
 * This class provides a method to count the number of jewels in a string of stones.
 */
public class JewelsAndStones {

    /**
     * Method numJewelsInStones
     * This method takes two strings as input, one representing the types of stones that are jewels, and the other representing the stones you have.
     * Each character in the stones string represents a type of stone you have, and each character in the jewels string represents a type of stone that is a jewel.
     * The method returns the number of stones you have that are also jewels.
     *
     * @param jewels - the types of stones that are jewels
     * @param stones - the stones you have
     * @return the number of stones you have that are also jewels
     */
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates two strings representing the types of stones that are jewels and the stones you have, and prints the number of stones you have that are also jewels.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}