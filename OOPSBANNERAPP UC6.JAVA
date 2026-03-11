/**
 * OOPS Banner APP - UC6
 * Focus: Modular Programming using Static Helper Methods.
 * Goal: Eliminate hardcoded patterns in the main array by using 
 * methods to return character string arrays.
 */
public class BannerAppUC6 {

    public static void main(String[] args) {
        // Step 1: Build the banner array by invoking static methods
        // This makes the array declaration much cleaner and modular.
        String[][] banner = {
            getCharO(),
            getCharO(),
            getCharP(),
            getCharS()
        };

        // Step 2: Render the banner
        // Loop through the 5 lines of the ASCII height
        for (int i = 0; i < 5; i++) {
            for (String[] letter : banner) {
                System.out.print(letter[i] + "  "); // Added spacing between letters
            }
            System.out.println();
        }
    }

    // --- Static Helper Methods to return ASCII patterns ---

    public static String[] getCharO() {
        return new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        };
    }

    public static String[] getCharP() {
        return new String[]{
            " ***** ",
            " * *",
            " ***** ",
            " * ",
            " * "
        };
    }

    public static String[] getCharS() {
        return new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        };
    }
}