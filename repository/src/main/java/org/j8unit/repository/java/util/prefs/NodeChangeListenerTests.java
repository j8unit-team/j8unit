package org.j8unit.repository.java.util.prefs;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.prefs.NodeChangeListener interface java.util.prefs.NodeChangeListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.prefs.NodeChangeListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NodeChangeListenerTests<SUT extends java.util.prefs.NodeChangeListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeListener#childAdded(java.util.prefs.NodeChangeEvent) public
     * abstract void java.util.prefs.NodeChangeListener.childAdded(java.util.prefs.NodeChangeEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_childAdded_NodeChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeListener#childRemoved(java.util.prefs.NodeChangeEvent) public
     * abstract void java.util.prefs.NodeChangeListener.childRemoved(java.util.prefs.NodeChangeEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_childRemoved_NodeChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
