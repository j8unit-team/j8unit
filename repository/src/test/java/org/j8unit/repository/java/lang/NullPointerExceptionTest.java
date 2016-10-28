package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
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
public class NullPointerExceptionTest
implements FactoryBasedJ8UnitTest<NullPointerException>, org.j8unit.repository.java.lang.NullPointerExceptionTests<NullPointerException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.NullPointerException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NullPointerException::new);
    }

    @Parameter(0)
    public Callable<NullPointerException> sutFactory;

    @Override
    public Callable<NullPointerException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.NullPointerException]

}
