import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final Time negTime = new Time(-1, -1, -1);
    private final Time posTime = new Time(25, 61, 61);
    private final Time norTime = new Time(10, 10, 10);
    private final Time speTime = new Time(24, 0, 0);

    @Test
    void testClassNegatives() {
        if (negTime.getHours() < 0 || negTime.getHours() > 24) {
            if (negTime.getHours() < 0) {
                assertEquals("The hours are smaller than the minimum", "The hours are smaller than the minimum");
            } else {
                assertEquals("The hours are grater than the maximum", "The hours are grater than the maximum");
            }
        } else if (negTime.getHours() < 24) {
            if (negTime.getMinutes() < 0 || negTime.getMinutes() > 59)
                assertEquals("The minutes are not valid!", "The minutes are not valid!");
            else {
                if (negTime.getSeconds() >= 0 && negTime.getSeconds() <= 59)
                    assertEquals(negTime.getHours() * 3600 + negTime.getMinutes() * 60 + negTime.getSeconds(), negTime.getHours() * 3600 + negTime.getMinutes() * 60 + negTime.getSeconds());
                else
                    assertEquals("The seconds are not valid", "The seconds are not valid");
            }
        } else if (negTime.getHours() == 24 && negTime.getMinutes() == 0 && negTime.getSeconds() == 0) {
            assertEquals(negTime.getHours() * 3600 + negTime.getMinutes() * 60 + negTime.getSeconds(), negTime.getHours() * 3600 + negTime.getMinutes() * 60 + negTime.getSeconds());
        } else {
            assertEquals("The time is greater than the maximum", "The time is greater than the maximum");
        }
    }

    @Test
    void testClassPositives() {
        if (posTime.getHours() < 0 || posTime.getHours() > 24) {
            if (posTime.getHours() < 0) {
                assertEquals("The hours are smaller than the minimum", "The hours are smaller than the minimum");
            } else {
                assertEquals("The hours are grater than the maximum", "The hours are grater than the maximum");
            }
        } else if (posTime.getHours() < 24) {
            if (posTime.getMinutes() < 0 || posTime.getMinutes() > 59)
                assertEquals("The minutes are not valid!", "The minutes are not valid!");
            else {
                if (posTime.getSeconds() >= 0 && posTime.getSeconds() <= 59)
                    assertEquals(posTime.getHours() * 3600 + posTime.getMinutes() * 60 + posTime.getSeconds(), posTime.getHours() * 3600 + negTime.getMinutes() * 60 + negTime.getSeconds());
                else
                    assertEquals("The seconds are not valid", "The seconds are not valid");
            }
        } else if (posTime.getHours() == 24 && posTime.getMinutes() == 0 && posTime.getSeconds() == 0) {
            assertEquals(posTime.getHours() * 3600 + posTime.getMinutes() * 60 + posTime.getSeconds(), negTime.getHours() * 3600 + negTime.getMinutes() * 60 + negTime.getSeconds());
        } else {
            assertEquals("The time is greater than the maximum", "The time is greater than the maximum");
        }
    }

    @Test
    void testClassNormal() {
        if (norTime.getHours() < 0 || norTime.getHours() > 24) {
            if (norTime.getHours() < 0) {
                assertEquals("The hours are smaller than the minimum", "The hours are smaller than the minimum");
            } else {
                assertEquals("The hours are grater than the maximum", "The hours are grater than the maximum");
            }
        } else if (norTime.getHours() < 24) {
            if (norTime.getMinutes() < 0 || norTime.getMinutes() > 59)
                assertEquals("The minutes are not valid!", "The minutes are not valid!");
            else {
                if (norTime.getSeconds() >= 0 && norTime.getSeconds() <= 59)
                    assertEquals(norTime.getHours() * 3600 + norTime.getMinutes() * 60 + norTime.getSeconds(), norTime.getHours() * 3600 + norTime.getMinutes() * 60 + norTime.getSeconds());
                else
                    assertEquals("The seconds are not valid", "The seconds are not valid");
            }
        } else if (norTime.getHours() == 24 && norTime.getMinutes() == 0 && norTime.getSeconds() == 0) {
            assertEquals(norTime.getHours() * 3600 + norTime.getMinutes() * 60 + norTime.getSeconds(), norTime.getHours() * 3600 + norTime.getMinutes() * 60 + norTime.getSeconds());
        } else {
            assertEquals("The time is greater than the maximum", "The time is greater than the maximum");
        }
    }

    @Test
    void testSpecials() {
        if (speTime.getHours() == 24 && speTime.getMinutes() == 0 && speTime.getSeconds() == 0) {
            assertEquals(speTime.getHours() * 3600 + speTime.getMinutes() * 60 + speTime.getSeconds(), speTime.getHours() * 3600 + speTime.getMinutes() * 60 + speTime.getSeconds());
        }

    }
}