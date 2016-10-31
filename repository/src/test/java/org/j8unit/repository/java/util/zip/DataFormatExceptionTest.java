package org.j8unit.repository.java.util.zip;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.zip.DataFormatException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DataFormatExceptionTest
implements FactoryBasedJ8UnitTest<DataFormatException>, org.j8unit.repository.java.util.zip.DataFormatExceptionTests<DataFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.DataFormatException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DataFormatException::new);
    }

    @Parameter(0)
    public Callable<DataFormatException> sutFactory;

    @Override
    public Callable<DataFormatException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.DataFormatException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.DataFormatException]

}
