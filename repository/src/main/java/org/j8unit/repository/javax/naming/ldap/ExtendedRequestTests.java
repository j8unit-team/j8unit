package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.ExtendedRequest interface
 * javax.naming.ldap.ExtendedRequest}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ExtendedRequestClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.ExtendedRequest interface javax.naming.ldap.ExtendedRequest (the hereby targeted
 *      class-under-test class)
 * @see ExtendedRequestClassTests ExtendedRequestClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExtendedRequestTests<SUT extends javax.naming.ldap.ExtendedRequest>
extends org.j8unit.repository.java.io.SerializableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.ExtendedRequest#getID() public abstract java.lang.String
     * javax.naming.ldap.ExtendedRequest.getID()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.ExtendedRequest#getID() public abstract java.lang.String
     * javax.naming.ldap.ExtendedRequest.getID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.ExtendedRequest#getID() public abstract java.lang.String
     *      javax.naming.ldap.ExtendedRequest.getID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.naming.ldap.ExtendedRequest#createExtendedResponse(String, byte[], int, int) public
     * abstract javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.ExtendedRequest.createExtendedResponse(java.lang.String,byte[],int,int) throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.ExtendedRequest#createExtendedResponse(String, byte[], int, int) public
     * abstract javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.ExtendedRequest.createExtendedResponse(java.lang.String,byte[],int,int) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.ExtendedRequest#createExtendedResponse(String, byte[], int, int) public abstract
     *      javax.naming.ldap.ExtendedResponse
     *      javax.naming.ldap.ExtendedRequest.createExtendedResponse(java.lang.String,byte[],int,int) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.naming.ldap.ExtendedRequest#getEncodedValue() public abstract byte[]
     * javax.naming.ldap.ExtendedRequest.getEncodedValue()}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.ExtendedRequest#getEncodedValue() public abstract byte[]
     * javax.naming.ldap.ExtendedRequest.getEncodedValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.ExtendedRequest#getEncodedValue() public abstract byte[]
     *      javax.naming.ldap.ExtendedRequest.getEncodedValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncodedValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
