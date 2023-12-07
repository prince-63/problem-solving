public class GetBit {
    public static void main(String[] args) {
        int n = 5;  // 101
        int pos = 3; // 3rd bit from right
        int bitMask = 1 << pos; // 1000

        // if bit is 0, then bitMask & n will be 0
        if ((bitMask & n) == 0) { 
            System.out.println("bit is zero.");
        } else {
            System.out.println("bit is one.");
        }
    }
}
