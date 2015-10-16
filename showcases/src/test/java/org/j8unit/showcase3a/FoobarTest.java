package org.j8unit.showcase3a;

import java.util.Arrays;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

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
