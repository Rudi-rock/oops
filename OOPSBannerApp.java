/**
 * OOPS Banner App
 * UC8: Use Map for character patterns and render via function
 * @author YourName
 * @version 8.0
 */
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static class Renderer {
        Map<Integer, String> banner = new HashMap<>();

        private Renderer() {
            banner.put(0, String.join("  ", " *** ", " *** ", "**** ", " ****"));
            banner.put(1, String.join("  ", "*   *", "*   *", "*   *", "*    "));
            banner.put(2, String.join("  ", "*   *", "*   *", "*   *", "*    "));
            banner.put(3, String.join("  ", "*   *", "*   *", "**** ", " ****"));
            banner.put(4, String.join("  ", "*   *", "*   *", "*    ", "    *"));
            banner.put(5, String.join("  ", "*   *", "*   *", "*    ", "    *"));
            banner.put(6, String.join("  ", " *** ", " *** ", "*    ", "**** "));
        }

        void drawBanner() {
            for (Integer i : banner.keySet()) {
                System.out.println(banner.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Renderer renderer = new Renderer();
        renderer.drawBanner();
    }
}
