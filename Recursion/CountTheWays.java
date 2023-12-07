// count the ways that m * n matrix 

public class CountTheWays {
    static int count(int n, int m) {
        // base case 
        if (n == 1 || m == 1) {
            return 1;
        }

        return count(n - 1, m) + count(n, m - 1);
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(count(n, m));
    }    
}
