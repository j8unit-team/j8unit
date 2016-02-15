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
 * non-{@code static} methods) of {@linkplain javax.security.sasl.SaslServer interface javax.security.sasl.SaslServer}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link SaslServerClassTests}.
 * </p>
 *
 * @see javax.security.sasl.SaslServer interface javax.security.sasl.SaslServer (the hereby targeted class-under-test
 *      class)
 * @see SaslServerClassTests SaslServerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SaslServerTests<SUT extends javax.security.sasl.SaslServer>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#getAuthorizationID() public abstract java.lang.String
     * javax.security.sasl.SaslServer.getAuthorizationID()}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#getAuthorizationID() public abstract java.lang.String
     * javax.security.sasl.SaslServer.getAuthorizationID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslServer#getAuthorizationID() public abstract java.lang.String
     *      javax.security.sasl.SaslServer.getAuthorizationID() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.sasl.SaslServer#dispose() public abstract void
     * javax.security.sasl.SaslServer.dispose() throws javax.security.sasl.SaslException}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#dispose() public abstract void
     * javax.security.sasl.SaslServer.dispose() throws javax.security.sasl.SaslException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslServer#dispose() public abstract void javax.security.sasl.SaslServer.dispose()
     *      throws javax.security.sasl.SaslException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#evaluateResponse(byte[]) public abstract byte[]
     * javax.security.sasl.SaslServer.evaluateResponse(byte[]) throws javax.security.sasl.SaslException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslServer#evaluateResponse(byte[]) public abstract byte[]
     *      javax.security.sasl.SaslServer.evaluateResponse(byte[]) throws javax.security.sasl.SaslException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.security.sasl.SaslServer#getMechanismName() public abstract java.lang.String
     * javax.security.sasl.SaslServer.getMechanismName()}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#getMechanismName() public abstract java.lang.String
     * javax.security.sasl.SaslServer.getMechanismName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslServer#getMechanismName() public abstract java.lang.String
     *      javax.security.sasl.SaslServer.getMechanismName() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.sasl.SaslServer#unwrap(byte[], int, int) public abstract byte[]
     * javax.security.sasl.SaslServer.unwrap(byte[],int,int) throws javax.security.sasl.SaslException}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#unwrap(byte[], int, int) public abstract byte[]
     * javax.security.sasl.SaslServer.unwrap(byte[],int,int) throws javax.security.sasl.SaslException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslServer#unwrap(byte[], int, int) public abstract byte[]
     *      javax.security.sasl.SaslServer.unwrap(byte[],int,int) throws javax.security.sasl.SaslException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.security.sasl.SaslServer#getNegotiatedProperty(String) public abstract
     * java.lang.Object javax.security.sasl.SaslServer.getNegotiatedProperty(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#getNegotiatedProperty(String) public abstract
     * java.lang.Object javax.security.sasl.SaslServer.getNegotiatedProperty(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslServer#getNegotiatedProperty(String) public abstract java.lang.Object
     *      javax.security.sasl.SaslServer.getNegotiatedProperty(java.lang.String) (the hereby targeted
     *      method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#isComplete() public abstract boolean
     * javax.security.sasl.SaslServer.isComplete()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslServer#isComplete() public abstract boolean
     *      javax.security.sasl.SaslServer.isComplete() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.sasl.SaslServer#wrap(byte[], int, int) public abstract byte[]
     * javax.security.sasl.SaslServer.wrap(byte[],int,int) throws javax.security.sasl.SaslException}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslServer#wrap(byte[], int, int) public abstract byte[]
     * javax.security.sasl.SaslServer.wrap(byte[],int,int) throws javax.security.sasl.SaslException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslServer#wrap(byte[], int, int) public abstract byte[]
     *      javax.security.sasl.SaslServer.wrap(byte[],int,int) throws javax.security.sasl.SaslException (the hereby
     *      targeted method-under-test)
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
