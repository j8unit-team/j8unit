package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.StartTlsRequest class javax.naming.ldap.StartTlsRequest}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link StartTlsRequestClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.StartTlsRequest class javax.naming.ldap.StartTlsRequest (the hereby targeted class-under-test
 *      class)
 * @see StartTlsRequestClassTests StartTlsRequestClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StartTlsRequestTests<SUT extends javax.naming.ldap.StartTlsRequest>
extends ExtendedRequestTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.StartTlsRequest#createExtendedResponse(String, byte[], int, int) public
     * javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.StartTlsRequest.createExtendedResponse(java.lang.String,byte[],int,int) throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.StartTlsRequest#createExtendedResponse(String, byte[], int, int) public
     * javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.StartTlsRequest.createExtendedResponse(java.lang.String,byte[],int,int) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.StartTlsRequest#createExtendedResponse(String, byte[], int, int) public
     *      javax.naming.ldap.ExtendedResponse
     *      javax.naming.ldap.StartTlsRequest.createExtendedResponse(java.lang.String,byte[],int,int) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createExtendedResponse_String_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.StartTlsRequest#getID() public java.lang.String
     * javax.naming.ldap.StartTlsRequest.getID()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.StartTlsRequest#getID() public java.lang.String
     * javax.naming.ldap.StartTlsRequest.getID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.StartTlsRequest#getID() public java.lang.String javax.naming.ldap.StartTlsRequest.getID()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.StartTlsRequest#getEncodedValue() public byte[]
     * javax.naming.ldap.StartTlsRequest.getEncodedValue()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.StartTlsRequest#getEncodedValue() public byte[]
     * javax.naming.ldap.StartTlsRequest.getEncodedValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.StartTlsRequest#getEncodedValue() public byte[]
     *      javax.naming.ldap.StartTlsRequest.getEncodedValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEncodedValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
