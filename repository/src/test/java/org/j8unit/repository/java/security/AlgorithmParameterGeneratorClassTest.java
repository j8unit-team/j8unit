package org.j8unit.repository.java.security;

import java.security.AlgorithmParameterGenerator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AlgorithmParameterGenerator} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.AlgorithmParameterGeneratorClassTests}).
 */
@RunWith(J8Unit4.class)
public class AlgorithmParameterGeneratorClassTest
implements AlgorithmParameterGeneratorClassTests<AlgorithmParameterGenerator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AlgorithmParameterGenerator]

    @Override
    public Class<AlgorithmParameterGenerator> createNewSUT() {
        return AlgorithmParameterGenerator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AlgorithmParameterGenerator#getInstance(String, String) public static
     * java.security.AlgorithmParameterGenerator
     * java.security.AlgorithmParameterGenerator.getInstance(java.lang.String,java.lang.String) throws
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
        // write some test for {@link java.security.AlgorithmParameterGenerator#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AlgorithmParameterGenerator#getInstance(String) public static
     * java.security.AlgorithmParameterGenerator java.security.AlgorithmParameterGenerator.getInstance(java.lang.String)
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
    public void test_getInstance_String()
    throws Exception {
        // write some test for {@link java.security.AlgorithmParameterGenerator#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AlgorithmParameterGenerator#getInstance(String, java.security.Provider) public static
     * java.security.AlgorithmParameterGenerator
     * java.security.AlgorithmParameterGenerator.getInstance(java.lang.String,java.security.Provider) throws
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
        // write some test for {@link java.security.AlgorithmParameterGenerator#getInstance(String,
        // java.security.Provider)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.AlgorithmParameterGenerator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AlgorithmParameterGenerator]

}
