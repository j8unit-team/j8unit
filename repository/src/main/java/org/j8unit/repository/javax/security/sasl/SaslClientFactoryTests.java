package org.j8unit.repository.javax.security.sasl;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.sasl.SaslClientFactory interface
 * javax.security.sasl.SaslClientFactory}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SaslClientFactoryClassTests}.
 * </p>
 *
 * @see javax.security.sasl.SaslClientFactory interface javax.security.sasl.SaslClientFactory (the hereby targeted
 *      class-under-test class)
 * @see SaslClientFactoryClassTests SaslClientFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SaslClientFactoryTests<SUT extends javax.security.sasl.SaslClientFactory>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.security.sasl.SaslClientFactory#createSaslClient(String[], String, String, String, java.util.Map, javax.security.auth.callback.CallbackHandler)
     * public abstract javax.security.sasl.SaslClient
     * javax.security.sasl.SaslClientFactory.createSaslClient(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,
     * ?>,javax.security.auth.callback.CallbackHandler) throws javax.security.sasl.SaslException}.
     *
     * <p>
     * Test method for
     * {@link javax.security.sasl.SaslClientFactory#createSaslClient(String[], String, String, String, java.util.Map, javax.security.auth.callback.CallbackHandler)
     * public abstract javax.security.sasl.SaslClient
     * javax.security.sasl.SaslClientFactory.createSaslClient(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.util.Map,javax.security.auth.callback.CallbackHandler)
     * throws javax.security.sasl.SaslException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslClientFactory#createSaslClient(String[], String, String, String, java.util.Map,
     *      javax.security.auth.callback.CallbackHandler) public abstract javax.security.sasl.SaslClient
     *      javax.security.sasl.SaslClientFactory.createSaslClient(java.lang.String[],java.lang.String,java.lang.String,
     *      java.lang.String,java.util.Map,javax.security.auth.callback.CallbackHandler) throws
     *      javax.security.sasl.SaslException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSaslClient_StringArray_String_String_String_Map_CallbackHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslClientFactory#getMechanismNames(java.util.Map) public abstract
     * java.lang.String[] javax.security.sasl.SaslClientFactory.getMechanismNames(java.util.Map<java.lang.String, ?>)}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslClientFactory#getMechanismNames(java.util.Map) public abstract
     * java.lang.String[] javax.security.sasl.SaslClientFactory.getMechanismNames(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslClientFactory#getMechanismNames(java.util.Map) public abstract java.lang.String[]
     *      javax.security.sasl.SaslClientFactory.getMechanismNames(java.util.Map) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMechanismNames_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
