package org.j8unit.repository.java.lang.instrument;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.lang.instrument.UnmodifiableClassException;
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
public class UnmodifiableClassExceptionTest
implements FactoryBasedJ8UnitTest<UnmodifiableClassException>,
org.j8unit.repository.java.lang.instrument.UnmodifiableClassExceptionTests<UnmodifiableClassException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.instrument.UnmodifiableClassException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UnmodifiableClassException::new);
    }

    @Parameter(0)
    public Callable<UnmodifiableClassException> sutFactory;

    @Override
    public Callable<UnmodifiableClassException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.instrument.UnmodifiableClassException]

}
