import java.util.*;

public class nextPermutation {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int n = A.size();
        int i = n - 2;
        while (i >= 0 && A.get(i) >= A.get(i + 1)) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (A.get(j) <= A.get(i)) {
                j--;
            }
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
        }
        int start = i + 1;
        int end = n - 1;
        while (start < end) {
            int temp = A.get(start);
            A.set(start, A.get(end));
            A.set(end, temp);
            start++;
            end--;
        }
        return A;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println(nextPermutation(A));
    }
}