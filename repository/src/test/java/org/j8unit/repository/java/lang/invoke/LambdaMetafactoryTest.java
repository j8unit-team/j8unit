package org.j8unit.repository.java.lang.invoke;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.lang.invoke.LambdaMetafactory;
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
public class LambdaMetafactoryTest
implements FactoryBasedJ8UnitTest<LambdaMetafactory>, org.j8unit.repository.java.lang.invoke.LambdaMetafactoryTests<LambdaMetafactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.LambdaMetafactory]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LambdaMetafactory::new);
    }

    @Parameter(0)
    public Callable<LambdaMetafactory> sutFactory;

    @Override
    public Callable<LambdaMetafactory> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.LambdaMetafactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.LambdaMetafactory]

}
