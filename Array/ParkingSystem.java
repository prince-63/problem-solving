/**
 * Class ParkingSystem
 * This class simulates a parking system with three types of parking spaces:
 * big, medium, and small.
 */
public class ParkingSystem {

    int big;
    int medium;
    int small;

    /**
     * Constructor ParkingSystem
     * This constructor takes the number of big, medium, and small parking spaces as
     * input, and initializes the parking system with these values.
     *
     * @param big    - the number of big parking spaces
     * @param medium - the number of medium parking spaces
     * @param small  - the number of small parking spaces
     */
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    /**
     * Method addCar
     * This method takes a car type as input, and tries to add the car to the
     * parking system.
     * The method checks if there is a parking space of the appropriate type
     * available, and if so, it decreases the number of available spaces of that
     * type and returns true. If there is no space available, it returns false.
     *
     * @param carType - the type of the car (1 for big, 2 for medium, 3 for small)
     * @return true if the car was added to the parking system, false otherwise
     */
    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        } else if (carType == 2 && medium > 0) {
            medium--;
            return true;
        } else if (carType == 3 && small > 0) {
            small--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a parking system,
     * and tries to add several cars to it.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // Output: true
        System.out.println(parkingSystem.addCar(2)); // Output: true
        System.out.println(parkingSystem.addCar(3)); // Output: false
        System.out.println(parkingSystem.addCar(1)); // Output: false
    }
}