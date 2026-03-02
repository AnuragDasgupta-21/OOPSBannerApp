/**
 * OOPSBannerApp
 *
 * UC4: Store banner lines in a String array
 * and print them using a loop.
 *
 * Improves modularity and reusability.
 *
 * @author YourName
 * @version 4.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Store banner lines in an array
        String[] banner = {
                String.join(" ", "*****", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*****", "*****"),
                String.join(" ", "*   *", "*   *", "*",     "*  *"),
                String.join(" ", "*   *", "*   *", "*",     "*   *"),
                String.join(" ", "*****", "*****", "*",     "*    *")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}