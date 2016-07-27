import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class BowlingGameTest {
    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    } 

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare() throws Exception {
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertEquals(10 + 3 + 3, g.score());
    }
 
}
