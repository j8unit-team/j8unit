package org.j8unit.repository.java.beans;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.beans.Encoder;
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
public class EncoderTest
implements FactoryBasedJ8UnitTest<Encoder>, org.j8unit.repository.java.beans.EncoderTests<Encoder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Encoder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Encoder::new);
    }

    @Parameter(0)
    public Callable<Encoder> sutFactory;

    @Override
    public Callable<Encoder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.Encoder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.Encoder]

}
