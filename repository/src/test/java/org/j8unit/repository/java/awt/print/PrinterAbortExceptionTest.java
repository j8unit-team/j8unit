package org.j8unit.repository.java.awt.print;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.print.PrinterAbortException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PrinterAbortExceptionTest
implements FactoryBasedJ8UnitTest<PrinterAbortException>, PrinterAbortExceptionTests<PrinterAbortException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.print.PrinterAbortException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PrinterAbortException::new);
    }

    @Parameter(0)
    public Callable<PrinterAbortException> sutFactory;

    @Override
    public Callable<PrinterAbortException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.print.PrinterAbortException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.print.PrinterAbortException]

}
