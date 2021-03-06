package org.j8unit.repository.org.xml.sax.ext;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.xml.sax.ext.Attributes2Impl;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class Attributes2ImplTest
implements FactoryBasedJ8UnitTest<Attributes2Impl>, Attributes2ImplTests<Attributes2Impl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.Attributes2Impl]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Attributes2Impl::new);
    }

    @Parameter(0)
    public Callable<Attributes2Impl> sutFactory;

    @Override
    public Callable<Attributes2Impl> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ext.Attributes2Impl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ext.Attributes2Impl]

}
