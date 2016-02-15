package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.event.ActionListener interface java.awt.event.ActionListener}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ActionListenerClassTests}.
 * </p>
 *
 * @see java.awt.event.ActionListener interface java.awt.event.ActionListener (the hereby targeted class-under-test
 *      class)
 * @see ActionListenerClassTests ActionListenerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActionListenerTests<SUT extends java.awt.event.ActionListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent) public abstract
     * void java.awt.event.ActionListener.actionPerformed(java.awt.event.ActionEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent) public abstract
     * void java.awt.event.ActionListener.actionPerformed(java.awt.event.ActionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent) public abstract void
     *      java.awt.event.ActionListener.actionPerformed(java.awt.event.ActionEvent) (the hereby targeted
     *      method-under-test)
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
