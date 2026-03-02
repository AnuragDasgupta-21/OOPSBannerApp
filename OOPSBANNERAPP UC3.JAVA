/**
 * OOPSBannerApp
 *
 * UC3: Print "OOPS" banner using String.join()
 * instead of string concatenation.
 *
 * This improves memory efficiency by avoiding
 * multiple intermediate String objects.
 *
 * @author YourName
 * @version 3.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {

        System.out.println(String.join(" ",
                "*****",   "*****",   "*****",   "*****"));

        System.out.println(String.join(" ",
                "*   *",   "*   *",   "*   *",   "*   *"));

        System.out.println(String.join(" ",
                "*   *",   "*   *",   "*   *",   "*   *"));

        System.out.println(String.join(" ",
                "*   *",   "*   *",   "*****",   "*****"));

        System.out.println(String.join(" ",
                "*   *",   "*   *",   "*",       "*  *"));

        System.out.println(String.join(" ",
                "*   *",   "*   *",   "*",       "*   *"));

        System.out.println(String.join(" ",
                "*****",   "*****",   "*",       "*    *"));
    }
}