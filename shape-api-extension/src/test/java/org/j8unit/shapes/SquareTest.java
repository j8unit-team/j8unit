package org.j8unit.shapes;

import static java.util.Arrays.asList;
import java.util.function.Supplier;
import org.j8unit.runners.J8BlockJUnit4ClassRunner;
import org.j8unit.shapes.RectangleTest;
import org.j8unit.shapes.Square;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8BlockJUnit4ClassRunner.class)
public class SquareTest
extends FoobarTest
implements RectangleTest<Square> {

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
    public Supplier<Square> subjectUnderTestFactory() {
        return () -> new Square(3);
    }

    @Ignore
    @Test
    @Override
    public void testScalingAreaByScalingWidth() {
        RectangleTest.super.testScalingAreaByScalingWidth();
    }

    @Ignore
    @Test
    @Override
    public void testScalingAreaByScalingHeight() {
        RectangleTest.super.testScalingAreaByScalingHeight();
    }

    @Override
    public void testFoobar() {
    }

}
