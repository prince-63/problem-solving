import java.util.List;
import java.util.ArrayList;

/**
 * Class CountItemsMatchingARules
 * This class provides a method to count the number of items in a list that
 * match a given rule.
 */
public class CountItemsMatchingARules {

    /**
     * Method countMatches
     * This method takes a list of items, a rule key, and a rule value as input, and
     * counts the number of items that match the rule.
     * Each item is a list of strings, where the first string is the type, the
     * second string is the color, and the third string is the name.
     * The rule key can be "type", "color", or "name", and the rule value is a
     * string.
     *
     * @param items     - a list of items
     * @param ruleKey   - the rule key
     * @param ruleValue - the rule value
     * @return the number of items that match the rule
     */
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;

        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a list of items
     * and a rule, and counts the number of items that match the rule using the
     * countMatches method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> item1 = List.of("phone", "blue", "pixel");
        List<String> item2 = List.of("computer", "silver", "lenovo");
        List<String> item3 = List.of("phone", "gold", "iphone");
        items.add(item1);
        items.add(item2);
        items.add(item3);

        System.out.println(countMatches(items, "color", "silver")); // Output: 1
    }
}