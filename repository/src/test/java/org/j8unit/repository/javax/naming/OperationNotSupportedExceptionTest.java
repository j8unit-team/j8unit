package org.j8unit.repository.javax.naming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.OperationNotSupportedException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class OperationNotSupportedExceptionTest
implements FactoryBasedJ8UnitTest<OperationNotSupportedException>, OperationNotSupportedExceptionTests<OperationNotSupportedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.OperationNotSupportedException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(OperationNotSupportedException::new);
    }

    @Parameter(0)
    public Callable<OperationNotSupportedException> sutFactory;

    @Override
    public Callable<OperationNotSupportedException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.OperationNotSupportedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.OperationNotSupportedException]

}
