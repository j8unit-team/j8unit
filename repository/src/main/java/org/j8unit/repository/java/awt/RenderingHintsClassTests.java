package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.RenderingHints class java.awt.RenderingHints}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.RenderingHintsTests}.
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
 * @see org.j8unit.repository.java.awt.RenderingHintsTests
 */
@Category(J8UnitRepository.class)
public abstract interface RenderingHintsClassTests<SUT extends Class<? extends java.awt.RenderingHints>>
extends org.j8unit.repository.java.util.MapClassTests<SUT, java.lang.Object, java.lang.Object>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.awt.RenderingHints#RenderingHints(java.util.Map) public
     * java.awt.RenderingHints(java.util.Map)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RenderingHints_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.RenderingHints sut = null; // = new RenderingHints(java.util.Map);
    }

    /**
     * Test method for {@link java.awt.RenderingHints#RenderingHints(java.awt.RenderingHints.Key,java.lang.Object)
     * public java.awt.RenderingHints(java.awt.RenderingHints$Key,java.lang.Object)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RenderingHints_Key_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.RenderingHints sut = null; // = new RenderingHints(java.awt.RenderingHints.Key,java.lang.Object);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.RenderingHints> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.RenderingHints.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link java.awt.RenderingHints$Key class java.awt.RenderingHints$Key}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.RenderingHintsTests.KeyTests}.
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
     * @see org.j8unit.repository.java.awt.RenderingHintsTests.KeyTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KeyClassTests<SUT extends Class<? extends java.awt.RenderingHints.Key>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.RenderingHints.Key> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.RenderingHints.Key.class.isAssignableFrom(sut));
        }

    }

}
