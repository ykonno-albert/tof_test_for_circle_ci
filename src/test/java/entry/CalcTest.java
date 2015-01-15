package entry;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class CalcTest {
    @Test
    public void 乗算が期待通りの結果を返すこと() {
        // exercise
        int actual = Calc.multiply(5,4);

        // verify
        assertThat(actual, is(20));
    }

    @Test
    public void 乗算が期待通りの結果を返すこと2() {
        // exercise
        int actual = Calc.multiply(9,0);

        // verify
        assertThat(actual, is(0));
    }
}