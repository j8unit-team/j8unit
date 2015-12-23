package org.j8unit.repository.javax.security.sasl;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.security.sasl.SaslServerFactory interface
 * javax.security.sasl.SaslServerFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.security.sasl.SaslServerFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.security.sasl.SaslServerFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.security.sasl.SaslServerFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SaslServerFactoryTests<SUT extends javax.security.sasl.SaslServerFactory>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.security.sasl.SaslServerFactory#createSaslServer(java.lang.String, java.lang.String, java.lang.String, java.util.Map, javax.security.auth.callback.CallbackHandler)
     * public abstract javax.security.sasl.SaslServer
     * javax.security.sasl.SaslServerFactory.createSaslServer(java.lang.String,java.lang.String,java.lang.String,java.util.Map,javax.security.auth.callback.CallbackHandler)
     * throws javax.security.sasl.SaslException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.sasl.SaslServerFactory#createSaslServer(java.lang.String, java.lang.String,
     *             java.lang.String, java.util.Map, javax.security.auth.callback.CallbackHandler)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSaslServer_String_String_String_Map_CallbackHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServerFactory#getMechanismNames(java.util.Map) public abstract
     * java.lang.String[] javax.security.sasl.SaslServerFactory.getMechanismNames(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.sasl.SaslServerFactory#getMechanismNames(java.util.Map)
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
