package org.j8unit.repository.java.security;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.SecureRandom class java.security.SecureRandom}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.security.SecureRandomTests}.
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
 * @see org.j8unit.repository.java.security.SecureRandomTests
 */
@Category(J8UnitRepository.class)
public abstract interface SecureRandomClassTests<SUT extends Class<? extends java.security.SecureRandom>>
extends org.j8unit.repository.java.util.RandomClassTests<SUT> {

    /**
     * Test method for {@link java.security.SecureRandom#SecureRandom(byte[]) public java.security.SecureRandom(byte[])}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SecureRandom_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.SecureRandom sut = null; // = new SecureRandom(byte[]);
    }

    /**
     * Test method for {@link java.security.SecureRandom#SecureRandom() public java.security.SecureRandom()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SecureRandom()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.SecureRandom sut = null; // = new SecureRandom();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.security.SecureRandom> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.SecureRandom.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#getSeed(int) public static byte[]
     * java.security.SecureRandom.getSeed(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSeed_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#getInstanceStrong() public static java.security.SecureRandom
     * java.security.SecureRandom.getInstanceStrong() throws java.security.NoSuchAlgorithmException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstanceStrong()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#getInstance(java.lang.String,java.security.Provider) public
     * static java.security.SecureRandom java.security.SecureRandom.getInstance(java.lang.String,java.security.Provider)
     * throws java.security.NoSuchAlgorithmException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_Provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#getInstance(java.lang.String,java.lang.String) public static
     * java.security.SecureRandom java.security.SecureRandom.getInstance(java.lang.String,java.lang.String) throws
     * java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#getInstance(java.lang.String) public static
     * java.security.SecureRandom java.security.SecureRandom.getInstance(java.lang.String) throws
     * java.security.NoSuchAlgorithmException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
