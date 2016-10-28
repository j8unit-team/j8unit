package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFaultExceptionClassTest
implements org.j8unit.repository.javax.xml.ws.soap.SOAPFaultExceptionClassTests<SOAPFaultException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.soap.SOAPFaultException]

    @Override
    public Class<SOAPFaultException> createNewSUT() {
        return SOAPFaultException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link SOAPFaultException#SOAPFaultException(SOAPFault) public
     * javax.xml.ws.soap.SOAPFaultException(javax.xml.soap.SOAPFault)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_SOAPFaultException_SOAPFault()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SOAPFaultException sut = null; // = new SOAPFaultException(SOAPFault);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.soap.SOAPFaultException]

}
