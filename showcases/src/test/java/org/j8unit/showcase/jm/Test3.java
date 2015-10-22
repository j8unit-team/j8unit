package org.j8unit.showcase.jm;

import java.util.Arrays;
import java.util.function.Supplier;
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
public class Test3
implements ITest2 {

    @Parameters
    public static Iterable<Object[]> data() {
        final Supplier<Foobar> fac = Foobar::new;
        return Arrays.asList(new Object[][] { { fac } });
    }

    @Parameter(0)
    public Supplier<Foobar> factory;

    @Override
    public Foobar createNewSUT() {
        return this.factory.get();
    }

    @Test
    public void testFoobar3() {
        final Foobar sut = new Foobar();
        // ...
        Assert.assertTrue(true);
    }

}
