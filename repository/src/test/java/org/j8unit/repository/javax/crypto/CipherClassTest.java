package org.j8unit.repository.javax.crypto;

import java.security.Provider;
import javax.crypto.Cipher;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CipherClassTest
implements org.j8unit.repository.javax.crypto.CipherClassTests<Cipher> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.Cipher]

    @Override
    public Class<Cipher> createNewSUT() {
        return Cipher.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Cipher#getMaxAllowedKeyLength(String) public static
     * final int javax.crypto.Cipher.getMaxAllowedKeyLength(java.lang.String) throws
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
        // write some test for {@link Cipher#getMaxAllowedKeyLength(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Cipher#getInstance(String, String) public static
     * final javax.crypto.Cipher javax.crypto.Cipher.getInstance(java.lang.String,java.lang.String) throws
     * java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException,javax.crypto.NoSuchPaddingException}
     * .
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
        // write some test for {@link Cipher#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Cipher#getInstance(String) public static final
     * javax.crypto.Cipher javax.crypto.Cipher.getInstance(java.lang.String) throws
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
        // write some test for {@link Cipher#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Cipher#getInstance(String, Provider) public static
     * final javax.crypto.Cipher javax.crypto.Cipher.getInstance(java.lang.String,java.security.Provider) throws
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
        // write some test for {@link Cipher#getInstance(String, Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Cipher#getMaxAllowedParameterSpec(String) public
     * static final java.security.spec.AlgorithmParameterSpec
     * javax.crypto.Cipher.getMaxAllowedParameterSpec(java.lang.String) throws java.security.NoSuchAlgorithmException}.
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
        // write some test for {@link Cipher#getMaxAllowedParameterSpec(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.Cipher]

}
