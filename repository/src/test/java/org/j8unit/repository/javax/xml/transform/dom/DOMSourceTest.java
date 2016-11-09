package org.j8unit.repository.javax.xml.transform.dom;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.transform.dom.DOMSource;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DOMSourceTest
implements FactoryBasedJ8UnitTest<DOMSource>, DOMSourceTests<DOMSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.dom.DOMSource]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DOMSource::new);
    }

    @Parameter(0)
    public Callable<DOMSource> sutFactory;

    @Override
    public Callable<DOMSource> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.dom.DOMSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.dom.DOMSource]

}
