package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLDocument.BlockElement;
import javax.swing.text.html.HTMLDocument.HTMLReader;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.text.html.HTMLDocument.RunElement;
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
public class HTMLDocumentTest
implements FactoryBasedJ8UnitTest<HTMLDocument>, HTMLDocumentTests<HTMLDocument> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(HTMLDocument::new);
    }

    @Parameter(0)
    public Callable<HTMLDocument> sutFactory;

    @Override
    public Callable<HTMLDocument> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link HTMLReader} (by simply reusing
     * the J8Unit test interface {@link HTMLReaderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class HTMLReaderTest
    implements HTMLReaderTests<HTMLReader> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        @Override
        public HTMLReader createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link BlockAction} (by simply
         * reusing the J8Unit test interface {@link BlockActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class BlockActionTest
        implements BlockActionTests<BlockAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

            @Override
            public BlockAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

        }

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link ParagraphAction} (by simply
         * reusing the J8Unit test interface {@link ParagraphActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class ParagraphActionTest
        implements ParagraphActionTests<ParagraphAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

            @Override
            public ParagraphAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

        }

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link TagAction} (by simply reusing
         * the J8Unit test interface {@link TagActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class TagActionTest
        implements TagActionTests<TagAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

            @Override
            public TagAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.TagAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

        }

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link PreAction} (by simply reusing
         * the J8Unit test interface {@link PreActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class PreActionTest
        implements PreActionTests<PreAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

            @Override
            public PreAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.PreAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

        }

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link IsindexAction} (by simply
         * reusing the J8Unit test interface {@link IsindexActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class IsindexActionTest
        implements IsindexActionTests<IsindexAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

            @Override
            public IsindexAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

        }

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link SpecialAction} (by simply
         * reusing the J8Unit test interface {@link SpecialActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class SpecialActionTest
        implements SpecialActionTests<SpecialAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

            @Override
            public SpecialAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

        }

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link HiddenAction} (by simply
         * reusing the J8Unit test interface {@link HiddenActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class HiddenActionTest
        implements HiddenActionTests<HiddenAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

            @Override
            public HiddenAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

        }

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link FormAction} (by simply
         * reusing the J8Unit test interface {@link FormActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class FormActionTest
        implements FormActionTests<FormAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

            @Override
            public FormAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.FormAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

        }

        /**
         * Specific JUnit test class to proof the instance relevant aspects of type {@link CharacterAction} (by simply
         * reusing the J8Unit test interface {@link CharacterActionTests}).
         */

        @RunWith(J8Unit4.class)
        public static class CharacterActionTest
        implements CharacterActionTests<CharacterAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

            @Override
            public CharacterAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

        }

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link BlockElement} (by simply reusing
     * the J8Unit test interface {@link BlockElementTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BlockElementTest
    implements BlockElementTests<BlockElement> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$BlockElement]

        @Override
        public BlockElement createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.BlockElement], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$BlockElement]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$BlockElement]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link RunElement} (by simply reusing
     * the J8Unit test interface {@link RunElementTests}).
     */

    @RunWith(J8Unit4.class)
    public static class RunElementTest
    implements RunElementTests<RunElement> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$RunElement]

        @Override
        public RunElement createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.RunElement], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$RunElement]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$RunElement]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Iterator} (by simply reusing the
     * J8Unit test interface {@link IteratorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class IteratorTest
    implements IteratorTests<Iterator> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$Iterator]

        @Override
        public Iterator createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.html.HTMLDocument.Iterator], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$Iterator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$Iterator]

    }

}
