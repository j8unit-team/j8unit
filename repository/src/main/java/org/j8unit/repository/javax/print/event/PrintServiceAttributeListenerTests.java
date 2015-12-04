package org.j8unit.repository.javax.print.event;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.event.PrintServiceAttributeListener interface
 * javax.print.event.PrintServiceAttributeListener}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.event.PrintServiceAttributeListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrintServiceAttributeListenerTests<SUT extends javax.print.event.PrintServiceAttributeListener>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.print.event.PrintServiceAttributeListener#attributeUpdate(javax.print.event.PrintServiceAttributeEvent)
     * public abstract void
     * javax.print.event.PrintServiceAttributeListener.attributeUpdate(javax.print.event.PrintServiceAttributeEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_attributeUpdate_PrintServiceAttributeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
