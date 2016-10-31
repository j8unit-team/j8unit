package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JPanel;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JPanelTest
implements FactoryBasedJ8UnitTest<JPanel>, org.j8unit.repository.javax.swing.JPanelTests<JPanel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JPanel]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JPanel::new);
    }

    @Parameter(0)
    public Callable<JPanel> sutFactory;

    @Override
    public Callable<JPanel> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JPanel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JPanel]

}
