import org.junit.*;

import static org.junit.Assert.*;
public class BoarTest {
    Boar b;
    @Before
    public void setUp() throws Exception{
        b=new Boar();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("ger", b.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(10, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(1, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1, b.getPrice());
    }
}
