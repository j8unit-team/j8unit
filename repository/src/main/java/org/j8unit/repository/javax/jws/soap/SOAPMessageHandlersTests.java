package org.j8unit.repository.javax.jws.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.jws.soap.SOAPMessageHandlers interface
 * javax.jws.soap.SOAPMessageHandlers}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link SOAPMessageHandlersClassTests}.
 * </p>
 *
 * @see javax.jws.soap.SOAPMessageHandlers interface javax.jws.soap.SOAPMessageHandlers (the hereby targeted
 *      class-under-test class)
 * @see SOAPMessageHandlersClassTests SOAPMessageHandlersClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPMessageHandlersTests<SUT extends javax.jws.soap.SOAPMessageHandlers>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.jws.soap.SOAPMessageHandlers#value() public abstract
     * javax.jws.soap.SOAPMessageHandler[] javax.jws.soap.SOAPMessageHandlers.value()}.
     *
     * <p>
     * Test method for {@link javax.jws.soap.SOAPMessageHandlers#value() public abstract
     * javax.jws.soap.SOAPMessageHandler[] javax.jws.soap.SOAPMessageHandlers.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.jws.soap.SOAPMessageHandlers#value() public abstract javax.jws.soap.SOAPMessageHandler[]
     *      javax.jws.soap.SOAPMessageHandlers.value() (the hereby targeted method-under-test)
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
