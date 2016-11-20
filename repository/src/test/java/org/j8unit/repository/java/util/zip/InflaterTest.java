package org.j8unit.repository.java.util.zip;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.zip.Inflater;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InflaterTest
implements FactoryBasedJ8UnitTest<Inflater>, InflaterTests<Inflater> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.Inflater]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Inflater::new);
    }

    @Parameter(0)
    public Callable<Inflater> sutFactory;

    @Override
    public Callable<Inflater> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.Inflater]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.Inflater]

}
