package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultStyledDocumentClassTest
implements org.j8unit.repository.javax.swing.text.DefaultStyledDocumentClassTests<javax.swing.text.DefaultStyledDocument> {

    @RunWith(J8Unit4.class)
    public static class AttributeUndoableEditClassTest
    implements
    org.j8unit.repository.javax.swing.text.DefaultStyledDocumentClassTests.AttributeUndoableEditClassTests<javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit> {

        @Override
        public Class<javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit> createNewSUT() {
            return javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ElementBufferClassTest
    implements
    org.j8unit.repository.javax.swing.text.DefaultStyledDocumentClassTests.ElementBufferClassTests<javax.swing.text.DefaultStyledDocument.ElementBuffer> {

        @Override
        public Class<javax.swing.text.DefaultStyledDocument.ElementBuffer> createNewSUT() {
            return javax.swing.text.DefaultStyledDocument.ElementBuffer.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ElementSpecClassTest
    implements
    org.j8unit.repository.javax.swing.text.DefaultStyledDocumentClassTests.ElementSpecClassTests<javax.swing.text.DefaultStyledDocument.ElementSpec> {

        @Override
        public Class<javax.swing.text.DefaultStyledDocument.ElementSpec> createNewSUT() {
            return javax.swing.text.DefaultStyledDocument.ElementSpec.class;
        }

    }

    @Override
    public Class<javax.swing.text.DefaultStyledDocument> createNewSUT() {
        return javax.swing.text.DefaultStyledDocument.class;
    }

}
