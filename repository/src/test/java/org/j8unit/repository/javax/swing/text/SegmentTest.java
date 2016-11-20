package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.Segment;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SegmentTest
implements FactoryBasedJ8UnitTest<Segment>, SegmentTests<Segment> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Segment]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Segment::new);
    }

    @Parameter(0)
    public Callable<Segment> sutFactory;

    @Override
    public Callable<Segment> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Segment]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Segment]

}
