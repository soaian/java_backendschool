import chap01.MaxValue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxValueTest {

    @Test
    void max(){
        int result= MaxValue.max(3,4,5);
        assertEquals(5,result);

    }
}
