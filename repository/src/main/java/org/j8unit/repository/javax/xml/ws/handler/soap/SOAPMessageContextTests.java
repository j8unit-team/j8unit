package org.j8unit.repository.javax.xml.ws.handler.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.handler.soap.SOAPMessageContext interface
 * javax.xml.ws.handler.soap.SOAPMessageContext}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.handler.soap.SOAPMessageContextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SOAPMessageContextTests<SUT extends javax.xml.ws.handler.soap.SOAPMessageContext>
extends org.j8unit.repository.javax.xml.ws.handler.MessageContextTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.ws.handler.soap.SOAPMessageContext#getHeaders(javax.xml.namespace.QName,javax.xml.bind.JAXBContext,boolean)
     * public abstract java.lang.Object[]
     * javax.xml.ws.handler.soap.SOAPMessageContext.getHeaders(javax.xml.namespace.QName,javax.xml.bind.JAXBContext,boolean)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHeaders_QName_JAXBContext_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.soap.SOAPMessageContext#getMessage() public abstract
     * javax.xml.soap.SOAPMessage javax.xml.ws.handler.soap.SOAPMessageContext.getMessage()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.soap.SOAPMessageContext#setMessage(javax.xml.soap.SOAPMessage) public
     * abstract void javax.xml.ws.handler.soap.SOAPMessageContext.setMessage(javax.xml.soap.SOAPMessage)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMessage_SOAPMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.soap.SOAPMessageContext#getRoles() public abstract java.util.Set
     * javax.xml.ws.handler.soap.SOAPMessageContext.getRoles()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoles()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
