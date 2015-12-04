package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.ws.handler.LogicalMessageContext interface
 * javax.xml.ws.handler.LogicalMessageContext}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.handler.LogicalMessageContextClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LogicalMessageContextTests<SUT extends javax.xml.ws.handler.LogicalMessageContext>
extends org.j8unit.repository.javax.xml.ws.handler.MessageContextTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.handler.LogicalMessageContext#getMessage() public abstract
     * javax.xml.ws.LogicalMessage javax.xml.ws.handler.LogicalMessageContext.getMessage()}.
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

}
