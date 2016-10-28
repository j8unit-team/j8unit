package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JCheckBoxMenuItem;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JCheckBoxMenuItemTest
implements FactoryBasedJ8UnitTest<JCheckBoxMenuItem>, org.j8unit.repository.javax.swing.JCheckBoxMenuItemTests<JCheckBoxMenuItem> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JCheckBoxMenuItem]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JCheckBoxMenuItem::new);
    }

    @Parameter(0)
    public Callable<JCheckBoxMenuItem> sutFactory;

    @Override
    public Callable<JCheckBoxMenuItem> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JCheckBoxMenuItem]

}
