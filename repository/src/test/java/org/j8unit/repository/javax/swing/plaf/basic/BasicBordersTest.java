package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;
import javax.swing.plaf.basic.BasicBorders.FieldBorder;
import javax.swing.plaf.basic.BasicBorders.MarginBorder;
import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;
import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BasicBordersTest
implements FactoryBasedJ8UnitTest<BasicBorders>, org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests<BasicBorders> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicBorders::new);
    }

    @Parameter(0)
    public Callable<BasicBorders> sutFactory;

    @Override
    public Callable<BasicBorders> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders]

    @RunWith(J8Unit4.class)
    public static class FieldBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.FieldBorderTests<FieldBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$FieldBorder]

        @Override
        public FieldBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.FieldBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$FieldBorder]

    }

    @RunWith(J8Unit4.class)
    public static class MenuBarBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.MenuBarBorderTests<MenuBarBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MenuBarBorder]

        @Override
        public MenuBarBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.MenuBarBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MenuBarBorder]

    }

    @RunWith(J8Unit4.class)
    public static class SplitPaneBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.SplitPaneBorderTests<SplitPaneBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$SplitPaneBorder]

        @Override
        public SplitPaneBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.SplitPaneBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$SplitPaneBorder]

    }

    @RunWith(J8Unit4.class)
    public static class ButtonBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ButtonBorderTests<ButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ButtonBorder]

        @Override
        public ButtonBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.ButtonBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ButtonBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MarginBorderTest
    implements FactoryBasedJ8UnitTest<MarginBorder>, org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.MarginBorderTests<MarginBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MarginBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(MarginBorder::new);
        }

        @Parameter(0)
        public Callable<MarginBorder> sutFactory;

        @Override
        public Callable<MarginBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MarginBorder]

    }

    @RunWith(J8Unit4.class)
    public static class RadioButtonBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.RadioButtonBorderTests<RadioButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RadioButtonBorder]

        @Override
        public RadioButtonBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.RadioButtonBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RadioButtonBorder]

    }

    @RunWith(J8Unit4.class)
    public static class RolloverButtonBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.RolloverButtonBorderTests<RolloverButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder]

        @Override
        public RolloverButtonBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder]

    }

    @RunWith(J8Unit4.class)
    public static class ToggleButtonBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ToggleButtonBorderTests<ToggleButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder]

        @Override
        public ToggleButtonBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder]

    }

}
