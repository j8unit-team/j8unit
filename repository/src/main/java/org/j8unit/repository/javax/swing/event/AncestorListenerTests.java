package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.AncestorListener interface javax.swing.event.AncestorListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.AncestorListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AncestorListenerTests<SUT extends javax.swing.event.AncestorListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.AncestorListener#ancestorAdded(javax.swing.event.AncestorEvent) public
     * abstract void javax.swing.event.AncestorListener.ancestorAdded(javax.swing.event.AncestorEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ancestorAdded_AncestorEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.AncestorListener#ancestorMoved(javax.swing.event.AncestorEvent) public
     * abstract void javax.swing.event.AncestorListener.ancestorMoved(javax.swing.event.AncestorEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ancestorMoved_AncestorEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.AncestorListener#ancestorRemoved(javax.swing.event.AncestorEvent) public
     * abstract void javax.swing.event.AncestorListener.ancestorRemoved(javax.swing.event.AncestorEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ancestorRemoved_AncestorEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
