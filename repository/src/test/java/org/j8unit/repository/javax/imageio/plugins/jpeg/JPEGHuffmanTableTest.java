package org.j8unit.repository.javax.imageio.plugins.jpeg;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class JPEGHuffmanTableTest
implements org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGHuffmanTableTests<JPEGHuffmanTable> {

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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGHuffmanTable]

}
