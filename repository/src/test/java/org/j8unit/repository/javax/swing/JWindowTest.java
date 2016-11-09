package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JWindow;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JWindowTest
implements FactoryBasedJ8UnitTest<JWindow>, JWindowTests<JWindow> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JWindow]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JWindow::new);
    }

    @Parameter(0)
    public Callable<JWindow> sutFactory;

    @Override
    public Callable<JWindow> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JWindow]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JWindow]

}
