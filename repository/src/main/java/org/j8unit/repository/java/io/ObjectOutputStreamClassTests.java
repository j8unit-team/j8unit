package org.j8unit.repository.java.io;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.io.ObjectOutputStream class java.io.ObjectOutputStream}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.io.ObjectOutputStreamTests}.
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
 * @see org.j8unit.repository.java.io.ObjectOutputStreamTests
 */
@Category(J8UnitRepository.class)
public abstract interface ObjectOutputStreamClassTests<SUT extends Class<? extends java.io.ObjectOutputStream>>
extends org.j8unit.repository.java.io.ObjectOutputClassTests<SUT>, org.j8unit.repository.java.io.ObjectStreamConstantsClassTests<SUT>,
org.j8unit.repository.java.io.OutputStreamClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.io.ObjectOutputStream$PutField class java.io.ObjectOutputStream$PutField}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.io.ObjectOutputStreamTests.PutFieldTests}.
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
     * @see org.j8unit.repository.java.io.ObjectOutputStreamTests.PutFieldTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PutFieldClassTests<SUT extends Class<? extends java.io.ObjectOutputStream.PutField>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.io.ObjectOutputStream.PutField#PutField() public
         * java.io.ObjectOutputStream$PutField()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PutField()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.io.ObjectOutputStream.PutField sut = null; // = new PutField();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.io.ObjectOutputStream.PutField> sut = createNewSUT();
            // assert assignability
            assertTrue(java.io.ObjectOutputStream.PutField.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.io.ObjectOutputStream#ObjectOutputStream(java.io.OutputStream) public
     * java.io.ObjectOutputStream(java.io.OutputStream) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ObjectOutputStream_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.ObjectOutputStream sut = null; // = new ObjectOutputStream(java.io.OutputStream);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.io.ObjectOutputStream> sut = createNewSUT();
        // assert assignability
        assertTrue(java.io.ObjectOutputStream.class.isAssignableFrom(sut));
    }

}
