import com.diozero.ws281xj.LedDriverInterface;
import com.diozero.ws281xj.PixelAnimations;
import com.diozero.ws281xj.PixelColour;
import com.diozero.ws281xj.StripType;
import com.diozero.ws281xj.rpiws281x.WS281x;
import org.junit.jupiter.api.Test;

public class TestLeds {
    @Test
    public void test() {
        LedDriverInterface driver = new WS281x(800000, 10, 10, 100, 18, StripType.WS2811_RGB);

        for (int pixel = 0 ; pixel < driver.getNumPixels(); pixel++) {
            driver.setPixelColour(pixel, PixelColour.RED);
        }

        driver.render();
        PixelAnimations.delay(5 * 1000);
    }
}
