import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;
import java.io.*;

/**
 * Class Result
 * This class provides a method to get the maximum value from a list after
 * performing certain operations.
 */
class Result {

    /**
     * Method getMaxValue
     * This method takes a list of integers, sorts it, and then modifies it such
     * that each element is at most 1 greater than the previous element.
     * It then returns the last element of the modified list.
     *
     * @param arr - the list of integers
     * @return the last element of the modified list
     */
    public static int getMaxValue(List<Integer> arr) {
        Collections.sort(arr);
        arr.set(0, 1);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) - arr.get(i - 1) > 1) {
                arr.set(i, arr.get(i - 1) + 1);
            }
        }
        return arr.get(arr.size() - 1);
    }
}

/**
 * Class maximizing_the_final_element
 * This class reads a list of integers from the standard input, uses the Result
 * class to get the maximum value from the list, and writes the result to the
 * standard output.
 */
public class maximizing_the_final_element {

    /**
     * Main method
     * This method is the entry point for the program. It reads a list of integers
     * from the standard input, uses the Result class to get the maximum value from
     * the list, and writes the result to the standard output.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.getMaxValue(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}