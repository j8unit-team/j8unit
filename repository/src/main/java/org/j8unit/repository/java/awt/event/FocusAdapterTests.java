package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.FocusAdapter class java.awt.event.FocusAdapter}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.FocusAdapterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FocusAdapterTests<SUT extends java.awt.event.FocusAdapter>
extends org.j8unit.repository.java.awt.event.FocusListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.FocusAdapter#focusGained(java.awt.event.FocusEvent) public void
     * java.awt.event.FocusAdapter.focusGained(java.awt.event.FocusEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_focusGained_FocusEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.FocusAdapter#focusLost(java.awt.event.FocusEvent) public void
     * java.awt.event.FocusAdapter.focusLost(java.awt.event.FocusEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_focusLost_FocusEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
