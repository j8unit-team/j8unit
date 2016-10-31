package org.j8unit.repository.java.awt.image;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.image.ImageFilter;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ImageFilterTest
implements FactoryBasedJ8UnitTest<ImageFilter>, org.j8unit.repository.java.awt.image.ImageFilterTests<ImageFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ImageFilter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ImageFilter::new);
    }

    @Parameter(0)
    public Callable<ImageFilter> sutFactory;

    @Override
    public Callable<ImageFilter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.ImageFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.ImageFilter]

}
