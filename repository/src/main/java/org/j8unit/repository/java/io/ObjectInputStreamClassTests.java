package org.j8unit.repository.java.io;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.io.ObjectInputStream class java.io.ObjectInputStream}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.io.ObjectInputStreamTests}.
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
 * @see org.j8unit.repository.java.io.ObjectInputStreamTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectInputStreamClassTests<SUT extends java.io.ObjectInputStream>
extends org.j8unit.repository.java.io.ObjectInputClassTests<SUT>, org.j8unit.repository.java.io.ObjectStreamConstantsClassTests<SUT>,
org.j8unit.repository.java.io.InputStreamClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.io.ObjectInputStream$GetField class java.io.ObjectInputStream$GetField}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.io.ObjectInputStreamTests.GetFieldTests}.
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
     * @see org.j8unit.repository.java.io.ObjectInputStreamTests.GetFieldTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface GetFieldClassTests<SUT extends java.io.ObjectInputStream.GetField>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.io.ObjectInputStream.GetField#GetField() public
         * java.io.ObjectInputStream$GetField()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_GetField()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.io.ObjectInputStream.GetField sut = null; // = new GetField();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.io.ObjectInputStream.GetField.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.io.ObjectInputStream#ObjectInputStream(java.io.InputStream) public
     * java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ObjectInputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.ObjectInputStream sut = null; // = new ObjectInputStream(java.io.InputStream);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.io.ObjectInputStream.class.isAssignableFrom(sut));
    }

}
