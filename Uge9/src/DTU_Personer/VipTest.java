package DTU_Personer;

import static org.junit.Assert.*;

public class VipTest {

    @org.junit.Test
    public void getKurser() {
        Vip v = new Vip("Pete","DTU", new String[]{"Pro1", "Mat2"});
        System.out.println(v);
        assertEquals(1,2);
    }

    @org.junit.Test
    public void setKurser() {
    }

    @org.junit.Test
    public void testToString() {
        Vip v = new Vip("Bob","DTU", new String[]{"Mat1", "Mat2"});
        assertEquals("Test",v.toString());
    }
}