package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.event.ItemListener interface java.awt.event.ItemListener}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ItemListenerClassTests}.
 * </p>
 *
 * @see java.awt.event.ItemListener interface java.awt.event.ItemListener (the hereby targeted class-under-test class)
 * @see ItemListenerClassTests ItemListenerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ItemListenerTests<SUT extends java.awt.event.ItemListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent) public abstract
     * void java.awt.event.ItemListener.itemStateChanged(java.awt.event.ItemEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent) public abstract
     * void java.awt.event.ItemListener.itemStateChanged(java.awt.event.ItemEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent) public abstract void
     *      java.awt.event.ItemListener.itemStateChanged(java.awt.event.ItemEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_itemStateChanged_ItemEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
