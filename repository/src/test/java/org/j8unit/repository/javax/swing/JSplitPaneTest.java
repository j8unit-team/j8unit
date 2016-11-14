package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JSplitPane;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JSplitPaneTest
implements FactoryBasedJ8UnitTest<JSplitPane>, JSplitPaneTests<JSplitPane> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSplitPane]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JSplitPane::new);
    }

    @Parameter(0)
    public Callable<JSplitPane> sutFactory;

    @Override
    public Callable<JSplitPane> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JSplitPane]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JSplitPane]

}
