package org.j8unit.repository.java.awt.datatransfer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.datatransfer.DataFlavor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DataFlavorTest
implements org.j8unit.repository.java.awt.datatransfer.DataFlavorTests<DataFlavor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.DataFlavor]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DataFlavor.stringFlavor, //
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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.DataFlavor]

}
