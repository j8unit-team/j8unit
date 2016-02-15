package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.WebServiceContext interface javax.xml.ws.WebServiceContext}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link WebServiceContextClassTests}.
 * </p>
 *
 * @see javax.xml.ws.WebServiceContext interface javax.xml.ws.WebServiceContext (the hereby targeted class-under-test
 *      class)
 * @see WebServiceContextClassTests WebServiceContextClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebServiceContextTests<SUT extends javax.xml.ws.WebServiceContext>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#getUserPrincipal() public abstract java.security.Principal
     * javax.xml.ws.WebServiceContext.getUserPrincipal()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#getUserPrincipal() public abstract java.security.Principal
     * javax.xml.ws.WebServiceContext.getUserPrincipal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceContext#getUserPrincipal() public abstract java.security.Principal
     *      javax.xml.ws.WebServiceContext.getUserPrincipal() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.ws.WebServiceContext#isUserInRole(String) public abstract boolean
     * javax.xml.ws.WebServiceContext.isUserInRole(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#isUserInRole(String) public abstract boolean
     * javax.xml.ws.WebServiceContext.isUserInRole(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceContext#isUserInRole(String) public abstract boolean
     *      javax.xml.ws.WebServiceContext.isUserInRole(java.lang.String) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.ws.WebServiceContext#getEndpointReference(Class, org.w3c.dom.Element...) public
     * abstract <T> T javax.xml.ws.WebServiceContext.getEndpointReference(java.lang.Class<T>,org.w3c.dom.Element...)}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#getEndpointReference(Class, org.w3c.dom.Element...) public
     * abstract javax.xml.ws.EndpointReference
     * javax.xml.ws.WebServiceContext.getEndpointReference(java.lang.Class,org.w3c.dom.Element...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceContext#getEndpointReference(Class, org.w3c.dom.Element...) public abstract
     *      javax.xml.ws.EndpointReference
     *      javax.xml.ws.WebServiceContext.getEndpointReference(java.lang.Class,org.w3c.dom.Element[]) (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#getEndpointReference(org.w3c.dom.Element...) public
     * abstract javax.xml.ws.EndpointReference
     * javax.xml.ws.WebServiceContext.getEndpointReference(org.w3c.dom.Element...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceContext#getEndpointReference(org.w3c.dom.Element...) public abstract
     *      javax.xml.ws.EndpointReference javax.xml.ws.WebServiceContext.getEndpointReference(org.w3c.dom.Element[])
     *      (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.xml.ws.WebServiceContext#getMessageContext() public abstract
     * javax.xml.ws.handler.MessageContext javax.xml.ws.WebServiceContext.getMessageContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.WebServiceContext#getMessageContext() public abstract javax.xml.ws.handler.MessageContext
     *      javax.xml.ws.WebServiceContext.getMessageContext() (the hereby targeted method-under-test)
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
