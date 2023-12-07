import java.util.HashSet;

/**
 * Class UniqueEmail
 * This class provides a method to count the number of unique email addresses.
 */
public class UniqueEmail {

    /**
     * Method numUniqueEmails
     * This method takes an array of email addresses and returns the number of
     * unique email addresses.
     * An email address is considered unique if it is different after all '.' are
     * removed from the local part and everything after '+' is ignored.
     *
     * @param emails - the array of email addresses
     * @return the number of unique email addresses
     */
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<String>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            set.add(local[0].replace(".", "") + "@" + parts[1]);
        }
        return set.size();
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates an array of email
     * addresses and uses the numUniqueEmails method to count the number of unique
     * email addresses.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };

        int ans = numUniqueEmails(emails);
        System.out.println(ans);
    }
}