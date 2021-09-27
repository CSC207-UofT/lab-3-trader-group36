/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class LambTest {
    Lamb l;

    @Before
    public void setUp() throws Exception {
        l = new Lamb();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Ca!", l.sound());
    }

    @Test(timeout = 50)

    public void TestGetMaxSpeed() {
        assertEquals(1, l.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        l.upgradeSpeed();
        assertEquals(2, l.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        l.downgradeSpeed();
        assertEquals(0, l.getMaxSpeed());
    }
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(250, l.getPrice());
    }

}