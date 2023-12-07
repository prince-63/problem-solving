import java.util.Stack;

public class LeadersInArray {
    public static int[] leaderInArray(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int max = arr[n - 1];
        stack.push(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                stack.push(max);
            }
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int[] res = leaderInArray(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

