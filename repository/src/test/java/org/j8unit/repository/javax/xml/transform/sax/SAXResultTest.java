package org.j8unit.repository.javax.xml.transform.sax;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.transform.sax.SAXResult;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SAXResultTest
implements FactoryBasedJ8UnitTest<SAXResult>, SAXResultTests<SAXResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.sax.SAXResult]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SAXResult::new);
    }

    @Parameter(0)
    public Callable<SAXResult> sutFactory;

    @Override
    public Callable<SAXResult> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.sax.SAXResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.sax.SAXResult]

}
