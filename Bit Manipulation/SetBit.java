public class SetBit {
    public static void main(String[] args) {
        int n = 5; // 101
        int pos = 1; // 2nd bit from right
        int bitMask = 1 << pos; // 010

        // set bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
