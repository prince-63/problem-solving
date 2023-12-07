/**
 * Class PlusOne
 * This class provides a method to add one to a number represented as an array
 * of digits.
 */
public class PlusOne {

    /**
     * Method plusOne
     * This method takes an integer array representing a number as input, and
     * returns a new array representing the number plus one.
     * The method iterates through the array from right to left, adding one to the
     * current digit if it is less than 9, or setting it to 0 if it is 9. If all
     * digits are 9, it creates a new array with an extra digit at the start.
     *
     * @param digits - the integer array representing the number
     * @return a new array representing the number plus one
     */
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array
     * representing a number, adds one to the number using the plusOne method, and
     * prints the result.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] arr = plusOne(digits);
        for (int n : arr) {
            System.out.print(n);
        }
        System.out.println();
    }
}