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
public class JPEGHuffmanTableTest
implements org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGHuffmanTableTests<javax.imageio.plugins.jpeg.JPEGHuffmanTable> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.imageio.plugins.jpeg.JPEGHuffmanTable.StdACLuminance, //
                                javax.imageio.plugins.jpeg.JPEGHuffmanTable.StdACChrominance, //
                                javax.imageio.plugins.jpeg.JPEGHuffmanTable.StdDCChrominance, //
                                javax.imageio.plugins.jpeg.JPEGHuffmanTable.StdDCLuminance);
    }

    @Parameter(0)
    public javax.imageio.plugins.jpeg.JPEGHuffmanTable sut;

    @Override
    public javax.imageio.plugins.jpeg.JPEGHuffmanTable createNewSUT() {
        return this.sut;
    }

}
