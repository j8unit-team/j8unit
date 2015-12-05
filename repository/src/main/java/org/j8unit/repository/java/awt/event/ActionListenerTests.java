package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.ActionListener interface java.awt.event.ActionListener}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.ActionListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActionListenerTests<SUT extends java.awt.event.ActionListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent) public abstract
     * void java.awt.event.ActionListener.actionPerformed(java.awt.event.ActionEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_actionPerformed_ActionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}