import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class RestoreArrayFromAdjacentPairs
 * This class provides a method to restore an array from its adjacent pairs.
 */
public class RestoreArrayFromAdjacentPairs {

    /**
     * Method restoreArray
     * This method takes a 2D integer array as input, and returns the array restored
     * from its adjacent pairs.
     * The method creates a map to store each number and its adjacent numbers, and
     * then iterates through the map to find the start of the array. It then uses
     * the map to restore the rest of the array.
     *
     * @param adjacentPairs - the 2D integer array of adjacent pairs
     * @return the array restored from its adjacent pairs
     */
    public static int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length + 1;
        int[] result = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] pair : adjacentPairs) {
            map.putIfAbsent(pair[0], new ArrayList<>());
            map.putIfAbsent(pair[1], new ArrayList<>());
            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                result[0] = entry.getKey();
                break;
            }
        }
        result[1] = map.get(result[0]).get(0);
        for (int i = 2; i < n; i++) {
            List<Integer> list = map.get(result[i - 1]);
            result[i] = result[i - 2] == list.get(0) ? list.get(1) : list.get(0);
        }
        return result;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a 2D integer array
     * of adjacent pairs and restores the array using the restoreArray method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[][] adjacentPairs = { { 2, 1 }, { 3, 4 }, { 3, 2 } };
        int[] result = restoreArray(adjacentPairs);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}