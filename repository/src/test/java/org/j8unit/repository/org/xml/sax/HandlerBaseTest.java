package org.j8unit.repository.org.xml.sax;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.xml.sax.HandlerBase;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class HandlerBaseTest
implements FactoryBasedJ8UnitTest<HandlerBase>, org.j8unit.repository.org.xml.sax.HandlerBaseTests<HandlerBase> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.HandlerBase]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(HandlerBase::new);
    }

    @Parameter(0)
    public Callable<HandlerBase> sutFactory;

    @Override
    public Callable<HandlerBase> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.HandlerBase]

}
