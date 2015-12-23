package org.j8unit.repository.java.awt.font;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.font.TextLayout class java.awt.font.TextLayout}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.font.TextLayoutTests}.
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
 * @see org.j8unit.repository.java.awt.font.TextLayoutTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.font.TextLayout
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextLayoutClassTests<SUT extends java.awt.font.TextLayout>
extends org.j8unit.repository.java.lang.CloneableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.awt.font.TextLayout.CaretPolicy class
     * java.awt.font.TextLayout$CaretPolicy}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.font.TextLayoutTests.CaretPolicyTests}.
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
     * @see org.j8unit.repository.java.awt.font.TextLayoutTests.CaretPolicyTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.awt.font.TextLayout.CaretPolicy
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CaretPolicyClassTests<SUT extends java.awt.font.TextLayout.CaretPolicy>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.awt.font.TextLayout.CaretPolicy#CaretPolicy() public
         * java.awt.font.TextLayout$CaretPolicy()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.font.TextLayout.CaretPolicy#CaretPolicy()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CaretPolicy()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.font.TextLayout.CaretPolicy sut = null; // = new CaretPolicy();
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.awt.font.TextLayout.CaretPolicy#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.font.TextLayout.CaretPolicy.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.font.TextLayout#TextLayout(java.text.AttributedCharacterIterator, java.awt.font.FontRenderContext)
     * public java.awt.font.TextLayout(java.text.AttributedCharacterIterator,java.awt.font.FontRenderContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.font.TextLayout#TextLayout(java.text.AttributedCharacterIterator,
     *             java.awt.font.FontRenderContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TextLayout_AttributedCharacterIterator_FontRenderContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.font.TextLayout sut = null; // = new TextLayout(java.text.AttributedCharacterIterator,
                                                   // java.awt.font.FontRenderContext);
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.font.TextLayout#TextLayout(java.lang.String, java.awt.Font, java.awt.font.FontRenderContext)
     * public java.awt.font.TextLayout(java.lang.String,java.awt.Font,java.awt.font.FontRenderContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.font.TextLayout#TextLayout(java.lang.String, java.awt.Font, java.awt.font.FontRenderContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TextLayout_String_Font_FontRenderContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.font.TextLayout sut = null; // = new TextLayout(java.lang.String, java.awt.Font,
                                                   // java.awt.font.FontRenderContext);
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.font.TextLayout#TextLayout(java.lang.String, java.util.Map, java.awt.font.FontRenderContext)
     * public java.awt.font.TextLayout(java.lang.String,java.util.Map,java.awt.font.FontRenderContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.font.TextLayout#TextLayout(java.lang.String, java.util.Map, java.awt.font.FontRenderContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TextLayout_String_Map_FontRenderContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.font.TextLayout sut = null; // = new TextLayout(java.lang.String, java.util.Map,
                                                   // java.awt.font.FontRenderContext);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.awt.font.TextLayout#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.font.TextLayout.class.isAssignableFrom(sut));
    }

}
