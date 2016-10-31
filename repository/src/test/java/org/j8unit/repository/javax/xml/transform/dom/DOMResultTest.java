package org.j8unit.repository.javax.xml.transform.dom;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.transform.dom.DOMResult;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DOMResultTest
implements FactoryBasedJ8UnitTest<DOMResult>, org.j8unit.repository.javax.xml.transform.dom.DOMResultTests<DOMResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.dom.DOMResult]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DOMResult::new);
    }

    @Parameter(0)
    public Callable<DOMResult> sutFactory;

    @Override
    public Callable<DOMResult> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.dom.DOMResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.dom.DOMResult]

}
