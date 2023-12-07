/**
 * Class FlippingImage
 * This class provides methods to flip and invert a binary image.
 */
public class FlippingImage {

    /**
     * Method flipAndInvertImage
     * This method takes a 2D binary image and returns the image after flipping and
     * inverting.
     * Time complexity: O(n), where n is the total number of elements in the 2D
     * array.
     * Space complexity: O(1), as the space used does not depend on the size of the
     * input.
     *
     * @param image - the 2D binary image
     * @return the image after flipping and inverting
     */
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[i].length - 1;
            while (start <= end) {
                // Swap the start and end elements
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                // Invert the swapped elements
                image[i][start] = image[i][start] == 0 ? 1 : 0;
                if (start != end) {
                    image[i][end] = image[i][end] == 0 ? 1 : 0;
                }

                start++;
                end--;
            }
        }
        return image;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a 2D binary image
     * and uses the flipAndInvertImage method to flip and invert the image.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] B = flipAndInvertImage(A);
        for (int[] row : B) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}