import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void roll() {
        Dice d1 = new Dice();
        assertEquals(3.5,d1.roll(),2.5);
    }

    @Test
    public void rollMultiple() {
        for (int i = 0; i < 1000; i++) {
            roll();
        }
    }
}