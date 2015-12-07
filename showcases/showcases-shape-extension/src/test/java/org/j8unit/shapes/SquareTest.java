package org.j8unit.shapes;

import static java.util.Arrays.asList;
import java.util.function.Supplier;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SquareTest
implements RectangleTest<Square>, FactoryBasedJ8UnitTest<Square> {

    @Parameters(name = "{index}: {1}")
    public static Iterable<Object[]> data() {
        final Supplier<Square> fac1 = () -> new Square(3);
        return asList(new Object[][] { { fac1, "sq-3x3()" } });
    }

    @Parameter(0)
    public Supplier<Square> factory;

    @Parameter(1)
    public String title;

    @Override
    public Supplier<Square> getSUTFactory() {
        return this.factory;
    }

    @Test
    @Category(ShowcaseFailure.class)
    @Override
    public void testScalingAreaByScalingHeight() {
        RectangleTest.super.testScalingAreaByScalingHeight();
    }

    @Test
    @Category(ShowcaseFailure.class)
    @Override
    public void testScalingAreaByScalingWidth() {
        RectangleTest.super.testScalingAreaByScalingWidth();
    }

}
