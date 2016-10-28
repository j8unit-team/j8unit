package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.CellRendererPane;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CellRendererPaneTest
implements FactoryBasedJ8UnitTest<CellRendererPane>, org.j8unit.repository.javax.swing.CellRendererPaneTests<CellRendererPane> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.CellRendererPane]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CellRendererPane::new);
    }

    @Parameter(0)
    public Callable<CellRendererPane> sutFactory;

    @Override
    public Callable<CellRendererPane> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.CellRendererPane]

}
