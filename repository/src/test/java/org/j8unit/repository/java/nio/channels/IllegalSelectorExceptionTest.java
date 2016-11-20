package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.IllegalSelectorException;
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
public class IllegalSelectorExceptionTest
implements FactoryBasedJ8UnitTest<IllegalSelectorException>, IllegalSelectorExceptionTests<IllegalSelectorException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.IllegalSelectorException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(IllegalSelectorException::new);
    }

    @Parameter(0)
    public Callable<IllegalSelectorException> sutFactory;

    @Override
    public Callable<IllegalSelectorException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.IllegalSelectorException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.IllegalSelectorException]

}
