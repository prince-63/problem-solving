/**
 * Class SignProductOfArray
 * This class provides a method to determine the sign of the product of an array.
 */
public class SignProductOfArray {

    /**
     * Method arraySign
     * This method takes an integer array as input, and returns the sign of the product of the array.
     * The method iterates through the array and multiplies the sign of the current number with the current product sign. If the current number is zero, the method returns zero immediately.
     *
     * @param nums - the integer array
     * @return the sign of the product of the array (-1 if negative, 0 if zero, 1 if positive)
     */
    public static int arraySign(int[] nums) {
        int sign = 1;

        for(int num : nums) {
            if(num == 0) {
                return 0;
            } else if(num < 0) {
                sign = -sign;
            }
        }

        return sign;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array and determines the sign of the product of the array using the arraySign method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println(arraySign(nums));
    }
}
