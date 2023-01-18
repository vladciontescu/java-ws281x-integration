import com.github.mbelling.ws281x.Color;
import com.github.mbelling.ws281x.Ws281xLedStrip;

public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        Ws281xLedStrip ledStrip = new Ws281xLedStrip();
        ledStrip.setStrip(Color.RED);
        System.out.println("pemponzzi");
    }
}
