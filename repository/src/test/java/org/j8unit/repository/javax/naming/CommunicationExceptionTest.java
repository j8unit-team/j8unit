package org.j8unit.repository.javax.naming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.CommunicationException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CommunicationExceptionTest
implements FactoryBasedJ8UnitTest<CommunicationException>, org.j8unit.repository.javax.naming.CommunicationExceptionTests<CommunicationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.CommunicationException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CommunicationException::new);
    }

    @Parameter(0)
    public Callable<CommunicationException> sutFactory;

    @Override
    public Callable<CommunicationException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.CommunicationException]

}
