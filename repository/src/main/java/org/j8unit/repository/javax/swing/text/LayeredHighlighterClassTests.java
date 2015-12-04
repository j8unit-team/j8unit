package org.j8unit.repository.javax.swing.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.LayeredHighlighter class javax.swing.text.LayeredHighlighter},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.text.LayeredHighlighterTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.LayeredHighlighterTests
 */
@Category(J8UnitRepository.class)
public abstract interface LayeredHighlighterClassTests<SUT extends Class<? extends javax.swing.text.LayeredHighlighter>>
extends org.j8unit.repository.javax.swing.text.HighlighterClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.text.LayeredHighlighter#LayeredHighlighter() public javax.swing.text.LayeredHighlighter()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LayeredHighlighter() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.text.LayeredHighlighter sut = null; // = new LayeredHighlighter();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.text.LayeredHighlighter> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.LayeredHighlighter.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.LayeredHighlighter$LayerPainter class javax.swing.text.LayeredHighlighter$LayerPainter},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.LayeredHighlighterTests.LayerPainterTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.LayeredHighlighterTests.LayerPainterTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LayerPainterClassTests<SUT extends Class<? extends javax.swing.text.LayeredHighlighter.LayerPainter>>
    extends org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightPainterClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.LayeredHighlighter.LayerPainter#LayerPainter() public javax.swing.text.LayeredHighlighter$LayerPainter()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_LayerPainter() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.LayeredHighlighter.LayerPainter sut = null; // = new LayerPainter();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.LayeredHighlighter.LayerPainter> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.LayeredHighlighter.LayerPainter.class.isAssignableFrom(sut));
        }

    }

}
