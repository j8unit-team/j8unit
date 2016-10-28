package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AbstractDocument.AbstractElement;
import javax.swing.text.AbstractDocument.AttributeContext;
import javax.swing.text.AbstractDocument.BranchElement;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;
import javax.swing.text.AbstractDocument.ElementEdit;
import javax.swing.text.AbstractDocument.LeafElement;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractDocumentClassTest
implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests<AbstractDocument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractDocument]

    @Override
    public Class<AbstractDocument> createNewSUT() {
        return AbstractDocument.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractDocument]

    @RunWith(J8Unit4.class)
    public static class LeafElementClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.LeafElementClassTests<LeafElement> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractDocument$LeafElement]

        @Override
        public Class<LeafElement> createNewSUT() {
            return LeafElement.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.AbstractDocument.LeafElement#LeafElement(javax.swing.text.AbstractDocument, javax.swing.text.Element, javax.swing.text.AttributeSet, int, int)
         * public
         * javax.swing.text.AbstractDocument$LeafElement(javax.swing.text.AbstractDocument,javax.swing.text.Element,javax.swing.text.AttributeSet,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_LeafElement_AbstractDocument_Element_AttributeSet_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final LeafElement sut = null; // = new LeafElement(javax.swing.text.AbstractDocument,
                                          // javax.swing.text.Element, javax.swing.text.AttributeSet, int, int);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractDocument$LeafElement]

    }

    @RunWith(J8Unit4.class)
    public static class AttributeContextClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.AttributeContextClassTests<AttributeContext> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractDocument$AttributeContext]

        @Override
        public Class<AttributeContext> createNewSUT() {
            return AttributeContext.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractDocument$AttributeContext]

    }

    @RunWith(J8Unit4.class)
    public static class ContentClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.ContentClassTests<Content> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractDocument$Content]

        @Override
        public Class<Content> createNewSUT() {
            return Content.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractDocument$Content]

    }

    @RunWith(J8Unit4.class)
    public static class BranchElementClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.BranchElementClassTests<BranchElement> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractDocument$BranchElement]

        @Override
        public Class<BranchElement> createNewSUT() {
            return BranchElement.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.AbstractDocument.BranchElement#BranchElement(javax.swing.text.AbstractDocument, javax.swing.text.Element, javax.swing.text.AttributeSet)
         * public
         * javax.swing.text.AbstractDocument$BranchElement(javax.swing.text.AbstractDocument,javax.swing.text.Element,javax.swing.text.AttributeSet)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_BranchElement_AbstractDocument_Element_AttributeSet()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final BranchElement sut = null; // = new BranchElement(javax.swing.text.AbstractDocument,
                                            // javax.swing.text.Element, javax.swing.text.AttributeSet);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractDocument$BranchElement]

    }

    @RunWith(J8Unit4.class)
    public static class ElementEditClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.ElementEditClassTests<ElementEdit> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractDocument$ElementEdit]

        @Override
        public Class<ElementEdit> createNewSUT() {
            return ElementEdit.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.AbstractDocument.ElementEdit#ElementEdit(javax.swing.text.Element, int, javax.swing.text.Element[], javax.swing.text.Element[])
         * public
         * javax.swing.text.AbstractDocument$ElementEdit(javax.swing.text.Element,int,javax.swing.text.Element[],javax.swing.text.Element[])}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ElementEdit_Element_int_ElementArray_ElementArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ElementEdit sut = null; // = new ElementEdit(javax.swing.text.Element, int,
                                          // javax.swing.text.Element[], javax.swing.text.Element[]);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractDocument$ElementEdit]

    }

    @RunWith(J8Unit4.class)
    public static class AbstractElementClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.AbstractElementClassTests<AbstractElement> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractDocument$AbstractElement]

        @Override
        public Class<AbstractElement> createNewSUT() {
            return AbstractElement.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.AbstractDocument.AbstractElement#AbstractElement(javax.swing.text.AbstractDocument, javax.swing.text.Element, javax.swing.text.AttributeSet)
         * public
         * javax.swing.text.AbstractDocument$AbstractElement(javax.swing.text.AbstractDocument,javax.swing.text.Element,javax.swing.text.AttributeSet)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_AbstractElement_AbstractDocument_Element_AttributeSet()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractDocument$AbstractElement]

    }

    @RunWith(J8Unit4.class)
    public static class DefaultDocumentEventClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.DefaultDocumentEventClassTests<DefaultDocumentEvent> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AbstractDocument$DefaultDocumentEvent]

        @Override
        public Class<DefaultDocumentEvent> createNewSUT() {
            return DefaultDocumentEvent.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.AbstractDocument.DefaultDocumentEvent#DefaultDocumentEvent(javax.swing.text.AbstractDocument, int, int, javax.swing.event.DocumentEvent.EventType)
         * public
         * javax.swing.text.AbstractDocument$DefaultDocumentEvent(javax.swing.text.AbstractDocument,int,int,javax.swing.event.DocumentEvent$EventType)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DefaultDocumentEvent_AbstractDocument_int_int_EventType()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final DefaultDocumentEvent sut = null; // = new DefaultDocumentEvent(javax.swing.text.AbstractDocument, int,
                                                   // int, javax.swing.event.DocumentEvent.EventType);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AbstractDocument$DefaultDocumentEvent]

    }

}
