package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JScrollBar;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JScrollBarTest
implements FactoryBasedJ8UnitTest<JScrollBar>, org.j8unit.repository.javax.swing.JScrollBarTests<JScrollBar> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JScrollBar]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JScrollBar::new);
    }

    @Parameter(0)
    public Callable<JScrollBar> sutFactory;

    @Override
    public Callable<JScrollBar> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JScrollBar]

}
