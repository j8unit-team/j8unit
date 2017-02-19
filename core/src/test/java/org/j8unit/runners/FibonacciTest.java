package org.j8unit.runners;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FibonacciTest
implements FibonacciTests {

    @Parameters(name = "{index}: fib[{0}]={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
    }

    private final int fInput;

    private final int fExpected;

    /**
     * This test class is not parameter-less!
     *
     * @see BlockJUnit4ClassRunner#validateConstructor()
     * @see BlockJUnit4ClassRunner#validateZeroArgConstructor()
     * @see BlockJUnit4ClassRunnerWithParameters#validateConstructor()
     */
    public FibonacciTest(final int input, final int expected) {
        this.fInput = input;
        this.fExpected = expected;
    }

    @Test
    public void test() {
        assertEquals(this.fExpected, this.fib(this.fInput));
    }

    private static int counter = 0;

    @After
    public void counterInc() {
        counter++;
    }

    @AfterClass
    public static void assertCounter() {
        assertEquals(7 * 2, counter);
    }

}
