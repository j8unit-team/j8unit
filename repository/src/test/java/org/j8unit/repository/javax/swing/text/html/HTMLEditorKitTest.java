package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTMLEditorKit.HTMLFactory;
import javax.swing.text.html.HTMLEditorKit.HTMLTextAction;
import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;
import javax.swing.text.html.HTMLEditorKit.LinkController;
import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
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
public class HTMLEditorKitTest
implements FactoryBasedJ8UnitTest<HTMLEditorKit>, org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests<HTMLEditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(HTMLEditorKit::new);
    }

    @Parameter(0)
    public Callable<HTMLEditorKit> sutFactory;

    @Override
    public Callable<HTMLEditorKit> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit]

    @RunWith(J8Unit4.class)
    public static class InsertHTMLTextActionTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.InsertHTMLTextActionTests<InsertHTMLTextAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction]

        @Override
        public InsertHTMLTextAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction]

    }

    @RunWith(J8Unit4.class)
    public static class ParserTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserTests<Parser> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$Parser]

        @Override
        public Parser createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.html.HTMLEditorKit.Parser], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$Parser]

    }

    @RunWith(J8Unit4.class)
    public static class HTMLTextActionTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.HTMLTextActionTests<HTMLTextAction> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$HTMLTextAction]

        @Override
        public HTMLTextAction createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.html.HTMLEditorKit.HTMLTextAction], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$HTMLTextAction]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class HTMLFactoryTest
    implements FactoryBasedJ8UnitTest<HTMLFactory>, org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.HTMLFactoryTests<HTMLFactory> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$HTMLFactory]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(HTMLFactory::new);
        }

        @Parameter(0)
        public Callable<HTMLFactory> sutFactory;

        @Override
        public Callable<HTMLFactory> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$HTMLFactory]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class LinkControllerTest
    implements FactoryBasedJ8UnitTest<LinkController>, org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.LinkControllerTests<LinkController> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$LinkController]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(LinkController::new);
        }

        @Parameter(0)
        public Callable<LinkController> sutFactory;

        @Override
        public Callable<LinkController> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$LinkController]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ParserCallbackTest
    implements FactoryBasedJ8UnitTest<ParserCallback>, org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserCallbackTests<ParserCallback> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$ParserCallback]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(ParserCallback::new);
        }

        @Parameter(0)
        public Callable<ParserCallback> sutFactory;

        @Override
        public Callable<ParserCallback> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLEditorKit$ParserCallback]

    }

}
