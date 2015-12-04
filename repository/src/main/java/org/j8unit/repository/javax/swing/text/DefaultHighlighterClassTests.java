package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.DefaultHighlighter class javax.swing.text.DefaultHighlighter}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.DefaultHighlighterTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.DefaultHighlighterTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultHighlighterClassTests<SUT extends Class<? extends javax.swing.text.DefaultHighlighter>>
extends org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultHighlighter$DefaultHighlightPainter class
     * javax.swing.text.DefaultHighlighter$DefaultHighlightPainter}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.DefaultHighlighterTests.DefaultHighlightPainterTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.DefaultHighlighterTests.DefaultHighlightPainterTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultHighlightPainterClassTests<SUT extends Class<? extends javax.swing.text.DefaultHighlighter.DefaultHighlightPainter>>
    extends org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests.LayerPainterClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.text.DefaultHighlighter.DefaultHighlightPainter#DefaultHighlightPainter(java.awt.Color)
         * public javax.swing.text.DefaultHighlighter$DefaultHighlightPainter(java.awt.Color)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DefaultHighlightPainter_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.DefaultHighlighter.DefaultHighlightPainter sut = null; // = new
                                                                                          // DefaultHighlightPainter(java.awt.Color);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.text.DefaultHighlighter.DefaultHighlightPainter> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.DefaultHighlighter.DefaultHighlightPainter.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.text.DefaultHighlighter#DefaultHighlighter() public
     * javax.swing.text.DefaultHighlighter()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultHighlighter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.DefaultHighlighter sut = null; // = new DefaultHighlighter();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.text.DefaultHighlighter> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.DefaultHighlighter.class.isAssignableFrom(sut));
    }

}
