import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Keyword {
    private static final Set<String> keywords = new HashSet<>();

    static {
        String[] keywordArray = {
            "break", "case", "continue", "default", "defer", "else",
            "for", "func", "goto", "if", "map", "range", "return",
            "struct", "type", "var"
        };
        keywords.addAll(Arrays.asList(keywordArray));
    }

    public static String isKeyword(String word) {
        // Check if the word is in the set of keywords
        if (keywords.contains(word)) {
            return word + " is a keyword";
        } else {
            return word + " is not a keyword";
        }
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"defer", "While", "apurva","map"};

        for (String test : testCases) {
            System.out.println(isKeyword(test));
        }
    }
}
