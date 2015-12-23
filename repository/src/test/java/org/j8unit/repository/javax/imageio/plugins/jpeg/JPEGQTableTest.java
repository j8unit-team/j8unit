package org.j8unit.repository.javax.imageio.plugins.jpeg;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JPEGQTableTest
implements org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGQTableTests<javax.imageio.plugins.jpeg.JPEGQTable> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.imageio.plugins.jpeg.JPEGQTable.K1Luminance, //
                                javax.imageio.plugins.jpeg.JPEGQTable.K2Chrominance, //
                                javax.imageio.plugins.jpeg.JPEGQTable.K1Div2Luminance, //
                                javax.imageio.plugins.jpeg.JPEGQTable.K2Div2Chrominance);
    }

    @Parameter(0)
    public javax.imageio.plugins.jpeg.JPEGQTable sut;

    @Override
    public javax.imageio.plugins.jpeg.JPEGQTable createNewSUT() {
        return this.sut;
    }

}
