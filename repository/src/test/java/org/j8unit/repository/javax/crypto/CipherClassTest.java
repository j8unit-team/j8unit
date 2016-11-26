package org.j8unit.repository.javax.crypto;

import javax.crypto.Cipher;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Cipher} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.crypto.CipherClassTests}).
 */
@RunWith(J8Unit4.class)
public class CipherClassTest
implements CipherClassTests<Cipher> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.Cipher]

    @Override
    public Class<Cipher> createNewSUT() {
        return Cipher.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.Cipher#getMaxAllowedKeyLength(String)
     * public static final int javax.crypto.Cipher.getMaxAllowedKeyLength(java.lang.String) throws
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
    public void test_getMaxAllowedKeyLength_String()
    throws Exception {
        // write some test for {@link javax.crypto.Cipher#getMaxAllowedKeyLength(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.Cipher#getInstance(String, java.security.Provider) public static final javax.crypto.Cipher
     * javax.crypto.Cipher.getInstance(java.lang.String,java.security.Provider) throws
     * java.security.NoSuchAlgorithmException,javax.crypto.NoSuchPaddingException}.
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
        // write some test for {@link javax.crypto.Cipher#getInstance(String, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.Cipher#getInstance(String) public
     * static final javax.crypto.Cipher javax.crypto.Cipher.getInstance(java.lang.String) throws
     * java.security.NoSuchAlgorithmException,javax.crypto.NoSuchPaddingException}.
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
        // write some test for {@link javax.crypto.Cipher#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.Cipher#getInstance(String, String)
     * public static final javax.crypto.Cipher javax.crypto.Cipher.getInstance(java.lang.String,java.lang.String) throws
     * java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException,javax.crypto.NoSuchPaddingException}.
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
        // write some test for {@link javax.crypto.Cipher#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.Cipher#getMaxAllowedParameterSpec(String) public static final
     * java.security.spec.AlgorithmParameterSpec javax.crypto.Cipher.getMaxAllowedParameterSpec(java.lang.String) throws
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
    public void test_getMaxAllowedParameterSpec_String()
    throws Exception {
        // write some test for {@link javax.crypto.Cipher#getMaxAllowedParameterSpec(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.Cipher]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.Cipher]

}
