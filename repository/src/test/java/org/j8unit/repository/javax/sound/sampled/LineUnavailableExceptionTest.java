package org.j8unit.repository.javax.sound.sampled;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.sound.sampled.LineUnavailableException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LineUnavailableExceptionTest
implements FactoryBasedJ8UnitTest<LineUnavailableException>, org.j8unit.repository.javax.sound.sampled.LineUnavailableExceptionTests<LineUnavailableException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.LineUnavailableException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LineUnavailableException::new);
    }

    @Parameter(0)
    public Callable<LineUnavailableException> sutFactory;

    @Override
    public Callable<LineUnavailableException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.LineUnavailableException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.LineUnavailableException]

}
