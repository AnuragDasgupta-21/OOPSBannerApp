/**
 * OOPS Banner App - UC7: Store Character Pattern in a Class
 * This class demonstrates the use of a static inner class to encapsulate 
 * character patterns for a banner display.
 */
public class BannerAppUC7 {

    /**
     * Inner Static Class to encapsulate character data and its pattern.
     * Adheres to the principle of Encapsulation.
     */
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern.
         * @param character The char represented (e.g., 'O')
         * @param pattern The 5-line (or 7-line) ASCII pattern array
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for the character.
         * @return char value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for the pattern array.
         * @return String array of the pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to display the banner for a set of character maps.
     * Uses StringBuilder for efficient string concatenation.
     * @param bannerChars Array of CharacterPatternMap objects to display
     */
    public static void displayBanner(CharacterPatternMap[] bannerChars) {
        // Assuming all patterns have the same height (e.g., 5 lines)
        int patternHeight = bannerChars[0].getPattern().length;

        for (int i = 0; i < patternHeight; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (CharacterPatternMap charMap : bannerChars) {
                lineBuilder.append(charMap.getPattern()[i]).append("  ");
            }
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        // Define patterns
        String[] patternO = {
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        };
        String[] patternP = {
            " ***** ",
            " * * ",
            " ***** ",
            " * ",
            " * "
        };
        String[] patternS = {
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        };

        // Create instances of the inner class (Encapsulation and Arrays of Objects)
        CharacterPatternMap charO = new CharacterPatternMap('O', patternO);
        CharacterPatternMap charP = new CharacterPatternMap('P', patternP);
        CharacterPatternMap charS = new CharacterPatternMap('S', patternS);

        // Store mappings in an array to represent "OOPS"
        CharacterPatternMap[] oopsBanner = { charO, charO, charP, charS };

        // Display the banner
        displayBanner(oopsBanner);
    }
}