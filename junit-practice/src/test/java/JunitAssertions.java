import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class JunitAssertions {

    static final int A = 2;
    static final int B = 1;
    static final String NULL_STRING = null;
    static final String NOT_NULL_STRING = "Hello";

    @Test
    public void assertABiggerThenB(){
        assertTrue( A > B);
    }

    @Test
    public void assertBIsNotBiggerThenA(){
        assertFalse( B > A);
    }

    @Test
    public void assertNullValueExample(){
        assertNull(NULL_STRING);
    }

    @Test
    public void assertNotNullValueExample(){
        assertNotNull(NOT_NULL_STRING);
    }

    @Test
    public void assertAllExample(){
        int[] firstArray = {1,2,3};
        int[] secondArray = firstArray;

        assertAll(
                () -> assertEquals(A, A, "This two elements are not equal"),
//                () -> assertEquals(A, B, "This two elements are not equal"),
                () -> assertArrayEquals(firstArray, secondArray)
        );
    }
}
