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
implements FactoryBasedJ8UnitTest<BasicBorders>, BasicBordersTests<BasicBorders> {

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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link SplitPaneBorder} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.SplitPaneBorderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SplitPaneBorderTest
    implements SplitPaneBorderTests<SplitPaneBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$SplitPaneBorder]

        @Override
        public SplitPaneBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.SplitPaneBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$SplitPaneBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$SplitPaneBorder]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ToggleButtonBorder} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ToggleButtonBorderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ToggleButtonBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ToggleButtonBorderTests<ToggleButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder]

        @Override
        public ToggleButtonBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link RolloverButtonBorder} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.RolloverButtonBorderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class RolloverButtonBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.RolloverButtonBorderTests<RolloverButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder]

        @Override
        public RolloverButtonBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FieldBorder} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.FieldBorderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FieldBorderTest
    implements FieldBorderTests<FieldBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$FieldBorder]

        @Override
        public FieldBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.FieldBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$FieldBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$FieldBorder]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link RadioButtonBorder} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.RadioButtonBorderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class RadioButtonBorderTest
    implements RadioButtonBorderTests<RadioButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RadioButtonBorder]

        @Override
        public RadioButtonBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.RadioButtonBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RadioButtonBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$RadioButtonBorder]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuBarBorder} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.MenuBarBorderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MenuBarBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.MenuBarBorderTests<MenuBarBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MenuBarBorder]

        @Override
        public MenuBarBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.MenuBarBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MenuBarBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MenuBarBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MarginBorderTest
    implements FactoryBasedJ8UnitTest<MarginBorder>, MarginBorderTests<MarginBorder> {

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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MarginBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$MarginBorder]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ButtonBorder} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ButtonBorderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ButtonBorderTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ButtonBorderTests<ButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ButtonBorder]

        @Override
        public ButtonBorder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicBorders.ButtonBorder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ButtonBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicBorders$ButtonBorder]

    }

}
