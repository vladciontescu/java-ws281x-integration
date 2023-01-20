import com.diozero.ws281xj.LedDriverInterface;
import com.diozero.ws281xj.PixelAnimations;
import com.diozero.ws281xj.PixelColour;
import com.diozero.ws281xj.rpiws281x.WS281x;
import com.github.mbelling.ws281x.Color;
import com.github.mbelling.ws281x.LedStrip;
import com.github.mbelling.ws281x.LedStripType;
import com.github.mbelling.ws281x.Ws281xLedStrip;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestLeds {
    private final LedStrip strip = new Ws281xLedStrip(18, 18, 800000, 10, 100, 0, false, LedStripType.WS2811_STRIP_GRB, false);
    private final LedDriverInterface driver = new WS281x(18, 100, 18);

    @Test
    @Order(1)
    public void test_turn_on() {
        System.out.println("RED");
        colorLed(Color.RED);
        System.out.println("GREEN");
        colorLed(Color.GREEN);
        System.out.println("BLUE");
        colorLed(Color.BLUE);
        strip.render();
    }

    @Test
    @Order(2)
    public void test_cycle_colors() {
        colorLed(Color.WHITE);
        colorLed(Color.LIGHT_GRAY);
        colorLed(Color.GRAY);
        colorLed(Color.GRAY);
        colorLed(Color.RED);
        colorLed(Color.PINK);
        colorLed(Color.ORANGE);
        colorLed(Color.YELLOW);
        colorLed(Color.GREEN);
        colorLed(Color.MAGENTA);
        colorLed(Color.CYAN);
        colorLed(Color.BLUE);
    }

    @Test
    @Order(3)
    public void test_turn_off() {
        System.out.println("OFF");
        strip.setStrip(Color.BLACK);
        strip.render();
        waiting();
    }

    /*@Test
    public void test_diozero() {
        System.out.println("RED");
        colorLed(PixelColour.RED);
        System.out.println("GREEN");
        colorLed(PixelColour.GREEN);
        System.out.println("BLUE");
        colorLed(PixelColour.BLUE);
        System.out.println("OFF");
        driver.allOff();
    }*/

    private void colorLed(int color) {
        for (int pixel=0; pixel<driver.getNumPixels(); pixel++) {
            driver.setPixelColour(pixel, color);
        }
        driver.render();
        PixelAnimations.delay(2 * 1000);
    }

    private void colorLed(Color color) {
        strip.setStrip(color);
        strip.render();
        waiting();
    }

    private void waiting() {
        try {
            Thread.sleep(2 * 1000);
        } catch (Exception ignored) {

        }
    }
}
