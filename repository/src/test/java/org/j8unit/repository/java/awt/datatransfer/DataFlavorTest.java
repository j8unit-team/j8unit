package org.j8unit.repository.java.awt.datatransfer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DataFlavorTest
implements org.j8unit.repository.java.awt.datatransfer.DataFlavorTests<java.awt.datatransfer.DataFlavor> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.awt.datatransfer.DataFlavor.stringFlavor, //
                                java.awt.datatransfer.DataFlavor.javaFileListFlavor, //
                                java.awt.datatransfer.DataFlavor.plainTextFlavor, //
                                java.awt.datatransfer.DataFlavor.fragmentHtmlFlavor, //
                                java.awt.datatransfer.DataFlavor.imageFlavor, //
                                java.awt.datatransfer.DataFlavor.selectionHtmlFlavor, //
                                java.awt.datatransfer.DataFlavor.allHtmlFlavor);
    }

    @Parameter(0)
    public java.awt.datatransfer.DataFlavor sut;

    @Override
    public java.awt.datatransfer.DataFlavor createNewSUT() {
        return this.sut;
    }

}
