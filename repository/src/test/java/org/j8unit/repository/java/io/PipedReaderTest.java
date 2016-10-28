package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.io.PipedReader;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PipedReaderTest
implements FactoryBasedJ8UnitTest<PipedReader>, org.j8unit.repository.java.io.PipedReaderTests<PipedReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.PipedReader]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PipedReader::new);
    }

    @Parameter(0)
    public Callable<PipedReader> sutFactory;

    @Override
    public Callable<PipedReader> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.PipedReader]

}
