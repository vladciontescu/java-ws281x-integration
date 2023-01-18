import static com.github.mbelling.ws281x.LedStripType.WS2811_STRIP_RGB;

import com.github.mbelling.ws281x.Color;
import com.github.mbelling.ws281x.Ws281xLedStrip;

public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        Ws281xLedStrip ledStrip = new Ws281xLedStrip(16, 10, 800000, 10, 255, 0, false, WS2811_STRIP_RGB, true);
        ledStrip.setStrip(Color.RED);
        System.out.println("pemponzzi");
    }
}
