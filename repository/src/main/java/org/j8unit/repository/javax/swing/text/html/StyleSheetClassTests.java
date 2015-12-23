package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.StyleSheet class
 * javax.swing.text.html.StyleSheet}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.text.html.StyleSheetTests}.
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
 * @see org.j8unit.repository.javax.swing.text.html.StyleSheetTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.html.StyleSheet
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StyleSheetClassTests<SUT extends javax.swing.text.html.StyleSheet>
extends org.j8unit.repository.javax.swing.text.StyleContextClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.StyleSheet.BoxPainter class
     * javax.swing.text.html.StyleSheet$BoxPainter}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.StyleSheetTests.BoxPainterTests}.
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
     * @see org.j8unit.repository.javax.swing.text.html.StyleSheetTests.BoxPainterTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.html.StyleSheet.BoxPainter
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BoxPainterClassTests<SUT extends javax.swing.text.html.StyleSheet.BoxPainter>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.html.StyleSheet.BoxPainter#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.StyleSheet.BoxPainter.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.StyleSheet.ListPainter class
     * javax.swing.text.html.StyleSheet$ListPainter}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.StyleSheetTests.ListPainterTests}.
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
     * @see org.j8unit.repository.javax.swing.text.html.StyleSheetTests.ListPainterTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.html.StyleSheet.ListPainter
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ListPainterClassTests<SUT extends javax.swing.text.html.StyleSheet.ListPainter>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.html.StyleSheet.ListPainter#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.StyleSheet.ListPainter.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.StyleSheet#StyleSheet() public javax.swing.text.html.StyleSheet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.StyleSheet#StyleSheet()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StyleSheet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.html.StyleSheet sut = null; // = new StyleSheet();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.StyleSheet#getIndexOfSize(float) public static int
     * javax.swing.text.html.StyleSheet.getIndexOfSize(float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.StyleSheet#getIndexOfSize(float)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIndexOfSize_float()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.text.html.StyleSheet#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.html.StyleSheet.class.isAssignableFrom(sut));
    }

}
