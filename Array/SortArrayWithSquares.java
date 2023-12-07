import java.util.Arrays;

public class SortArrayWithSquares {
    // public static int[] sortArrayWithSquares(int[] A) {
    // int len = A.length;

    // for (int i = 0; i < len; i++) {
    // A[i] = Math.abs(A[i] * A[i]);
    // }
    // Arrays.sort(A);

    // return A;
    // }

    public static int[] sortArrayWithSquares(int[] A) {
        int len = A.length;
        int[] result = new int[len];
        int i = 0, j = len - 1;
        for (int k = len - 1; k >= 0; k--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[k] = A[i] * A[i];
                i++;
            } else {
                result[k] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { -6, -3, -1, 2, 4, 5 };
        int[] res = sortArrayWithSquares(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
