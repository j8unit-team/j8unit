package org.j8unit.repository.javax.naming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.LinkException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LinkExceptionTest
implements FactoryBasedJ8UnitTest<LinkException>, LinkExceptionTests<LinkException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.LinkException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(LinkException::new);
    }

    @Parameter(0)
    public Callable<LinkException> sutFactory;

    @Override
    public Callable<LinkException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.LinkException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.LinkException]

}
