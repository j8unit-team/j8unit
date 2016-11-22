package org.j8unit.repository.org.xml.sax.helpers;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.junit.Assume.assumeTrue;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.xml.sax.helpers.ParserAdapter;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ParserAdapterTest
implements FactoryBasedJ8UnitTest<ParserAdapter>, ParserAdapterTests<ParserAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.helpers.ParserAdapter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ParserAdapter::new);
    }

    @Parameter(0)
    public Callable<ParserAdapter> sutFactory;

    @Override
    public Callable<ParserAdapter> getSUTFactory() {
        assumeTrue("Somebody needs to specify/setup the 'org.xml.sax.parser' property at first.", false);
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.helpers.ParserAdapter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.helpers.ParserAdapter]

}
