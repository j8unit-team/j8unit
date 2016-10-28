package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.PrintQuality;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class PrintQualityTest
implements org.j8unit.repository.javax.print.attribute.standard.PrintQualityTests<PrintQuality> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PrintQuality]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PrintQuality.NORMAL, //
                                PrintQuality.DRAFT, //
                                PrintQuality.HIGH);
    }

    @Parameter(0)
    public PrintQuality sut;

    @Override
    public PrintQuality createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PrintQuality]

}
