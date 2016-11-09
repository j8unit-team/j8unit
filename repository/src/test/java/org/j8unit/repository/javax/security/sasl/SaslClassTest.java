package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.Sasl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Sasl} (by simply reusing the J8Unit test
 * interface {@link SaslClassTests}).
 */

@RunWith(J8Unit4.class)
public class SaslClassTest
implements SaslClassTests<Sasl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.Sasl]

    @Override
    public Class<Sasl> createNewSUT() {
        return Sasl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.security.sasl.Sasl#getSaslClientFactories()
     * public static java.util.Enumeration<javax.security.sasl.SaslClientFactory>
     * javax.security.sasl.Sasl.getSaslClientFactories()}.
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
    public void test_getSaslClientFactories()
    throws Exception {
        // write some test for {@link javax.security.sasl.Sasl#getSaslClientFactories()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.sasl.Sasl#createSaslServer(String, String, String, java.util.Map, javax.security.auth.callback.CallbackHandler)
     * public static javax.security.sasl.SaslServer
     * javax.security.sasl.Sasl.createSaslServer(java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,
     * ?>,javax.security.auth.callback.CallbackHandler) throws javax.security.sasl.SaslException}.
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
    public void test_createSaslServer_String_String_String_Map_CallbackHandler()
    throws Exception {
        // write some test for {@link javax.security.sasl.Sasl#createSaslServer(String, String, String, java.util.Map,
        // javax.security.auth.callback.CallbackHandler)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.security.sasl.Sasl#getSaslServerFactories()
     * public static java.util.Enumeration<javax.security.sasl.SaslServerFactory>
     * javax.security.sasl.Sasl.getSaslServerFactories()}.
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
    public void test_getSaslServerFactories()
    throws Exception {
        // write some test for {@link javax.security.sasl.Sasl#getSaslServerFactories()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.sasl.Sasl#createSaslClient(String[], String, String, String, java.util.Map, javax.security.auth.callback.CallbackHandler)
     * public static javax.security.sasl.SaslClient
     * javax.security.sasl.Sasl.createSaslClient(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,
     * ?>,javax.security.auth.callback.CallbackHandler) throws javax.security.sasl.SaslException}.
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
    public void test_createSaslClient_StringArray_String_String_String_Map_CallbackHandler()
    throws Exception {
        // write some test for {@link javax.security.sasl.Sasl#createSaslClient(String[], String, String, String,
        // java.util.Map, javax.security.auth.callback.CallbackHandler)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.sasl.Sasl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.Sasl]

}
