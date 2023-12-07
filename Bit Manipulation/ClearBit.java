public class ClearBit {
    public static void main(String[] args) {
        int n = 5; // 101
        int pos = 2; // 3rd bit from right
        int bitMask = 1 << pos; // 100
        int notBitMask = ~(bitMask); // 011

        int newNumber = notBitMask & n; // 001
        System.out.println(newNumber); // 1
    }
}
