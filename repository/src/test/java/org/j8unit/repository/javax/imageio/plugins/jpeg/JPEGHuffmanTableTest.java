package org.j8unit.repository.javax.imageio.plugins.jpeg;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JPEGHuffmanTable} (by simply reusing
 * the J8Unit test interface {@link JPEGHuffmanTableTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JPEGHuffmanTableTest
implements JPEGHuffmanTableTests<JPEGHuffmanTable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGHuffmanTable]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JPEGHuffmanTable.StdACLuminance, //
                                JPEGHuffmanTable.StdACChrominance, //
                                JPEGHuffmanTable.StdDCChrominance, //
                                JPEGHuffmanTable.StdDCLuminance);
    }

    @Parameter(0)
    public JPEGHuffmanTable sut;

    @Override
    public JPEGHuffmanTable createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGHuffmanTable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGHuffmanTable]

}
