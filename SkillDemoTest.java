import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplyTest() {
        assertEquals(12, SkillDemo.multiply(3, 4)); //fails
    }
}