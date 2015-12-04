package org.j8unit.repository.javax.xml.ws;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.WebServiceContext interface javax.xml.ws.WebServiceContext}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.WebServiceContextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface WebServiceContextTests<SUT extends javax.xml.ws.WebServiceContext>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#getUserPrincipal() public abstract java.security.Principal
     * javax.xml.ws.WebServiceContext.getUserPrincipal()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUserPrincipal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#isUserInRole(java.lang.String) public abstract boolean
     * javax.xml.ws.WebServiceContext.isUserInRole(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isUserInRole_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.WebServiceContext#getEndpointReference(java.lang.Class,org.w3c.dom.Element...) public
     * abstract javax.xml.ws.EndpointReference
     * javax.xml.ws.WebServiceContext.getEndpointReference(java.lang.Class,org.w3c.dom.Element...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEndpointReference_Class_ElementArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#getEndpointReference(org.w3c.dom.Element...) public
     * abstract javax.xml.ws.EndpointReference
     * javax.xml.ws.WebServiceContext.getEndpointReference(org.w3c.dom.Element...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEndpointReference_ElementArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#getMessageContext() public abstract
     * javax.xml.ws.handler.MessageContext javax.xml.ws.WebServiceContext.getMessageContext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMessageContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
