package org.j8unit.repository.java.awt.dnd;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.dnd.InvalidDnDOperationException;
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
public class InvalidDnDOperationExceptionTest
implements FactoryBasedJ8UnitTest<InvalidDnDOperationException>,
org.j8unit.repository.java.awt.dnd.InvalidDnDOperationExceptionTests<InvalidDnDOperationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.InvalidDnDOperationException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidDnDOperationException::new);
    }

    @Parameter(0)
    public Callable<InvalidDnDOperationException> sutFactory;

    @Override
    public Callable<InvalidDnDOperationException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.InvalidDnDOperationException]

}
