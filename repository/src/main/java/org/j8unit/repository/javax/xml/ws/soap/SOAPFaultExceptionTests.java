package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.soap.SOAPFaultException class
 * javax.xml.ws.soap.SOAPFaultException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.soap.SOAPFaultExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.soap.SOAPFaultExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.soap.SOAPFaultException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPFaultExceptionTests<SUT extends javax.xml.ws.soap.SOAPFaultException>
extends org.j8unit.repository.javax.xml.ws.ProtocolExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.soap.SOAPFaultException#getFault() public javax.xml.soap.SOAPFault
     * javax.xml.ws.soap.SOAPFaultException.getFault()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.soap.SOAPFaultException#getFault()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFault()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
