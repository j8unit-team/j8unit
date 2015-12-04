package org.j8unit.repository.javax.security.sasl;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.sasl.SaslServer interface javax.security.sasl.SaslServer}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.sasl.SaslServerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SaslServerTests<SUT extends javax.security.sasl.SaslServer>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#dispose() public abstract void
     * javax.security.sasl.SaslServer.dispose() throws javax.security.sasl.SaslException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispose()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#evaluateResponse(byte[]) public abstract byte[]
     * javax.security.sasl.SaslServer.evaluateResponse(byte[]) throws javax.security.sasl.SaslException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluateResponse_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#getAuthorizationID() public abstract java.lang.String
     * javax.security.sasl.SaslServer.getAuthorizationID()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAuthorizationID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#getMechanismName() public abstract java.lang.String
     * javax.security.sasl.SaslServer.getMechanismName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMechanismName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#getNegotiatedProperty(java.lang.String) public abstract
     * java.lang.Object javax.security.sasl.SaslServer.getNegotiatedProperty(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNegotiatedProperty_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#isComplete() public abstract boolean
     * javax.security.sasl.SaslServer.isComplete()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isComplete()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#unwrap(byte[],int,int) public abstract byte[]
     * javax.security.sasl.SaslServer.unwrap(byte[],int,int) throws javax.security.sasl.SaslException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unwrap_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#wrap(byte[],int,int) public abstract byte[]
     * javax.security.sasl.SaslServer.wrap(byte[],int,int) throws javax.security.sasl.SaslException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wrap_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
