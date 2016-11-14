package org.j8unit.repository.javax.management.modelmbean;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidTargetObjectTypeExceptionTest
implements FactoryBasedJ8UnitTest<InvalidTargetObjectTypeException>, InvalidTargetObjectTypeExceptionTests<InvalidTargetObjectTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.InvalidTargetObjectTypeException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidTargetObjectTypeException::new);
    }

    @Parameter(0)
    public Callable<InvalidTargetObjectTypeException> sutFactory;

    @Override
    public Callable<InvalidTargetObjectTypeException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.modelmbean.InvalidTargetObjectTypeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.modelmbean.InvalidTargetObjectTypeException]

}
