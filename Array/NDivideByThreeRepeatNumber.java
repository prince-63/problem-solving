import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class NDivideByThreeRepeatNumber {
    public static int repeatedNumber(final List<Integer> a) {
        // int len = a.size();
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < len; i++) {
        // if (map.containsKey(a.get(i))) {
        // map.put(a.get(i), map.get(a.get(i)) + 1);
        // }
        // else {
        // map.put(a.get(i), 1);
        // }
        // }

        // int check = len / 3;
        // for (int i = 0; i < len; i++) {
        // if (map.get(a.get(i)) > check) {
        // return a.get(i);
        // }
        // }

        // return -1;
        int len = a.size();
        int count = 0;
        int element = 0;

        for (int i = 0; i < len; i++) {
            if (count == 0) {
                element = a.get(i);
                count = 1;
            } else if (element == a.get(i)) {
                count++;
            } else {
                count--;
            }
        }

        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (a.get(i) == element) {
                cnt++;
            }
        }

        if (cnt > len / 3) {
            return element;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(5);
        A.add(7);

        A.contains(1);

        System.out.println(repeatedNumber(A));
    }
}
