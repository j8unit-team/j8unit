package org.j8unit.repository.javax.xml.ws.wsaddressing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.wsaddressing.W3CEndpointReference class
 * javax.xml.ws.wsaddressing.W3CEndpointReference}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.wsaddressing.W3CEndpointReferenceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface W3CEndpointReferenceTests<SUT extends javax.xml.ws.wsaddressing.W3CEndpointReference>
extends org.j8unit.repository.javax.xml.ws.EndpointReferenceTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.wsaddressing.W3CEndpointReference#writeTo(javax.xml.transform.Result) public
     * void javax.xml.ws.wsaddressing.W3CEndpointReference.writeTo(javax.xml.transform.Result)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_writeTo_Result()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
