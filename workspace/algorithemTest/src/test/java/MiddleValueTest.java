import static org.junit.jupiter.api.Assertions.*;

import chap01.MiddleValue;
import org.junit.jupiter.api.Test;

public class MiddleValueTest {

    @Test
    void middle(){
        int result = MiddleValue.middle(3,4,5);
        assertEquals(4,result);
    }
}
