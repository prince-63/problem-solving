import java.util.ArrayList;

class PascalTriangle {
    public static ArrayList<ArrayList<Integer>> pascaleTrianle(int A) {
        int row = A;
        int count = 1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> col = new ArrayList<Integer>();
            
            for (int j = 0; j <= i; j++) {
                
                if (j == 0 || i == 0) {
                    count = 1;
                    col.add(count);
                }
                else {
                    count = count * (i - j + 1) / j;
                    col.add(count);
                }
                
            }
            ans.add(col);
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 5;

        ArrayList<ArrayList<Integer>> trangle = pascaleTrianle(a);

        int row = trangle.size();

        for (int i = 0; i < row; i++) {
            int col = trangle.get(i).size();
            for (int j = 0; j < col; j++) {
                System.out.print(trangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
