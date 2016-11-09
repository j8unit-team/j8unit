package org.j8unit.repository.javax.activation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.activation.UnsupportedDataTypeException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UnsupportedDataTypeExceptionTest
implements FactoryBasedJ8UnitTest<UnsupportedDataTypeException>, UnsupportedDataTypeExceptionTests<UnsupportedDataTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.UnsupportedDataTypeException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UnsupportedDataTypeException::new);
    }

    @Parameter(0)
    public Callable<UnsupportedDataTypeException> sutFactory;

    @Override
    public Callable<UnsupportedDataTypeException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activation.UnsupportedDataTypeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activation.UnsupportedDataTypeException]

}
