package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractDocumentClassTest
implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests<javax.swing.text.AbstractDocument> {

    @RunWith(J8Unit4.class)
    public static class AbstractElementClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.AbstractElementClassTests<javax.swing.text.AbstractDocument.AbstractElement> {

        @Override
        public Class<javax.swing.text.AbstractDocument.AbstractElement> createNewSUT() {
            return javax.swing.text.AbstractDocument.AbstractElement.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class AttributeContextClassTest
    implements
    org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.AttributeContextClassTests<javax.swing.text.AbstractDocument.AttributeContext> {

        @Override
        public Class<javax.swing.text.AbstractDocument.AttributeContext> createNewSUT() {
            return javax.swing.text.AbstractDocument.AttributeContext.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class BranchElementClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.BranchElementClassTests<javax.swing.text.AbstractDocument.BranchElement> {

        @Override
        public Class<javax.swing.text.AbstractDocument.BranchElement> createNewSUT() {
            return javax.swing.text.AbstractDocument.BranchElement.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ContentClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.ContentClassTests<javax.swing.text.AbstractDocument.Content> {

        @Override
        public Class<javax.swing.text.AbstractDocument.Content> createNewSUT() {
            return javax.swing.text.AbstractDocument.Content.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class DefaultDocumentEventClassTest
    implements
    org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.DefaultDocumentEventClassTests<javax.swing.text.AbstractDocument.DefaultDocumentEvent> {

        @Override
        public Class<javax.swing.text.AbstractDocument.DefaultDocumentEvent> createNewSUT() {
            return javax.swing.text.AbstractDocument.DefaultDocumentEvent.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ElementEditClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.ElementEditClassTests<javax.swing.text.AbstractDocument.ElementEdit> {

        @Override
        public Class<javax.swing.text.AbstractDocument.ElementEdit> createNewSUT() {
            return javax.swing.text.AbstractDocument.ElementEdit.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class LeafElementClassTest
    implements org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.LeafElementClassTests<javax.swing.text.AbstractDocument.LeafElement> {

        @Override
        public Class<javax.swing.text.AbstractDocument.LeafElement> createNewSUT() {
            return javax.swing.text.AbstractDocument.LeafElement.class;
        }

    }

    @Override
    public Class<javax.swing.text.AbstractDocument> createNewSUT() {
        return javax.swing.text.AbstractDocument.class;
    }

}
