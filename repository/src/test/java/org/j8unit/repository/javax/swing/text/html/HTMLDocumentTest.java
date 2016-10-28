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
implements FactoryBasedJ8UnitTest<HTMLDocument>, org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests<HTMLDocument> {

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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument]

    @RunWith(J8Unit4.class)
    public static class HTMLReaderTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests<HTMLReader> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        @Override
        public HTMLReader createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        @RunWith(J8Unit4.class)
        public static class HiddenActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.HiddenActionTests<HiddenAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

            @Override
            public HiddenAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

        }

        @RunWith(J8Unit4.class)
        public static class PreActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.PreActionTests<PreAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

            @Override
            public PreAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.PreAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

        }

        @RunWith(J8Unit4.class)
        public static class ParagraphActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests<ParagraphAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

            @Override
            public ParagraphAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

        }

        @RunWith(J8Unit4.class)
        public static class SpecialActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.SpecialActionTests<SpecialAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

            @Override
            public SpecialAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

        }

        @RunWith(J8Unit4.class)
        public static class CharacterActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.CharacterActionTests<CharacterAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

            @Override
            public CharacterAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

        }

        @RunWith(J8Unit4.class)
        public static class FormActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.FormActionTests<FormAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

            @Override
            public FormAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.FormAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

        }

        @RunWith(J8Unit4.class)
        public static class IsindexActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.IsindexActionTests<IsindexAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

            @Override
            public IsindexAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

        }

        @RunWith(J8Unit4.class)
        public static class BlockActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests<BlockAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

            @Override
            public BlockAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

        }

        @RunWith(J8Unit4.class)
        public static class TagActionTest
        implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<TagAction> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

            @Override
            public TagAction createNewSUT() {
                throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.HTMLReader.TagAction], j8unit does not support a generic way to provide instances.");
            }

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

        }

    }

    @RunWith(J8Unit4.class)
    public static class BlockElementTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.BlockElementTests<BlockElement> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$BlockElement]

        @Override
        public BlockElement createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.BlockElement], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$BlockElement]

    }

    @RunWith(J8Unit4.class)
    public static class IteratorTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.IteratorTests<Iterator> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$Iterator]

        @Override
        public Iterator createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.html.HTMLDocument.Iterator], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$Iterator]

    }

    @RunWith(J8Unit4.class)
    public static class RunElementTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.RunElementTests<RunElement> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$RunElement]

        @Override
        public RunElement createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTMLDocument.RunElement], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$RunElement]

    }

}
