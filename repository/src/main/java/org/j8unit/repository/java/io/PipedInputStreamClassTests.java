package org.j8unit.repository.java.io;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.io.PipedInputStream class java.io.PipedInputStream}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.io.PipedInputStreamTests}.
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
 * @see org.j8unit.repository.java.io.PipedInputStreamTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PipedInputStreamClassTests<SUT extends Class<? extends java.io.PipedInputStream>>
extends org.j8unit.repository.java.io.InputStreamClassTests<SUT> {

    /**
     * Test method for {@link java.io.PipedInputStream#PipedInputStream() public java.io.PipedInputStream()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedInputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PipedInputStream sut = null; // = new PipedInputStream();
    }

    /**
     * Test method for {@link java.io.PipedInputStream#PipedInputStream(int) public java.io.PipedInputStream(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedInputStream_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PipedInputStream sut = null; // = new PipedInputStream(int);
    }

    /**
     * Test method for {@link java.io.PipedInputStream#PipedInputStream(java.io.PipedOutputStream) public
     * java.io.PipedInputStream(java.io.PipedOutputStream) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedInputStream_PipedOutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PipedInputStream sut = null; // = new PipedInputStream(java.io.PipedOutputStream);
    }

    /**
     * Test method for {@link java.io.PipedInputStream#PipedInputStream(java.io.PipedOutputStream,int) public
     * java.io.PipedInputStream(java.io.PipedOutputStream,int) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PipedInputStream_PipedOutputStream_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.io.PipedInputStream sut = null; // = new PipedInputStream(java.io.PipedOutputStream,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.io.PipedInputStream> sut = createNewSUT();
        // assert assignability
        assertTrue(java.io.PipedInputStream.class.isAssignableFrom(sut));
    }

}
