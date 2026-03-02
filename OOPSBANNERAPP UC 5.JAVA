/**
 * OOPSBannerApp
 *
 * UC5: Combine array declaration and initialization
 * using String.join() in a single statement.
 *
 * Improves conciseness and readability
 * while maintaining modularity.
 *
 * @author YourName
 * @version 5.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize array in one statement
        String[] banner = {
                String.join(" ", "*****", "*****", "*****", "*****"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*****", "*****"),
                String.join(" ", "*   *", "*   *", "*",     "*  *"),
                String.join(" ", "*   *", "*   *", "*",     "*   *"),
                String.join(" ", "*****", "*****", "*",     "*    *")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}