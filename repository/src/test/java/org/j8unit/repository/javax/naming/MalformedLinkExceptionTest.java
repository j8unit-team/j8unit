package org.j8unit.repository.javax.naming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.MalformedLinkException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MalformedLinkExceptionTest
implements FactoryBasedJ8UnitTest<MalformedLinkException>, org.j8unit.repository.javax.naming.MalformedLinkExceptionTests<MalformedLinkException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.MalformedLinkException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MalformedLinkException::new);
    }

    @Parameter(0)
    public Callable<MalformedLinkException> sutFactory;

    @Override
    public Callable<MalformedLinkException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.MalformedLinkException]

}
