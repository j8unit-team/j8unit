package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultStyledDocument class
 * javax.swing.text.DefaultStyledDocument}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.DefaultStyledDocument
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultStyledDocumentClassTests<SUT extends javax.swing.text.DefaultStyledDocument>
extends org.j8unit.repository.javax.swing.text.StyledDocumentClassTests<SUT>, org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit class
     * javax.swing.text.DefaultStyledDocument$AttributeUndoableEdit}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
     * J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.AttributeUndoableEditTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.AttributeUndoableEditTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AttributeUndoableEditClassTests<SUT extends javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit>
    extends org.j8unit.repository.javax.swing.undo.AbstractUndoableEditClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit#AttributeUndoableEdit(javax.swing.text.Element, javax.swing.text.AttributeSet, boolean)
         * public
         * javax.swing.text.DefaultStyledDocument$AttributeUndoableEdit(javax.swing.text.Element,javax.swing.text.AttributeSet,boolean)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit#AttributeUndoableEdit(javax.swing.
         *             text.Element, javax.swing.text.AttributeSet, boolean)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AttributeUndoableEdit_Element_AttributeSet_boolean()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit sut = null; // = new
                                                                                           // AttributeUndoableEdit(javax.swing.text.Element,
                                                                                           // javax.swing.text.AttributeSet,
                                                                                           // boolean);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultStyledDocument.AttributeUndoableEdit.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultStyledDocument.ElementBuffer class
     * javax.swing.text.DefaultStyledDocument$ElementBuffer}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.ElementBufferTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.ElementBufferTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultStyledDocument.ElementBuffer
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ElementBufferClassTests<SUT extends javax.swing.text.DefaultStyledDocument.ElementBuffer>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultStyledDocument.ElementBuffer#ElementBuffer(javax.swing.text.DefaultStyledDocument, javax.swing.text.Element)
         * public
         * javax.swing.text.DefaultStyledDocument$ElementBuffer(javax.swing.text.DefaultStyledDocument,javax.swing.text.Element)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultStyledDocument.ElementBuffer#ElementBuffer(javax.swing.text.
         *             DefaultStyledDocument, javax.swing.text.Element)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ElementBuffer_DefaultStyledDocument_Element()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.DefaultStyledDocument.ElementBuffer sut = null; // = new
                                                                                   // ElementBuffer(javax.swing.text.DefaultStyledDocument,
                                                                                   // javax.swing.text.Element);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.DefaultStyledDocument.ElementBuffer#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultStyledDocument.ElementBuffer.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultStyledDocument.ElementSpec class
     * javax.swing.text.DefaultStyledDocument$ElementSpec}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.ElementSpecTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests.ElementSpecTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultStyledDocument.ElementSpec
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ElementSpecClassTests<SUT extends javax.swing.text.DefaultStyledDocument.ElementSpec>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultStyledDocument.ElementSpec#ElementSpec(javax.swing.text.AttributeSet, short)
         * public javax.swing.text.DefaultStyledDocument$ElementSpec(javax.swing.text.AttributeSet,short)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultStyledDocument.ElementSpec#ElementSpec(javax.swing.text.AttributeSet,
         *             short)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ElementSpec_AttributeSet_short()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.DefaultStyledDocument.ElementSpec sut = null; // = new
                                                                                 // ElementSpec(javax.swing.text.AttributeSet,
                                                                                 // short);
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultStyledDocument.ElementSpec#ElementSpec(javax.swing.text.AttributeSet, short, char[], int, int)
         * public
         * javax.swing.text.DefaultStyledDocument$ElementSpec(javax.swing.text.AttributeSet,short,char[],int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultStyledDocument.ElementSpec#ElementSpec(javax.swing.text.AttributeSet,
         *             short, char[], int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ElementSpec_AttributeSet_short_charArray_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.DefaultStyledDocument.ElementSpec sut = null; // = new
                                                                                 // ElementSpec(javax.swing.text.AttributeSet,
                                                                                 // short, char[], int, int);
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultStyledDocument.ElementSpec#ElementSpec(javax.swing.text.AttributeSet, short, int)
         * public javax.swing.text.DefaultStyledDocument$ElementSpec(javax.swing.text.AttributeSet,short,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultStyledDocument.ElementSpec#ElementSpec(javax.swing.text.AttributeSet,
         *             short, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ElementSpec_AttributeSet_short_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.DefaultStyledDocument.ElementSpec sut = null; // = new
                                                                                 // ElementSpec(javax.swing.text.AttributeSet,
                                                                                 // short, int);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.DefaultStyledDocument.ElementSpec#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultStyledDocument.ElementSpec.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultStyledDocument#DefaultStyledDocument() public
     * javax.swing.text.DefaultStyledDocument()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultStyledDocument#DefaultStyledDocument()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultStyledDocument()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultStyledDocument sut = null; // = new DefaultStyledDocument();
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.DefaultStyledDocument#DefaultStyledDocument(javax.swing.text.AbstractDocument.Content, javax.swing.text.StyleContext)
     * public
     * javax.swing.text.DefaultStyledDocument(javax.swing.text.AbstractDocument$Content,javax.swing.text.StyleContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultStyledDocument#DefaultStyledDocument(javax.swing.text.AbstractDocument.
     *             Content, javax.swing.text.StyleContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultStyledDocument_Content_StyleContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultStyledDocument sut = null; // = new
                                                                 // DefaultStyledDocument(javax.swing.text.AbstractDocument.Content,
                                                                 // javax.swing.text.StyleContext);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.DefaultStyledDocument#DefaultStyledDocument(javax.swing.text.StyleContext) public
     * javax.swing.text.DefaultStyledDocument(javax.swing.text.StyleContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultStyledDocument#DefaultStyledDocument(javax.swing.text.StyleContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultStyledDocument_StyleContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultStyledDocument sut = null; // = new
                                                                 // DefaultStyledDocument(javax.swing.text.StyleContext);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.text.DefaultStyledDocument#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.DefaultStyledDocument.class.isAssignableFrom(sut));
    }

}
