public class Solution {
    public int[] solve(int[] A) {
        // int len = A.length;
        // int[] ans = new int[len];
        
        // for (int i = 0; i < len; i++) {
        //     double product = 1;
        //     for (int j = 0; j < len; j++) {
        //         if (j == i) {
        //             continue;
        //         }
        //         product *= A[j];
        //     }
        //     ans[i] = (int) (product) % 1000000007;
        // }
        
        // return ans;
        
        int len = A.length;
        int[] ans = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];
        int mod = 1000000007;

        left[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = (int)(((long)left[i - 1] * A[i - 1]) % mod);
        }

        right[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            right[i] = (int)(((long)right[i + 1] * A[i + 1]) % mod);
        }

        for (int i = 0; i < len; i++) {
            ans[i] = (int)(((long)left[i] * right[i]) % mod);
        }

        return ans;
    }
}
