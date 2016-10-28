package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.AlignmentAction;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.StyledEditorKit.FontFamilyAction;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.text.StyledEditorKit.StyledTextAction;
import javax.swing.text.StyledEditorKit.UnderlineAction;
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
public class StyledEditorKitTest
implements FactoryBasedJ8UnitTest<StyledEditorKit>, org.j8unit.repository.javax.swing.text.StyledEditorKitTests<StyledEditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(StyledEditorKit::new);
    }

    @Parameter(0)
    public Callable<StyledEditorKit> sutFactory;

    @Override
    public Callable<StyledEditorKit> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BoldActionTest
    implements FactoryBasedJ8UnitTest<BoldAction>, org.j8unit.repository.javax.swing.text.StyledEditorKitTests.BoldActionTests<BoldAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$BoldAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(BoldAction::new);
        }

        @Parameter(0)
        public Callable<BoldAction> sutFactory;

        @Override
        public Callable<BoldAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$BoldAction]

    }

    @RunWith(J8Unit4.class)
    public static class FontFamilyActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontFamilyActionTests<FontFamilyAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$FontFamilyAction]

        @Override
        public FontFamilyAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.StyledEditorKit.FontFamilyAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$FontFamilyAction]

    }

    @RunWith(J8Unit4.class)
    public static class FontSizeActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontSizeActionTests<FontSizeAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$FontSizeAction]

        @Override
        public FontSizeAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.StyledEditorKit.FontSizeAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$FontSizeAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ItalicActionTest
    implements FactoryBasedJ8UnitTest<ItalicAction>, org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ItalicActionTests<ItalicAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$ItalicAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(ItalicAction::new);
        }

        @Parameter(0)
        public Callable<ItalicAction> sutFactory;

        @Override
        public Callable<ItalicAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$ItalicAction]

    }

    @RunWith(J8Unit4.class)
    public static class AlignmentActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.AlignmentActionTests<AlignmentAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$AlignmentAction]

        @Override
        public AlignmentAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.StyledEditorKit.AlignmentAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$AlignmentAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UnderlineActionTest
    implements FactoryBasedJ8UnitTest<UnderlineAction>, org.j8unit.repository.javax.swing.text.StyledEditorKitTests.UnderlineActionTests<UnderlineAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$UnderlineAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(UnderlineAction::new);
        }

        @Parameter(0)
        public Callable<UnderlineAction> sutFactory;

        @Override
        public Callable<UnderlineAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$UnderlineAction]

    }

    @RunWith(J8Unit4.class)
    public static class StyledTextActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<StyledTextAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$StyledTextAction]

        @Override
        public StyledTextAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.StyledEditorKit.StyledTextAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$StyledTextAction]

    }

    @RunWith(J8Unit4.class)
    public static class ForegroundActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ForegroundActionTests<ForegroundAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$ForegroundAction]

        @Override
        public ForegroundAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.StyledEditorKit.ForegroundAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyledEditorKit$ForegroundAction]

    }

}
