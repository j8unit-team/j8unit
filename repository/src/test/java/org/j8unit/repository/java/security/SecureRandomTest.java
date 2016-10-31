package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.SecureRandom;
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
public class SecureRandomTest
implements FactoryBasedJ8UnitTest<SecureRandom>, org.j8unit.repository.java.security.SecureRandomTests<SecureRandom> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.SecureRandom]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SecureRandom::new);
    }

    @Parameter(0)
    public Callable<SecureRandom> sutFactory;

    @Override
    public Callable<SecureRandom> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.SecureRandom]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.SecureRandom]

}
