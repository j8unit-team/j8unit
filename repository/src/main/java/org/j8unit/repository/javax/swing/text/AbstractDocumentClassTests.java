package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.AbstractDocument class
 * javax.swing.text.AbstractDocument}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.text.AbstractDocumentTests}.
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
 * @see org.j8unit.repository.javax.swing.text.AbstractDocumentTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.AbstractDocument
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractDocumentClassTests<SUT extends javax.swing.text.AbstractDocument>
extends org.j8unit.repository.javax.swing.text.DocumentClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AbstractDocument.AbstractElement class
     * javax.swing.text.AbstractDocument$AbstractElement}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AbstractDocumentTests.AbstractElementTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AbstractDocumentTests.AbstractElementTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AbstractDocument.AbstractElement
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbstractElementClassTests<SUT extends javax.swing.text.AbstractDocument.AbstractElement>
    extends org.j8unit.repository.javax.swing.text.ElementClassTests<SUT>, org.j8unit.repository.javax.swing.text.MutableAttributeSetClassTests<SUT>,
    org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.javax.swing.tree.TreeNodeClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
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
         * @j8unit.aim javax.swing.text.AbstractDocument.AbstractElement#AbstractElement(javax.swing.text.
         *             AbstractDocument, javax.swing.text.Element, javax.swing.text.AttributeSet)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AbstractElement_AbstractDocument_Element_AttributeSet()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.AbstractDocument.AbstractElement sut = null; // = new
                                                                                // AbstractElement(javax.swing.text.AbstractDocument,
                                                                                // javax.swing.text.Element,
                                                                                // javax.swing.text.AttributeSet);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AbstractDocument.AbstractElement#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AbstractDocument.AbstractElement.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AbstractDocument.AttributeContext interface
     * javax.swing.text.AbstractDocument$AttributeContext}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AbstractDocumentTests.AttributeContextTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AbstractDocumentTests.AttributeContextTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AbstractDocument.AttributeContext
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AttributeContextClassTests<SUT extends javax.swing.text.AbstractDocument.AttributeContext>
    extends RepositoryClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AbstractDocument.AttributeContext#isAssignableFrom(java.lang.Class)
         */
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AbstractDocument.AttributeContext.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AbstractDocument.BranchElement class
     * javax.swing.text.AbstractDocument$BranchElement}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AbstractDocumentTests.BranchElementTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AbstractDocumentTests.BranchElementTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AbstractDocument.BranchElement
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BranchElementClassTests<SUT extends javax.swing.text.AbstractDocument.BranchElement>
    extends org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.AbstractElementClassTests<SUT> {

        /**
         * <p>
         * Test method for
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
         * @j8unit.aim javax.swing.text.AbstractDocument.BranchElement#BranchElement(javax.swing.text.AbstractDocument,
         *             javax.swing.text.Element, javax.swing.text.AttributeSet)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_BranchElement_AbstractDocument_Element_AttributeSet()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.AbstractDocument.BranchElement sut = null; // = new
                                                                              // BranchElement(javax.swing.text.AbstractDocument,
                                                                              // javax.swing.text.Element,
                                                                              // javax.swing.text.AttributeSet);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AbstractDocument.BranchElement#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AbstractDocument.BranchElement.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AbstractDocument.Content interface
     * javax.swing.text.AbstractDocument$Content}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AbstractDocumentTests.ContentTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AbstractDocumentTests.ContentTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AbstractDocument.Content
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ContentClassTests<SUT extends javax.swing.text.AbstractDocument.Content>
    extends RepositoryClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AbstractDocument.Content#isAssignableFrom(java.lang.Class)
         */
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AbstractDocument.Content.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AbstractDocument.DefaultDocumentEvent class
     * javax.swing.text.AbstractDocument$DefaultDocumentEvent}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AbstractDocumentTests.DefaultDocumentEventTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AbstractDocumentTests.DefaultDocumentEventTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AbstractDocument.DefaultDocumentEvent
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultDocumentEventClassTests<SUT extends javax.swing.text.AbstractDocument.DefaultDocumentEvent>
    extends org.j8unit.repository.javax.swing.event.DocumentEventClassTests<SUT>, org.j8unit.repository.javax.swing.undo.CompoundEditClassTests<SUT> {

        /**
         * <p>
         * Test method for
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
         * @j8unit.aim javax.swing.text.AbstractDocument.DefaultDocumentEvent#DefaultDocumentEvent(javax.swing.text.
         *             AbstractDocument, int, int, javax.swing.event.DocumentEvent.EventType)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DefaultDocumentEvent_AbstractDocument_int_int_EventType()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.AbstractDocument.DefaultDocumentEvent sut = null; // = new
                                                                                     // DefaultDocumentEvent(javax.swing.text.AbstractDocument,
                                                                                     // int, int,
                                                                                     // javax.swing.event.DocumentEvent.EventType);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AbstractDocument.DefaultDocumentEvent#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AbstractDocument.DefaultDocumentEvent.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AbstractDocument.ElementEdit class
     * javax.swing.text.AbstractDocument$ElementEdit}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AbstractDocumentTests.ElementEditTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AbstractDocumentTests.ElementEditTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AbstractDocument.ElementEdit
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ElementEditClassTests<SUT extends javax.swing.text.AbstractDocument.ElementEdit>
    extends org.j8unit.repository.javax.swing.event.DocumentEventClassTests.ElementChangeClassTests<SUT>,
    org.j8unit.repository.javax.swing.undo.AbstractUndoableEditClassTests<SUT> {

        /**
         * <p>
         * Test method for
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
         * @j8unit.aim javax.swing.text.AbstractDocument.ElementEdit#ElementEdit(javax.swing.text.Element, int,
         *             javax.swing.text.Element[], javax.swing.text.Element[])
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ElementEdit_Element_int_ElementArray_ElementArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.AbstractDocument.ElementEdit sut = null; // = new
                                                                            // ElementEdit(javax.swing.text.Element,
                                                                            // int, javax.swing.text.Element[],
                                                                            // javax.swing.text.Element[]);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AbstractDocument.ElementEdit#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AbstractDocument.ElementEdit.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AbstractDocument.LeafElement class
     * javax.swing.text.AbstractDocument$LeafElement}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AbstractDocumentTests.LeafElementTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AbstractDocumentTests.LeafElementTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AbstractDocument.LeafElement
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LeafElementClassTests<SUT extends javax.swing.text.AbstractDocument.LeafElement>
    extends org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.AbstractElementClassTests<SUT> {

        /**
         * <p>
         * Test method for
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
         * @j8unit.aim javax.swing.text.AbstractDocument.LeafElement#LeafElement(javax.swing.text.AbstractDocument,
         *             javax.swing.text.Element, javax.swing.text.AttributeSet, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LeafElement_AbstractDocument_Element_AttributeSet_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.AbstractDocument.LeafElement sut = null; // = new
                                                                            // LeafElement(javax.swing.text.AbstractDocument,
                                                                            // javax.swing.text.Element,
                                                                            // javax.swing.text.AttributeSet, int, int);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AbstractDocument.LeafElement#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AbstractDocument.LeafElement.class.isAssignableFrom(sut));
        }

    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.text.AbstractDocument#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.AbstractDocument.class.isAssignableFrom(sut));
    }

}
