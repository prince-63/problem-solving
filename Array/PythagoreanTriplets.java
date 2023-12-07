public class Solution {
    public int solve(int A) {
        
        int count = 0;
        
        int arr[] = new int[A];
        
        for (int i = 0; i < A; i++) {
            arr[i] = i + 1;
        }
        
        for (int i = 0; i < A; i++) {
            for (int j = i + 1; j < A; j++) {
                for (int k = j + 1; k < A; k++) {
                    int con1 = arr[i] * arr[i];
                    int con2 = arr[j] * arr[j];
                    int con3 = arr[k] * arr[k];
                    
                    if(con1 + con2 == con3) {
                        count++;
                    }
                }
            }
        }
        
        
        return count;
    }
}
