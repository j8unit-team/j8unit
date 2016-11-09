package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.SizeSequence;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SizeSequenceTest
implements FactoryBasedJ8UnitTest<SizeSequence>, SizeSequenceTests<SizeSequence> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SizeSequence]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SizeSequence::new);
    }

    @Parameter(0)
    public Callable<SizeSequence> sutFactory;

    @Override
    public Callable<SizeSequence> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.SizeSequence]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.SizeSequence]

}
