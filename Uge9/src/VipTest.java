import static org.junit.Assert.*;

public class VipTest {

    @org.junit.Test
    public void getKurser() {
    }

    @org.junit.Test
    public void setKurser() {
    }

    @org.junit.Test
    public void testToString() {
        Vip v = new Vip("Bob","DTU", new String[]{"Mat1", "Mat2"});
        assertEquals("Test","",v);
    }
}