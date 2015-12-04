package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.ContainerAdapter class java.awt.event.ContainerAdapter}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.ContainerAdapterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ContainerAdapterTests<SUT extends java.awt.event.ContainerAdapter>
extends org.j8unit.repository.java.awt.event.ContainerListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.ContainerAdapter#componentAdded(java.awt.event.ContainerEvent) public void
     * java.awt.event.ContainerAdapter.componentAdded(java.awt.event.ContainerEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_componentAdded_ContainerEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.ContainerAdapter#componentRemoved(java.awt.event.ContainerEvent) public
     * void java.awt.event.ContainerAdapter.componentRemoved(java.awt.event.ContainerEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_componentRemoved_ContainerEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
