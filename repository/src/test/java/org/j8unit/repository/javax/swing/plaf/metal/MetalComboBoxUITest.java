package org.j8unit.repository.javax.swing.plaf.metal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.metal.MetalComboBoxUI;
import javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager;
import javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup;
import javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener;
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
public class MetalComboBoxUITest
implements FactoryBasedJ8UnitTest<MetalComboBoxUI>, org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests<MetalComboBoxUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MetalComboBoxUI::new);
    }

    @Parameter(0)
    public Callable<MetalComboBoxUI> sutFactory;

    @Override
    public Callable<MetalComboBoxUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI]

    @RunWith(J8Unit4.class)
    public static class MetalComboPopupTest
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalComboPopupTests<MetalComboPopup> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalComboPopup]

        @Override
        public MetalComboPopup createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalComboPopup]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalComboPopup]

    }

    @RunWith(J8Unit4.class)
    public static class MetalPropertyChangeListenerTest
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalPropertyChangeListenerTests<MetalPropertyChangeListener> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalPropertyChangeListener]

        @Override
        public MetalPropertyChangeListener createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalPropertyChangeListener]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalPropertyChangeListener]

    }

    @RunWith(J8Unit4.class)
    public static class MetalComboBoxLayoutManagerTest
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalComboBoxLayoutManagerTests<MetalComboBoxLayoutManager> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager]

        @Override
        public MetalComboBoxLayoutManager createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager]

    }

}
