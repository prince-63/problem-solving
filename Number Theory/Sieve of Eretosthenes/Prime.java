import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        int n = 1000000;

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; ++i) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 0; i <= n; ++i) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
