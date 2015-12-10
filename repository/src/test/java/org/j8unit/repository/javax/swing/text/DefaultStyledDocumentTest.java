package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultStyledDocumentTest
implements org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests<javax.swing.text.DefaultStyledDocument> {

    @RunWith(J8Unit4.class)
    public static class AttributeUndoableEditTest
    implements
    org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.AttributeUndoableEditTests<javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit> {

        @Override
        public javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class ElementBufferTest
    implements org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.ElementBufferTests<javax.swing.text.DefaultStyledDocument.ElementBuffer> {

        @Override
        public javax.swing.text.DefaultStyledDocument.ElementBuffer createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.DefaultStyledDocument.ElementBuffer] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class ElementSpecTest
    implements org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.ElementSpecTests<javax.swing.text.DefaultStyledDocument.ElementSpec> {

        @Override
        public javax.swing.text.DefaultStyledDocument.ElementSpec createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.DefaultStyledDocument.ElementSpec] available.");
        }

    }

    @Override
    public javax.swing.text.DefaultStyledDocument createNewSUT() {
        return new javax.swing.text.DefaultStyledDocument();
    }

}
