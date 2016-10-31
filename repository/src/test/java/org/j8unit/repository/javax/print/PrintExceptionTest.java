package org.j8unit.repository.javax.print;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.print.PrintException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PrintExceptionTest
implements FactoryBasedJ8UnitTest<PrintException>, org.j8unit.repository.javax.print.PrintExceptionTests<PrintException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.PrintException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PrintException::new);
    }

    @Parameter(0)
    public Callable<PrintException> sutFactory;

    @Override
    public Callable<PrintException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.PrintException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.PrintException]

}
