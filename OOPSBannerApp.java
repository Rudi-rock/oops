/**
 * OOPS Banner App
 * UC5: Inline array initialization using String.join()
 * @author YourName
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] lines = {
            String.join("  ", " *** ", " *** ", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", " *** ", " *** ", "*    ", "**** ")
        };

        // Enhanced for loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
