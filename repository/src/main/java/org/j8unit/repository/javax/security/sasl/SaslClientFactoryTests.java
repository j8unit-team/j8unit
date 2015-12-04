package org.j8unit.repository.javax.security.sasl;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.sasl.SaslClientFactory interface javax.security.sasl.SaslClientFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.sasl.SaslClientFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SaslClientFactoryTests<SUT extends javax.security.sasl.SaslClientFactory>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.security.sasl.SaslClientFactory#createSaslClient(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.util.Map,javax.security.auth.callback.CallbackHandler)
     * public abstract javax.security.sasl.SaslClient
     * javax.security.sasl.SaslClientFactory.createSaslClient(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.util.Map,javax.security.auth.callback.CallbackHandler)
     * throws javax.security.sasl.SaslException}.
     * </p>
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
     * java.lang.String[] javax.security.sasl.SaslClientFactory.getMechanismNames(java.util.Map)}.
     * </p>
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
