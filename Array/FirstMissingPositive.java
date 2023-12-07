import java.util.ArrayList;

public class FirstMissingPositive {
    // i need o(n) time and o(1) space
    public static int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            if (num > 0 && num <= n) {
                int index = num - 1;
                if (A.get(index) != num) {
                    A.set(i, A.get(index));
                    A.set(index, num);
                    i--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (A.get(i) != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(3);
        A.add(4);
        A.add(-1);
        A.add(1);
        System.out.println(firstMissingPositive(A));
    }
}
