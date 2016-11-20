package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.net.MalformedURLException;
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
public class MalformedURLExceptionTest
implements FactoryBasedJ8UnitTest<MalformedURLException>, MalformedURLExceptionTests<MalformedURLException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.MalformedURLException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MalformedURLException::new);
    }

    @Parameter(0)
    public Callable<MalformedURLException> sutFactory;

    @Override
    public Callable<MalformedURLException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.MalformedURLException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.MalformedURLException]

}
