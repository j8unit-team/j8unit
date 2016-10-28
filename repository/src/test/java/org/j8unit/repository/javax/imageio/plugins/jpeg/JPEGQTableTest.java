package org.j8unit.repository.javax.imageio.plugins.jpeg;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.imageio.plugins.jpeg.JPEGQTable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class JPEGQTableTest
implements org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGQTableTests<JPEGQTable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGQTable]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JPEGQTable.K1Luminance, //
                                JPEGQTable.K2Chrominance, //
                                JPEGQTable.K1Div2Luminance, //
                                JPEGQTable.K2Div2Chrominance);
    }

    @Parameter(0)
    public JPEGQTable sut;

    @Override
    public JPEGQTable createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGQTable]

}
