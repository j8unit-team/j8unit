package org.j8unit.repository.java.util.concurrent.atomic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AtomicBooleanTest
implements FactoryBasedJ8UnitTest<AtomicBoolean>, AtomicBooleanTests<AtomicBoolean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicBoolean]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AtomicBoolean::new);
    }

    @Parameter(0)
    public Callable<AtomicBoolean> sutFactory;

    @Override
    public Callable<AtomicBoolean> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.atomic.AtomicBoolean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.atomic.AtomicBoolean]

}
