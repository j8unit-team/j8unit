package org.j8unit.repository.javax.swing.plaf.metal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.metal.MetalBorders;
import javax.swing.plaf.metal.MetalBorders.ButtonBorder;
import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;
import javax.swing.plaf.metal.MetalBorders.InternalFrameBorder;
import javax.swing.plaf.metal.MetalBorders.MenuBarBorder;
import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;
import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;
import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;
import javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;
import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder;
import javax.swing.plaf.metal.MetalBorders.ToolBarBorder;
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
public class MetalBordersTest
implements FactoryBasedJ8UnitTest<MetalBorders>, MetalBordersTests<MetalBorders> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MetalBorders::new);
    }

    @Parameter(0)
    public Callable<MetalBorders> sutFactory;

    @Override
    public Callable<MetalBorders> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ButtonBorderTest
    implements FactoryBasedJ8UnitTest<ButtonBorder>, ButtonBorderTests<ButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ButtonBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(ButtonBorder::new);
        }

        @Parameter(0)
        public Callable<ButtonBorder> sutFactory;

        @Override
        public Callable<ButtonBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ButtonBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ButtonBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ToolBarBorderTest
    implements FactoryBasedJ8UnitTest<ToolBarBorder>, ToolBarBorderTests<ToolBarBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToolBarBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(ToolBarBorder::new);
        }

        @Parameter(0)
        public Callable<ToolBarBorder> sutFactory;

        @Override
        public Callable<ToolBarBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToolBarBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToolBarBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ToggleButtonBorderTest
    implements FactoryBasedJ8UnitTest<ToggleButtonBorder>, ToggleButtonBorderTests<ToggleButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(ToggleButtonBorder::new);
        }

        @Parameter(0)
        public Callable<ToggleButtonBorder> sutFactory;

        @Override
        public Callable<ToggleButtonBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PaletteBorderTest
    implements FactoryBasedJ8UnitTest<PaletteBorder>, PaletteBorderTests<PaletteBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PaletteBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(PaletteBorder::new);
        }

        @Parameter(0)
        public Callable<PaletteBorder> sutFactory;

        @Override
        public Callable<PaletteBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PaletteBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PaletteBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ScrollPaneBorderTest
    implements FactoryBasedJ8UnitTest<ScrollPaneBorder>, ScrollPaneBorderTests<ScrollPaneBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(ScrollPaneBorder::new);
        }

        @Parameter(0)
        public Callable<ScrollPaneBorder> sutFactory;

        @Override
        public Callable<ScrollPaneBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TextFieldBorderTest
    implements FactoryBasedJ8UnitTest<TextFieldBorder>, TextFieldBorderTests<TextFieldBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TextFieldBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(TextFieldBorder::new);
        }

        @Parameter(0)
        public Callable<TextFieldBorder> sutFactory;

        @Override
        public Callable<TextFieldBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TextFieldBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TextFieldBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MenuItemBorderTest
    implements FactoryBasedJ8UnitTest<MenuItemBorder>, MenuItemBorderTests<MenuItemBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuItemBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(MenuItemBorder::new);
        }

        @Parameter(0)
        public Callable<MenuItemBorder> sutFactory;

        @Override
        public Callable<MenuItemBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuItemBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuItemBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class OptionDialogBorderTest
    implements FactoryBasedJ8UnitTest<OptionDialogBorder>, OptionDialogBorderTests<OptionDialogBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$OptionDialogBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(OptionDialogBorder::new);
        }

        @Parameter(0)
        public Callable<OptionDialogBorder> sutFactory;

        @Override
        public Callable<OptionDialogBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$OptionDialogBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$OptionDialogBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class RolloverButtonBorderTest
    implements FactoryBasedJ8UnitTest<RolloverButtonBorder>, RolloverButtonBorderTests<RolloverButtonBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(RolloverButtonBorder::new);
        }

        @Parameter(0)
        public Callable<RolloverButtonBorder> sutFactory;

        @Override
        public Callable<RolloverButtonBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PopupMenuBorderTest
    implements FactoryBasedJ8UnitTest<PopupMenuBorder>, PopupMenuBorderTests<PopupMenuBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PopupMenuBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(PopupMenuBorder::new);
        }

        @Parameter(0)
        public Callable<PopupMenuBorder> sutFactory;

        @Override
        public Callable<PopupMenuBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PopupMenuBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PopupMenuBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class InternalFrameBorderTest
    implements FactoryBasedJ8UnitTest<InternalFrameBorder>, InternalFrameBorderTests<InternalFrameBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$InternalFrameBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(InternalFrameBorder::new);
        }

        @Parameter(0)
        public Callable<InternalFrameBorder> sutFactory;

        @Override
        public Callable<InternalFrameBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$InternalFrameBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$InternalFrameBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TableHeaderBorderTest
    implements FactoryBasedJ8UnitTest<TableHeaderBorder>, TableHeaderBorderTests<TableHeaderBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TableHeaderBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(TableHeaderBorder::new);
        }

        @Parameter(0)
        public Callable<TableHeaderBorder> sutFactory;

        @Override
        public Callable<TableHeaderBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TableHeaderBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TableHeaderBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MenuBarBorderTest
    implements FactoryBasedJ8UnitTest<MenuBarBorder>, MenuBarBorderTests<MenuBarBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuBarBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(MenuBarBorder::new);
        }

        @Parameter(0)
        public Callable<MenuBarBorder> sutFactory;

        @Override
        public Callable<MenuBarBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuBarBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuBarBorder]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class Flush3DBorderTest
    implements FactoryBasedJ8UnitTest<Flush3DBorder>, Flush3DBorderTests<Flush3DBorder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$Flush3DBorder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(Flush3DBorder::new);
        }

        @Parameter(0)
        public Callable<Flush3DBorder> sutFactory;

        @Override
        public Callable<Flush3DBorder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$Flush3DBorder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$Flush3DBorder]

    }

}
