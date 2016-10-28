package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.PrinterState;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class PrinterStateTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterStateTests<PrinterState> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PrinterState]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PrinterState.UNKNOWN, //
                                PrinterState.PROCESSING, //
                                PrinterState.IDLE, //
                                PrinterState.STOPPED);
    }

    @Parameter(0)
    public PrinterState sut;

    @Override
    public PrinterState createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PrinterState]

}
