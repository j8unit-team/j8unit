package org.j8unit.repository.javax.print.attribute;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.print.attribute.UnmodifiableSetException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UnmodifiableSetExceptionTest
implements FactoryBasedJ8UnitTest<UnmodifiableSetException>, UnmodifiableSetExceptionTests<UnmodifiableSetException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.UnmodifiableSetException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(UnmodifiableSetException::new);
    }

    @Parameter(0)
    public Callable<UnmodifiableSetException> sutFactory;

    @Override
    public Callable<UnmodifiableSetException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.UnmodifiableSetException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.UnmodifiableSetException]

}
