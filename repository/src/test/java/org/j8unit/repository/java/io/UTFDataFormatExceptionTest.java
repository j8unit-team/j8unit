package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.io.UTFDataFormatException;
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
public class UTFDataFormatExceptionTest
implements FactoryBasedJ8UnitTest<UTFDataFormatException>, org.j8unit.repository.java.io.UTFDataFormatExceptionTests<UTFDataFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.UTFDataFormatException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UTFDataFormatException::new);
    }

    @Parameter(0)
    public Callable<UTFDataFormatException> sutFactory;

    @Override
    public Callable<UTFDataFormatException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.UTFDataFormatException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.UTFDataFormatException]

}
