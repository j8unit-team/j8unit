package org.j8unit.repository.java.security;

import static org.junit.Assert.fail;
import java.security.Policy;
import java.security.Policy.Parameters;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Policy} (by simply reusing the J8Unit
 * test interface {@link PolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class PolicyClassTest
implements PolicyClassTests<Policy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Policy]

    @Override
    public Class<Policy> createNewSUT() {
        return Policy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.security.Policy#Policy() public
     * java.security.Policy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_Policy()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Policy#setPolicy(java.security.Policy)
     * public static void java.security.Policy.setPolicy(java.security.Policy)}.
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
    public void test_setPolicy_Policy()
    throws Exception {
        // write some test for {@link java.security.Policy#setPolicy(java.security.Policy)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.Policy#getPolicy() public static
     * java.security.Policy java.security.Policy.getPolicy()}.
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
    public void test_getPolicy()
    throws Exception {
        // write some test for {@link java.security.Policy#getPolicy()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.Policy#getInstance(String, java.security.Policy.Parameters, String) public static
     * java.security.Policy
     * java.security.Policy.getInstance(java.lang.String,java.security.Policy$Parameters,java.lang.String) throws
     * java.security.NoSuchProviderException,java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String_Parameters_String()
    throws Exception {
        // write some test for {@link java.security.Policy#getInstance(String, java.security.Policy.Parameters, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.Policy#getInstance(String, java.security.Policy.Parameters) public static
     * java.security.Policy java.security.Policy.getInstance(java.lang.String,java.security.Policy$Parameters) throws
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
    public void test_getInstance_String_Parameters()
    throws Exception {
        // write some test for {@link java.security.Policy#getInstance(String, java.security.Policy.Parameters)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.Policy#getInstance(String, java.security.Policy.Parameters, java.security.Provider) public
     * static java.security.Policy
     * java.security.Policy.getInstance(java.lang.String,java.security.Policy$Parameters,java.security.Provider) throws
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
    public void test_getInstance_String_Parameters_Provider()
    throws Exception {
        // write some test for {@link java.security.Policy#getInstance(String, java.security.Policy.Parameters,
        // java.security.Provider)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Policy]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Policy]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Parameters} (by simply reusing the
     * J8Unit test interface {@link ParametersClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ParametersClassTest
    implements ParametersClassTests<Parameters> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Policy$Parameters]

        @Override
        public Class<Parameters> createNewSUT() {
            return Parameters.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Policy$Parameters]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Policy$Parameters]

    }

}
