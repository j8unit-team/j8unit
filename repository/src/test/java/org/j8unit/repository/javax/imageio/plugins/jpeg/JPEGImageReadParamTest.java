package org.j8unit.repository.javax.imageio.plugins.jpeg;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JPEGImageReadParamTest
implements FactoryBasedJ8UnitTest<JPEGImageReadParam>, org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGImageReadParamTests<JPEGImageReadParam> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGImageReadParam]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JPEGImageReadParam::new);
    }

    @Parameter(0)
    public Callable<JPEGImageReadParam> sutFactory;

    @Override
    public Callable<JPEGImageReadParam> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGImageReadParam]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGImageReadParam]

}
