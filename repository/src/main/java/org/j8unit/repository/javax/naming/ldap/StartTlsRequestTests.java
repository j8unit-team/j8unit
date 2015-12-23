package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.ldap.StartTlsRequest class
 * javax.naming.ldap.StartTlsRequest}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.ldap.StartTlsRequestTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.ldap.StartTlsRequestClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.ldap.StartTlsRequest
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StartTlsRequestTests<SUT extends javax.naming.ldap.StartTlsRequest>
extends org.j8unit.repository.javax.naming.ldap.ExtendedRequestTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.ldap.StartTlsRequest#createExtendedResponse(java.lang.String, byte[], int, int) public
     * javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.StartTlsRequest.createExtendedResponse(java.lang.String,byte[],int,int) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.ldap.StartTlsRequest#createExtendedResponse(java.lang.String, byte[], int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createExtendedResponse_String_byteArray_int_int()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.ldap.StartTlsRequest#getEncodedValue()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getEncodedValue()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.ldap.StartTlsRequest#getID()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
