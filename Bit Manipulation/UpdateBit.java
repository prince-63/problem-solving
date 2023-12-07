public class UpdateBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 3; // 3rd bit from right
        int bitMask = 1 << pos; // 1000
        int operation = 1; // 1 for set, 0 for clear

        if (operation == 1) {
            // set bit
            int newNumber = bitMask | n; // 1101
            System.out.println(newNumber); // 13
        } else {
            // clear bit
            int notBitMask = ~(bitMask); // 0111
            int newNumber = notBitMask & n; // 0101
            System.out.println(newNumber); // 5
        }
    }
}
