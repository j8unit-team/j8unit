package org.j8unit.repository.javax.jws.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.jws.soap.SOAPMessageHandlers interface javax.jws.soap.SOAPMessageHandlers}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.jws.soap.SOAPMessageHandlersClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SOAPMessageHandlersTests<SUT extends javax.jws.soap.SOAPMessageHandlers>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.jws.soap.SOAPMessageHandlers#value() public abstract
     * javax.jws.soap.SOAPMessageHandler[] javax.jws.soap.SOAPMessageHandlers.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
