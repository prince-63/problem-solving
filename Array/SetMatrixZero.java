import java.util.ArrayList;

/**
 * SetMatrixZero
 */
public class SetMatrixZero {

    public static void setMatrixZero(ArrayList<ArrayList<Integer>> a) {
        int row = a.size();
        int col = a.get(0).size();

        boolean[] rows = new boolean[row];
        boolean[] column = new boolean[col];

        // idetifiying row and colunm contains zeros
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a.get(i).get(j) == 0) {
                    rows[i] = true;
                    column[j] = true;
                }
            }
        }

        // set entire row to zero
        for (int i = 0; i < row; i++) {
            if (rows[i]) {
                for (int j = 0; j < col; j++) {
                    a.get(i).set(j, 0);
                }
            }
        }

        // set entire col to zero
        for (int i = 0; i < col; i++) {
            if (column[i]) {
                for (int j = 0; j < row; j++) {
                    a.get(j).set(i, 0);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<>();        
        ArrayList<Integer> a2 = new ArrayList<>();       
        ArrayList<Integer> a3 = new ArrayList<>();

        a1.add(1);
        a1.add(1);
        a1.add(0);
        a1.add(1);
        arr.add(a1);
        a2.add(1);
        a2.add(1);
        a2.add(1);
        a2.add(1);
        arr.add(a2);
        a3.add(1);
        a3.add(1);
        a3.add(1);
        a3.add(1);
        arr.add(a3);

        int row = arr.size();
        int col = arr.get(0).size();

        // before set matrix zero
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        setMatrixZero(arr);

        // after set matrix zero 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}