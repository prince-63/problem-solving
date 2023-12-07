import java.util.ArrayList;
import java.util.List;

public class MissingAndRepeatedNumber {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();

        long SN = (n * (n + 1)) / 2;
        long S2N = ((n * (n + 1)) * (2 * n + 1)) / 6;

        long s = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s += (long) A.get(i);
            s2 += (long) A.get(i) * (long) A.get(i);
        }

        long val1 = s - SN;
        long val2 = s2 - S2N;
        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) x);
        ans.add((int) y);

        return ans;
    }

    public ArrayList<Integer> repeatedNumber1(final List<Integer> A) {
        // int xor = 0;
        // int xor1 = 0;
        // int xor2 = 0;
        // int n = A.size();

        // for (int i = 0; i < n; i++) {
        // xor ^= A.get(i);
        // }

        // for (int i = 1; i <= n; i++) {
        // xor ^= i;
        // }

        // int set_bit_no = xor & ~(xor-1);

        // for (int i = 0; i < n; i++) {
        // if ((A.get(i) & set_bit_no) != 0)
        // xor1 ^= A.get(i);
        // else
        // xor2 ^= A.get(i);
        // }

        // for (int i = 1; i <= n; i++) {
        // if ((i & set_bit_no) != 0)
        // xor1 ^= i;
        // else
        // xor2 ^= i;
        // }

        // ArrayList<Integer> ans = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // if (A.get(i) == xor1) {
        // ans.add(xor1);
        // ans.add(xor2);
        // return ans;
        // }
        // }

        // ans.add(xor2);
        // ans.add(xor1);

        // return ans;
        int arr[] = new int[A.size() + 1];

        for (int i = 0; i < A.size(); i++) {
            arr[A.get(i)]++;
        }

        int missing = -1;
        int repeating = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2)
                repeating = i;
            if (arr[i] == 0)
                missing = i;

            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(1);

        List<Integer> ans = new ArrayList<>();
        ans = repeatedNumber(a);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
