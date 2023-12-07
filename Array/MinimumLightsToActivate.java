public class MinimumLightsToActivate {
    public static int minimumLightToActivate(int[] A, int B) {
        int len = A.length;
        int bulbFoundIndex = 0;
        int count = 0;
        boolean found = false;

        int i = 0;
        while (i < len) {
            int j = Math.min(i + B - 1, len - 1); // Ensure j doesn't exceed array length
            found = false;

            while (j >= i - B + 1 && j >= 0) { // Start from j and go back to i - B + 1
                if (A[j] == 1) {
                    found = true;
                    bulbFoundIndex = j;
                    count++;
                    break; // Break the loop once a bulb is found
                }
                j--;
            }

            if (!found) {
                return -1;
            }

            // Start the search for the next bulb from the position just after the range of
            // the current bulb
            i = bulbFoundIndex + B;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 1, 1, 0, 0, 1 };
        int B = 3;
        System.out.println(minimumLightToActivate(A, B));
    }
}
