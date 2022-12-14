import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class JuintExample {

    @BeforeEach
    public void firstInit() {
        System.out.println("@BeforeEach - Will be executed before each method in the current class");
    }

    @AfterEach
    public void lastInit() {
        System.out.println("@AfterEach - Will be executed after each method in the current class");
    }

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforeAll - Will be executed once before all methods in this class");
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("@AfterAll - Will be executed once after all in this class");
    }

    @DisplayName("Allways will pass")
    @Test
    public void passTest() {
        System.out.println("Passed");
    }

    @Test
    public void failTest() {
        System.out.println("Failed");
    }

}
