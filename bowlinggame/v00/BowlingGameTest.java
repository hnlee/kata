import static org.junit.Assert.*;
import org.junit.Test;

public class BowlingGameTest {

    @Test
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
    }

}
