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
import org.xml.sax.ext.DefaultHandler2;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultHandler2Test
implements FactoryBasedJ8UnitTest<DefaultHandler2>, DefaultHandler2Tests<DefaultHandler2> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.DefaultHandler2]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DefaultHandler2::new);
    }

    @Parameter(0)
    public Callable<DefaultHandler2> sutFactory;

    @Override
    public Callable<DefaultHandler2> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ext.DefaultHandler2]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ext.DefaultHandler2]

}
