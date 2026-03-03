/**
 * OOPS Banner App
 * UC7: Refactor banner using InnerClass
 * @author YourName
 * @version 7.0
 */
public class OOPSBannerApp {

    static class Renderer {
        void drawBanner() {
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
    }

    public static void main(String[] args) {
        Renderer renderer = new Renderer();
        renderer.drawBanner();
    }
}
