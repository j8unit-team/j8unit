package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JToggleButton;
import javax.swing.JToggleButton.ToggleButtonModel;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JToggleButtonTest
implements FactoryBasedJ8UnitTest<JToggleButton>, org.j8unit.repository.javax.swing.JToggleButtonTests<JToggleButton> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JToggleButton]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JToggleButton::new);
    }

    @Parameter(0)
    public Callable<JToggleButton> sutFactory;

    @Override
    public Callable<JToggleButton> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JToggleButton]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ToggleButtonModelTest
    implements FactoryBasedJ8UnitTest<ToggleButtonModel>, org.j8unit.repository.javax.swing.JToggleButtonTests.ToggleButtonModelTests<ToggleButtonModel> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JToggleButton$ToggleButtonModel]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(ToggleButtonModel::new);
        }

        @Parameter(0)
        public Callable<ToggleButtonModel> sutFactory;

        @Override
        public Callable<ToggleButtonModel> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JToggleButton$ToggleButtonModel]

    }

}
