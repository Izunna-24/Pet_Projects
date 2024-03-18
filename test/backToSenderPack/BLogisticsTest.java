package backToSenderPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BLogisticsTest {


    @Test
    public void blogistics_hasRidersTest() {
        BLogistics.hasRiders();
        assertTrue(BLogistics.hasRiders());
    }
    @Test
    public void paymentForDeliveryLessThan50(){
        BLogistics.hasRiders();
        assertEquals(6_440, BLogistics.dailyPayment(9));
    }

    @Test
    public void paymentForDeliveryGreaterThan50AndLessThan59Test(){
        BLogistics.hasRiders();
        int actual = BLogistics.dailyPayment(57);
        int expected = 16_400;
        assertEquals(expected, actual);
    }
    @Test
    public void paymentForDeliveryGreaterThan59LessThan69Test(){
        BLogistics.hasRiders();
        int actual = BLogistics.dailyPayment(69);
        int expected = 22_250;
        assertEquals(expected, actual);
    }

    @Test
    public void paymentForDeliveryGreaterThan69Test(){
        BLogistics.hasRiders();
        int actual = BLogistics.dailyPayment(89);
        int expected = 49_500;
        assertEquals(expected, actual);
    }

    @Test
    public void paymentForDeliveryLessThan0ThrowsExceptionTestTest(){
        assertThrows(IllegalArgumentException.class, ()-> BLogistics.dailyPayment(-1));
    }

    @Test
    public void paymentForDeliveryGreaterThan100ThrowsExceptionTestTest(){
        assertThrows(IllegalArgumentException.class, ()-> BLogistics.dailyPayment(105));
    }
}
