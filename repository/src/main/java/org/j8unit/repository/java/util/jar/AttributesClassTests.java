package org.j8unit.repository.java.util.jar;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.jar.Attributes class java.util.jar.Attributes}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.jar.AttributesTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.jar.AttributesTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributesClassTests<SUT extends java.util.jar.Attributes>
extends org.j8unit.repository.java.util.MapClassTests<SUT, java.lang.Object, java.lang.Object>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.jar.Attributes$Name class java.util.jar.Attributes$Name}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.jar.AttributesTests.NameTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.jar.AttributesTests.NameTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface NameClassTests<SUT extends java.util.jar.Attributes.Name>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.jar.Attributes.Name#Name(java.lang.String) public
         * java.util.jar.Attributes$Name(java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Name_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.jar.Attributes.Name sut = null; // = new Name(java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.jar.Attributes.Name.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.util.jar.Attributes#Attributes() public java.util.jar.Attributes()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Attributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.jar.Attributes sut = null; // = new Attributes();
    }

    /**
     * Test method for {@link java.util.jar.Attributes#Attributes(java.util.jar.Attributes) public
     * java.util.jar.Attributes(java.util.jar.Attributes)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Attributes_Attributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.jar.Attributes sut = null; // = new Attributes(java.util.jar.Attributes);
    }

    /**
     * Test method for {@link java.util.jar.Attributes#Attributes(int) public java.util.jar.Attributes(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Attributes_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.jar.Attributes sut = null; // = new Attributes(int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.jar.Attributes.class.isAssignableFrom(sut));
    }

}
