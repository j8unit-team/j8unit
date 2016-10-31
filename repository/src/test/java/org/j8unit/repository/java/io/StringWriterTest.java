package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.io.StringWriter;
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
public class StringWriterTest
implements FactoryBasedJ8UnitTest<StringWriter>, org.j8unit.repository.java.io.StringWriterTests<StringWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.StringWriter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(StringWriter::new);
    }

    @Parameter(0)
    public Callable<StringWriter> sutFactory;

    @Override
    public Callable<StringWriter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.StringWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.StringWriter]

}
