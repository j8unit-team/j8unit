package org.j8unit.repository.java.util.zip;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.zip.Adler32;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class Adler32Test
implements FactoryBasedJ8UnitTest<Adler32>, org.j8unit.repository.java.util.zip.Adler32Tests<Adler32> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.Adler32]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Adler32::new);
    }

    @Parameter(0)
    public Callable<Adler32> sutFactory;

    @Override
    public Callable<Adler32> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.Adler32]

}
