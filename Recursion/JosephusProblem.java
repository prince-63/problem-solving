import java.util.ArrayList;

public class JosephusProblem {

    static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        int ans = helper(list, 0, k);
        return ans;
    }

    static int helper(ArrayList<Integer> list, int currentIndex, int k) {
        if (list.size() == 1) {
            return list.get(0);
        }

        int removeIndex = (currentIndex + k - 1) % list.size();
        list.remove(removeIndex);
        return helper(list, removeIndex, k);
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 3));
    }
}
