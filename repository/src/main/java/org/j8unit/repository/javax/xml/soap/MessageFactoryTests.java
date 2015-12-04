package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.soap.MessageFactory class javax.xml.soap.MessageFactory}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.soap.MessageFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MessageFactoryTests<SUT extends javax.xml.soap.MessageFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.MessageFactory#createMessage() public abstract javax.xml.soap.SOAPMessage
     * javax.xml.soap.MessageFactory.createMessage() throws javax.xml.soap.SOAPException}.
     * </p>
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
     * {@link javax.xml.soap.MessageFactory#createMessage(javax.xml.soap.MimeHeaders,java.io.InputStream) public
     * abstract javax.xml.soap.SOAPMessage
     * javax.xml.soap.MessageFactory.createMessage(javax.xml.soap.MimeHeaders,java.io.InputStream) throws
     * java.io.IOException,javax.xml.soap.SOAPException}.
     * </p>
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
