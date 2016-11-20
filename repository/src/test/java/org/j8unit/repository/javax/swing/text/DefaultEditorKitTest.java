package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.DefaultEditorKit.BeepAction;
import javax.swing.text.DefaultEditorKit.CopyAction;
import javax.swing.text.DefaultEditorKit.CutAction;
import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;
import javax.swing.text.DefaultEditorKit.InsertContentAction;
import javax.swing.text.DefaultEditorKit.InsertTabAction;
import javax.swing.text.DefaultEditorKit.PasteAction;
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
public class DefaultEditorKitTest
implements FactoryBasedJ8UnitTest<DefaultEditorKit>, DefaultEditorKitTests<DefaultEditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DefaultEditorKit::new);
    }

    @Parameter(0)
    public Callable<DefaultEditorKit> sutFactory;

    @Override
    public Callable<DefaultEditorKit> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class InsertBreakActionTest
    implements FactoryBasedJ8UnitTest<InsertBreakAction>, InsertBreakActionTests<InsertBreakAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(InsertBreakAction::new);
        }

        @Parameter(0)
        public Callable<InsertBreakAction> sutFactory;

        @Override
        public Callable<InsertBreakAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DefaultKeyTypedActionTest
    implements FactoryBasedJ8UnitTest<DefaultKeyTypedAction>, DefaultKeyTypedActionTests<DefaultKeyTypedAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(DefaultKeyTypedAction::new);
        }

        @Parameter(0)
        public Callable<DefaultKeyTypedAction> sutFactory;

        @Override
        public Callable<DefaultKeyTypedAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class InsertTabActionTest
    implements FactoryBasedJ8UnitTest<InsertTabAction>, InsertTabActionTests<InsertTabAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertTabAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(InsertTabAction::new);
        }

        @Parameter(0)
        public Callable<InsertTabAction> sutFactory;

        @Override
        public Callable<InsertTabAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertTabAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertTabAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CutActionTest
    implements FactoryBasedJ8UnitTest<CutAction>, CutActionTests<CutAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CutAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(CutAction::new);
        }

        @Parameter(0)
        public Callable<CutAction> sutFactory;

        @Override
        public Callable<CutAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CutAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CutAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class InsertContentActionTest
    implements FactoryBasedJ8UnitTest<InsertContentAction>, InsertContentActionTests<InsertContentAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertContentAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(InsertContentAction::new);
        }

        @Parameter(0)
        public Callable<InsertContentAction> sutFactory;

        @Override
        public Callable<InsertContentAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertContentAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertContentAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PasteActionTest
    implements FactoryBasedJ8UnitTest<PasteAction>, PasteActionTests<PasteAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$PasteAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(PasteAction::new);
        }

        @Parameter(0)
        public Callable<PasteAction> sutFactory;

        @Override
        public Callable<PasteAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$PasteAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$PasteAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BeepActionTest
    implements FactoryBasedJ8UnitTest<BeepAction>, BeepActionTests<BeepAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$BeepAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(BeepAction::new);
        }

        @Parameter(0)
        public Callable<BeepAction> sutFactory;

        @Override
        public Callable<BeepAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$BeepAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$BeepAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CopyActionTest
    implements FactoryBasedJ8UnitTest<CopyAction>, CopyActionTests<CopyAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CopyAction]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(CopyAction::new);
        }

        @Parameter(0)
        public Callable<CopyAction> sutFactory;

        @Override
        public Callable<CopyAction> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CopyAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CopyAction]

    }

}
