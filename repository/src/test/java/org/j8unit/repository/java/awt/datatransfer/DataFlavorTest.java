package org.j8unit.repository.java.awt.datatransfer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.datatransfer.DataFlavor;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DataFlavor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.datatransfer.DataFlavorTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DataFlavorTest
implements DataFlavorTests<DataFlavor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.DataFlavor]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(new DataFlavor(), //
                                DataFlavor.stringFlavor, //
                                DataFlavor.javaFileListFlavor, //
                                DataFlavor.plainTextFlavor, //
                                DataFlavor.fragmentHtmlFlavor, //
                                DataFlavor.imageFlavor, //
                                DataFlavor.selectionHtmlFlavor, //
                                DataFlavor.allHtmlFlavor);
    }

    @Parameter(0)
    public DataFlavor sut;

    @Override
    public DataFlavor createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.datatransfer.DataFlavor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.datatransfer.DataFlavor]

}
