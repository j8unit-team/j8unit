package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.SOAPFaultException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPFaultException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.soap.SOAPFaultExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPFaultExceptionClassTest
implements SOAPFaultExceptionClassTests<SOAPFaultException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.soap.SOAPFaultException]

    @Override
    public Class<SOAPFaultException> createNewSUT() {
        return SOAPFaultException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.soap.SOAPFaultException#SOAPFaultException(javax.xml.soap.SOAPFault) public
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
        final SOAPFaultException sut = null; // = new SOAPFaultException(javax.xml.soap.SOAPFault);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.soap.SOAPFaultException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.soap.SOAPFaultException]

}
