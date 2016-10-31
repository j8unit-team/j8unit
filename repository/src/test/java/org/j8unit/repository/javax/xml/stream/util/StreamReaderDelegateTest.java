package org.j8unit.repository.javax.xml.stream.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.stream.util.StreamReaderDelegate;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StreamReaderDelegateTest
implements FactoryBasedJ8UnitTest<StreamReaderDelegate>, org.j8unit.repository.javax.xml.stream.util.StreamReaderDelegateTests<StreamReaderDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.util.StreamReaderDelegate]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(StreamReaderDelegate::new);
    }

    @Parameter(0)
    public Callable<StreamReaderDelegate> sutFactory;

    @Override
    public Callable<StreamReaderDelegate> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.util.StreamReaderDelegate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.util.StreamReaderDelegate]

}
