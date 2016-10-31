package org.j8unit.repository.javax.xml.transform.stream;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.transform.stream.StreamResult;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StreamResultTest
implements FactoryBasedJ8UnitTest<StreamResult>, org.j8unit.repository.javax.xml.transform.stream.StreamResultTests<StreamResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.stream.StreamResult]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(StreamResult::new);
    }

    @Parameter(0)
    public Callable<StreamResult> sutFactory;

    @Override
    public Callable<StreamResult> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.stream.StreamResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.stream.StreamResult]

}
