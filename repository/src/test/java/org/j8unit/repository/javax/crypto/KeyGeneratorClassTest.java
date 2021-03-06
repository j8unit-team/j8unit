package org.j8unit.repository.javax.crypto;

import javax.crypto.KeyGenerator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyGenerator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.KeyGeneratorClassTests}).
 */
@RunWith(J8Unit4.class)
public class KeyGeneratorClassTest
implements KeyGeneratorClassTests<KeyGenerator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.KeyGenerator]

    @Override
    public Class<KeyGenerator> createNewSUT() {
        return KeyGenerator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.KeyGenerator#getInstance(String, java.security.Provider) public static final
     * javax.crypto.KeyGenerator javax.crypto.KeyGenerator.getInstance(java.lang.String,java.security.Provider) throws
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
        // write some test for {@link javax.crypto.KeyGenerator#getInstance(String, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.KeyGenerator#getInstance(String) public
     * static final javax.crypto.KeyGenerator javax.crypto.KeyGenerator.getInstance(java.lang.String) throws
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
        // write some test for {@link javax.crypto.KeyGenerator#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.crypto.KeyGenerator#getInstance(String, String) public static final javax.crypto.KeyGenerator
     * javax.crypto.KeyGenerator.getInstance(java.lang.String,java.lang.String) throws
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
        // write some test for {@link javax.crypto.KeyGenerator#getInstance(String, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.KeyGenerator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.KeyGenerator]

}
