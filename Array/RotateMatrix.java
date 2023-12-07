public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();

        // transpose of matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i));
                a.get(j).set(i, temp);
            }
            Collections.reverse(a.get(i));
        }
    }
}
