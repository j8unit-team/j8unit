package org.j8unit.repository.org.omg.DynamicAny;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.DynamicAny.NameValuePair;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NameValuePairTest
implements FactoryBasedJ8UnitTest<NameValuePair>, NameValuePairTests<NameValuePair> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.NameValuePair]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NameValuePair::new);
    }

    @Parameter(0)
    public Callable<NameValuePair> sutFactory;

    @Override
    public Callable<NameValuePair> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.NameValuePair]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.NameValuePair]

}
