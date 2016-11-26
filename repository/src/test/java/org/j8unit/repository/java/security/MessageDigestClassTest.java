package org.j8unit.repository.java.security;

import java.security.MessageDigest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MessageDigest} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.MessageDigestClassTests}).
 */
@RunWith(J8Unit4.class)
public class MessageDigestClassTest
implements MessageDigestClassTests<MessageDigest> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.MessageDigest]

    @Override
    public Class<MessageDigest> createNewSUT() {
        return MessageDigest.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.MessageDigest#isEqual(byte[], byte[])
     * public static boolean java.security.MessageDigest.isEqual(byte[],byte[])}.
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
    public void test_isEqual_byteArray_byteArray()
    throws Exception {
        // write some test for {@link java.security.MessageDigest#isEqual(byte[], byte[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.MessageDigest#getInstance(String)
     * public static java.security.MessageDigest java.security.MessageDigest.getInstance(java.lang.String) throws
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
        // write some test for {@link java.security.MessageDigest#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.MessageDigest#getInstance(String, String) public static java.security.MessageDigest
     * java.security.MessageDigest.getInstance(java.lang.String,java.lang.String) throws
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
        // write some test for {@link java.security.MessageDigest#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.MessageDigest#getInstance(String, java.security.Provider) public static
     * java.security.MessageDigest java.security.MessageDigest.getInstance(java.lang.String,java.security.Provider)
     * throws java.security.NoSuchAlgorithmException}.
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
        // write some test for {@link java.security.MessageDigest#getInstance(String, java.security.Provider)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.MessageDigest]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.MessageDigest]

}
