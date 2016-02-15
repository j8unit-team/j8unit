package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.soap.MessageFactory class javax.xml.soap.MessageFactory}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MessageFactoryClassTests}.
 * </p>
 *
 * @see javax.xml.soap.MessageFactory class javax.xml.soap.MessageFactory (the hereby targeted class-under-test class)
 * @see MessageFactoryClassTests MessageFactoryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MessageFactoryTests<SUT extends javax.xml.soap.MessageFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.MessageFactory#createMessage() public abstract javax.xml.soap.SOAPMessage
     * javax.xml.soap.MessageFactory.createMessage() throws javax.xml.soap.SOAPException}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.MessageFactory#createMessage() public abstract javax.xml.soap.SOAPMessage
     * javax.xml.soap.MessageFactory.createMessage() throws javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.MessageFactory#createMessage() public abstract javax.xml.soap.SOAPMessage
     *      javax.xml.soap.MessageFactory.createMessage() throws javax.xml.soap.SOAPException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.soap.MessageFactory#createMessage(javax.xml.soap.MimeHeaders, java.io.InputStream) public
     * abstract javax.xml.soap.SOAPMessage
     * javax.xml.soap.MessageFactory.createMessage(javax.xml.soap.MimeHeaders,java.io.InputStream) throws
     * java.io.IOException,javax.xml.soap.SOAPException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.soap.MessageFactory#createMessage(javax.xml.soap.MimeHeaders, java.io.InputStream) public
     * abstract javax.xml.soap.SOAPMessage
     * javax.xml.soap.MessageFactory.createMessage(javax.xml.soap.MimeHeaders,java.io.InputStream) throws
     * java.io.IOException,javax.xml.soap.SOAPException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.MessageFactory#createMessage(javax.xml.soap.MimeHeaders, java.io.InputStream) public abstract
     *      javax.xml.soap.SOAPMessage
     *      javax.xml.soap.MessageFactory.createMessage(javax.xml.soap.MimeHeaders,java.io.InputStream) throws
     *      java.io.IOException,javax.xml.soap.SOAPException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMessage_MimeHeaders_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
