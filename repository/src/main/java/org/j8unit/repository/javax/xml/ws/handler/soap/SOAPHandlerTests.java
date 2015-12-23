package org.j8unit.repository.javax.xml.ws.handler.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.handler.soap.SOAPHandler interface
 * javax.xml.ws.handler.soap.SOAPHandler}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.handler.soap.SOAPHandlerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.handler.soap.SOAPHandlerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.handler.soap.SOAPHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPHandlerTests<SUT extends javax.xml.ws.handler.soap.SOAPHandler<T>, T extends javax.xml.ws.handler.soap.SOAPMessageContext>
extends org.j8unit.repository.javax.xml.ws.handler.HandlerTests<SUT, T> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.soap.SOAPHandler#getHeaders() public abstract java.util.Set
     * javax.xml.ws.handler.soap.SOAPHandler.getHeaders()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.handler.soap.SOAPHandler#getHeaders()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHeaders()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
