import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    public static void main(String[] args) {

        // Step 1: Create HashMap to store patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Add character patterns
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Step 3: Input word
        String word = "OOPS";

        // Step 4: Print banner using nested loops
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                } else {
                    System.out.print("???? ");
                }
            }
            System.out.println();
        }
    }
}