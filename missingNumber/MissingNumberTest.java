package missingNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberTest {
    @Test
    public void testFindMissingNumber() {
        int[] array = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        int missingNumber = MissingNumber.findMissingNumber(array);
        assertEquals(6, missingNumber);
    }

    @Test
    public void testToFindMissingNumber() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int missingNumber = MissingNumber.findMissingNumber(array);
        assertEquals(10, missingNumber);
    }

}
