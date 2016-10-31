package org.j8unit.repository.java.util.jar;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.jar.JarException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JarExceptionTest
implements FactoryBasedJ8UnitTest<JarException>, org.j8unit.repository.java.util.jar.JarExceptionTests<JarException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.JarException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JarException::new);
    }

    @Parameter(0)
    public Callable<JarException> sutFactory;

    @Override
    public Callable<JarException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.jar.JarException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.jar.JarException]

}
