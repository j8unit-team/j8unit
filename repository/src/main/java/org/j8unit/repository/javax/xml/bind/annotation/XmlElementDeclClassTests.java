package org.j8unit.repository.javax.xml.bind.annotation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.annotation.XmlElementDecl interface
 * javax.xml.bind.annotation.XmlElementDecl}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclTests}.
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
 * @see org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.annotation.XmlElementDecl
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlElementDeclClassTests<SUT extends javax.xml.bind.annotation.XmlElementDecl>
extends org.j8unit.repository.java.lang.annotation.AnnotationClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.xml.bind.annotation.XmlElementDecl.GLOBAL class
     * javax.xml.bind.annotation.XmlElementDecl$GLOBAL}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclTests.GLOBALTests}.
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
     * @see org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclTests.GLOBALTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.xml.bind.annotation.XmlElementDecl.GLOBAL
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface GLOBALClassTests<SUT extends javax.xml.bind.annotation.XmlElementDecl.GLOBAL>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.bind.annotation.XmlElementDecl.GLOBAL#GLOBAL() public
         * javax.xml.bind.annotation.XmlElementDecl$GLOBAL()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.xml.bind.annotation.XmlElementDecl.GLOBAL#GLOBAL()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_GLOBAL()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.xml.bind.annotation.XmlElementDecl.GLOBAL sut = null; // = new GLOBAL();
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.xml.bind.annotation.XmlElementDecl.GLOBAL#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.xml.bind.annotation.XmlElementDecl.GLOBAL.class.isAssignableFrom(sut));
        }

    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.xml.bind.annotation.XmlElementDecl#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.bind.annotation.XmlElementDecl.class.isAssignableFrom(sut));
    }

}
