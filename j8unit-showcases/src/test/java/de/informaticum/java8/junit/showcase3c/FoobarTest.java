package de.informaticum.java8.junit.showcase3c;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import de.informaticum.j8junit.runners.J8Parameterized;
import de.informaticum.j8junit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FoobarTest
extends FooTest
implements BarTest {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { "Hello" }, { "world!" } });
    }

    @Parameter(0)
    public String sut;

    @Test
    public void foobarTest() {
        System.out.println("Executing test foobarTest() of class FoobarTest.");
        Assert.assertNotNull(this.sut);
    }

}
