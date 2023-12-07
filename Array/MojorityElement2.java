import java.util.ArrayList;
import java.util.List;

public class MojorityElement2 {
    public static List<Integer> majorityElements(int[] a) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> ans = new ArrayList<>();
        // int check1 = (int) (a.length / 3) + 1;

        // for (int i = 0; i < a.length; i++) {
        // if (map.containsKey(a[i]) && map.get(a[i]) != check1) {
        // map.put(a[i], map.get(a[i]) + 1);
        // }
        // else {
        // map.put(a[i], 1);
        // }

        // if (map.get(a[i]) == check1) {
        // if (!ans.contains(a[i])) {
        // ans.add(a[i]);
        // }
        // }
        // }

        // return ans;
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int len = a.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (cnt1 == 0 && el2 != a[i]) {
                cnt1 = 1;
                el1 = a[i];
            } else if (cnt2 == 0 && el1 != a[i]) {
                cnt2 = 1;
                el2 = a[i];
            } else if (el2 == a[i]) {
                cnt2++;
            } else if (el1 == a[i]) {
                cnt1++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        int mini = (int) len / 3;
        for (int i = 0; i < len; i++) {
            if (el1 == a[i]) {
                cnt1++;
            }

            if (el2 == a[i]) {
                cnt2++;
            }
        }

        if (cnt1 > mini) {
            ans.add(el1);
        }

        if (cnt2 > mini) {
            ans.add(el2);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 3, 3, 2, 2, 2 };
        System.out.println(majorityElements(a));
    }
}
