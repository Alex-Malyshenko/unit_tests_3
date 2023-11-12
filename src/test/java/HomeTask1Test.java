import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeTask1Test {

    @Test
    void checkEvenNumber() {
        assertTrue(HomeTask1.evenOddNumber(4));
    }

    @Test
    void checkOddNumber() {
        assertFalse(HomeTask1.evenOddNumber(3));
    }

    @Test
    void checkNumberInInterval() {
        assertTrue(HomeTask1.numberInInterval(25));
        assertTrue(HomeTask1.numberInInterval(100));
    }

    @Test
    void checkNumberNotInInterval() {
        assertFalse(HomeTask1.numberInInterval(24));
        assertFalse(HomeTask1.numberInInterval(101));
    }

}