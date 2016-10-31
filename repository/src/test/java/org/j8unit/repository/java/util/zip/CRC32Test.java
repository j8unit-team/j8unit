package org.j8unit.repository.java.util.zip;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.zip.CRC32;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CRC32Test
implements FactoryBasedJ8UnitTest<CRC32>, org.j8unit.repository.java.util.zip.CRC32Tests<CRC32> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.CRC32]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CRC32::new);
    }

    @Parameter(0)
    public Callable<CRC32> sutFactory;

    @Override
    public Callable<CRC32> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.CRC32]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.CRC32]

}
