/**
 * Class NumberOfEmployeesWhoMetTheTargets
 * This class provides a method to count the number of employees who met a certain target.
 */
public class NumberOfEmployeesWhoMetTheTargets {

    /**
     * Method numberOfEmployeesWhoMetTarget
     * This method takes an array of hours worked by each employee and a target number of hours as input, and returns the number of employees who worked at least the target number of hours.
     * The method iterates through the array, and increments a count for each employee who worked at least the target number of hours.
     *
     * @param hours - the array of hours worked by each employee
     * @param target - the target number of hours
     * @return the number of employees who worked at least the target number of hours
     */
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for(int i = 0; i < hours.length; i++) {
            if(target <= hours[i]) {
                count++;
            }
        }

        return count;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of hours worked by each employee and a target number of hours, and prints the number of employees who worked at least the target number of hours.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] hours = { 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 5;

        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
}