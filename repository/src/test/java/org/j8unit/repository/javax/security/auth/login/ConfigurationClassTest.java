package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.Configuration;
import javax.security.auth.login.Configuration.Parameters;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Configuration} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.login.ConfigurationClassTests}).
 */
@RunWith(J8Unit4.class)
public class ConfigurationClassTest
implements ConfigurationClassTests<Configuration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.Configuration]

    @Override
    public Class<Configuration> createNewSUT() {
        return Configuration.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.login.Configuration#setConfiguration(javax.security.auth.login.Configuration) public
     * static void javax.security.auth.login.Configuration.setConfiguration(javax.security.auth.login.Configuration)}.
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
    public void test_setConfiguration_Configuration()
    throws Exception {
        // write some test for {@link
        // javax.security.auth.login.Configuration#setConfiguration(javax.security.auth.login.Configuration)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.login.Configuration#getInstance(String, javax.security.auth.login.Configuration.Parameters)
     * public static javax.security.auth.login.Configuration
     * javax.security.auth.login.Configuration.getInstance(java.lang.String,javax.security.auth.login.Configuration$Parameters)
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
    public void test_getInstance_String_Parameters()
    throws Exception {
        // write some test for {@link javax.security.auth.login.Configuration#getInstance(String,
        // javax.security.auth.login.Configuration.Parameters)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.login.Configuration#getInstance(String, javax.security.auth.login.Configuration.Parameters, java.security.Provider)
     * public static javax.security.auth.login.Configuration
     * javax.security.auth.login.Configuration.getInstance(java.lang.String,javax.security.auth.login.Configuration$Parameters,java.security.Provider)
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
    public void test_getInstance_String_Parameters_Provider()
    throws Exception {
        // write some test for {@link javax.security.auth.login.Configuration#getInstance(String,
        // javax.security.auth.login.Configuration.Parameters, java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.login.Configuration#getInstance(String, javax.security.auth.login.Configuration.Parameters, String)
     * public static javax.security.auth.login.Configuration
     * javax.security.auth.login.Configuration.getInstance(java.lang.String,javax.security.auth.login.Configuration$Parameters,java.lang.String)
     * throws java.security.NoSuchProviderException,java.security.NoSuchAlgorithmException}.
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
        // write some test for {@link javax.security.auth.login.Configuration#getInstance(String,
        // javax.security.auth.login.Configuration.Parameters, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.login.Configuration#getConfiguration() public static
     * javax.security.auth.login.Configuration javax.security.auth.login.Configuration.getConfiguration()}.
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
    public void test_getConfiguration()
    throws Exception {
        // write some test for {@link javax.security.auth.login.Configuration#getConfiguration()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.login.Configuration]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.Configuration]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Parameters} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.security.auth.login.ConfigurationClassTests.ParametersClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ParametersClassTest
    implements ParametersClassTests<Parameters> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.Configuration$Parameters]

        @Override
        public Class<Parameters> createNewSUT() {
            return Parameters.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.login.Configuration$Parameters]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.Configuration$Parameters]

    }

}
