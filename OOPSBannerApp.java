/**
 * OOPS Banner App
 * UC6: Render OOPS banner using string array and static method
 * @author YourName
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void addBannerBorder() {
        String[] lines = {
            String.join("  ", " *** ", " *** ", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", " *** ", " *** ", "*    ", "**** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        addBannerBorder();
    }
}
