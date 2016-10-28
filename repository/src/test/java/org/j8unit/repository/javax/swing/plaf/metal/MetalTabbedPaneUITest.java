package org.j8unit.repository.javax.swing.plaf.metal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.metal.MetalTabbedPaneUI;
import javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MetalTabbedPaneUITest
implements FactoryBasedJ8UnitTest<MetalTabbedPaneUI>, org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUITests<MetalTabbedPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MetalTabbedPaneUI::new);
    }

    @Parameter(0)
    public Callable<MetalTabbedPaneUI> sutFactory;

    @Override
    public Callable<MetalTabbedPaneUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI]

    @RunWith(J8Unit4.class)
    public static class TabbedPaneLayoutTest
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUITests.TabbedPaneLayoutTests<TabbedPaneLayout> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout]

        @Override
        public TabbedPaneLayout createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout]

    }

}
