package org.j8unit.repository.java.security;

import java.security.KeyPairGenerator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyPairGeneratorClassTest
implements org.j8unit.repository.java.security.KeyPairGeneratorClassTests<KeyPairGenerator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.KeyPairGenerator]

    @Override
    public Class<KeyPairGenerator> createNewSUT() {
        return KeyPairGenerator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.KeyPairGenerator#getInstance(String, java.security.Provider) public static
     * java.security.KeyPairGenerator
     * java.security.KeyPairGenerator.getInstance(java.lang.String,java.security.Provider) throws
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
        // write some test for {@link java.security.KeyPairGenerator#getInstance(String, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.KeyPairGenerator#getInstance(String, String) public static java.security.KeyPairGenerator
     * java.security.KeyPairGenerator.getInstance(java.lang.String,java.lang.String) throws
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
        // write some test for {@link java.security.KeyPairGenerator#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.KeyPairGenerator#getInstance(String)
     * public static java.security.KeyPairGenerator java.security.KeyPairGenerator.getInstance(java.lang.String) throws
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
        // write some test for {@link java.security.KeyPairGenerator#getInstance(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.KeyPairGenerator]

}
