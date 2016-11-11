package org.j8unit.repository.java.security;

import java.security.SecureRandom;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SecureRandom} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.SecureRandomClassTests}).
 */

@RunWith(J8Unit4.class)
public class SecureRandomClassTest
implements SecureRandomClassTests<SecureRandom> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.SecureRandom]

    @Override
    public Class<SecureRandom> createNewSUT() {
        return SecureRandom.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.security.SecureRandom#SecureRandom(byte[])
     * public java.security.SecureRandom(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_SecureRandom_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SecureRandom sut = null; // = new SecureRandom(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.security.SecureRandom#SecureRandom()
     * public java.security.SecureRandom()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_SecureRandom()
    throws Exception {
        // create new instance
        final SecureRandom sut = new SecureRandom();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.SecureRandom#getSeed(int) public
     * static byte[] java.security.SecureRandom.getSeed(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getSeed_int()
    throws Exception {
        // write some test for {@link java.security.SecureRandom#getSeed(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.SecureRandom#getInstanceStrong()
     * public static java.security.SecureRandom java.security.SecureRandom.getInstanceStrong() throws
     * java.security.NoSuchAlgorithmException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getInstanceStrong()
    throws Exception {
        // write some test for {@link java.security.SecureRandom#getInstanceStrong()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.SecureRandom#getInstance(String)
     * public static java.security.SecureRandom java.security.SecureRandom.getInstance(java.lang.String) throws
     * java.security.NoSuchAlgorithmException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getInstance_String()
    throws Exception {
        // write some test for {@link java.security.SecureRandom#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.SecureRandom#getInstance(String, java.security.Provider) public static
     * java.security.SecureRandom java.security.SecureRandom.getInstance(java.lang.String,java.security.Provider) throws
     * java.security.NoSuchAlgorithmException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getInstance_String_Provider()
    throws Exception {
        // write some test for {@link java.security.SecureRandom#getInstance(String, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.SecureRandom#getInstance(String, String) public static java.security.SecureRandom
     * java.security.SecureRandom.getInstance(java.lang.String,java.lang.String) throws
     * java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getInstance_String_String()
    throws Exception {
        // write some test for {@link java.security.SecureRandom#getInstance(String, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.SecureRandom]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.SecureRandom]

}
