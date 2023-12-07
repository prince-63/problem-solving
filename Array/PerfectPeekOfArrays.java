public class PerfectPeekOfArrays {
    public static int perfectPeak(int[] A) {
        int len = A.length;
        int[] leftMax = new int[len];
        int[] rightMin = new int[len];

        // Initialize leftMax array
        leftMax[0] = A[0];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
        }

        // Initialize rightMin array
        rightMin[len - 1] = A[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], A[i]);
        }

        // Find a peak
        for (int i = 1; i < len - 1; i++) {
            if (A[i] > leftMax[i - 1] && A[i] < rightMin[i + 1]) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] A = { 5706, 26963, 24465, 29359, 16828, 26501, 28146, 18468, 9962, 2996, 492, 11479, 23282, 19170, 15725,
                6335 };
        System.out.println(perfectPeak(A));
    }
}