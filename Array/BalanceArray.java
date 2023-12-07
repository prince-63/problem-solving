// public class BalanceArray {
//     public static boolean checkOddEvenSum(int[] A, int skipValue, int len) {
//         int oddSum = 0;
//         int evenSum = 0;

//         for (int i = 0; i < len; i++) {
//             if (i == skipValue) {
//                 continue;
//             }
//             if ((i - (i > skipValue ? 1 : 0)) % 2 == 0) {
//                 evenSum += A[i];
//             } else {
//                 oddSum += A[i];
//             }
//         }

//         return evenSum == oddSum;
//     }

//     public static int solve(int[] A) {
//         int len = A.length;
//         int count = 0;
//         for (int i = 0; i < len; i++) {
//             if (checkOddEvenSum(A, i, len)) {
//                 count++;
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int[] A = {2, 8, 2, 2, 6, 3};
//         System.out.println(solve(A));
//     }
// }

public class BalanceArray {

    public static int balancedArray(int[] A) {
        int len = A.length;
        int result = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0)
                even += A[i];
            else
                odd += A[i];
        }

        int keven = 0;
        int kodd = 0;

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                if ((even - (A[i] + keven) + kodd) == ((odd - kodd) + keven))
                    result += 1;
                keven += A[i];
            } else {
                if ((odd - (A[i] + kodd) + keven) == (kodd + (even - keven)))
                    result += 1;
                kodd += A[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = { 2, 8, 2, 2, 6, 3 };
        System.out.println(balancedArray(A));
    }
}