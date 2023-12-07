/**
 * Class SumOfAllOddLengthSubArrays
 * This class provides a method to calculate the sum of all possible odd-length subarrays of an array.
 */
public class SumOfAllOddLengthSubArrays {

    /**
     * Method sumOddLengthSubarrays
     * This method takes an integer array as input, and returns the sum of all possible odd-length subarrays of the array.
     * The method iterates through the array and calculates the sum of all possible odd-length subarrays that include the current number.
     *
     * @param arr - the integer array
     * @return the sum of all possible odd-length subarrays of the array
     */
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            int start = i+1;
            int end = arr.length-i;
            int total = start*end;
            int odd = total/2;
            if(total%2==1){
                odd++;
            }
            sum += odd*arr[i];
        }
        return sum;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an integer array and calculates the sum of all possible odd-length subarrays of the array using the sumOddLengthSubarrays method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
