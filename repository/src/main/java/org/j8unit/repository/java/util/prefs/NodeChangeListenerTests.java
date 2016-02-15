package org.j8unit.repository.java.util.prefs;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.prefs.NodeChangeListener interface
 * java.util.prefs.NodeChangeListener}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link NodeChangeListenerClassTests}.
 * </p>
 *
 * @see java.util.prefs.NodeChangeListener interface java.util.prefs.NodeChangeListener (the hereby targeted
 *      class-under-test class)
 * @see NodeChangeListenerClassTests NodeChangeListenerClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NodeChangeListenerTests<SUT extends java.util.prefs.NodeChangeListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeListener#childAdded(java.util.prefs.NodeChangeEvent) public
     * abstract void java.util.prefs.NodeChangeListener.childAdded(java.util.prefs.NodeChangeEvent)}.
     *
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeListener#childAdded(java.util.prefs.NodeChangeEvent) public
     * abstract void java.util.prefs.NodeChangeListener.childAdded(java.util.prefs.NodeChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.NodeChangeListener#childAdded(java.util.prefs.NodeChangeEvent) public abstract void
     *      java.util.prefs.NodeChangeListener.childAdded(java.util.prefs.NodeChangeEvent) (the hereby targeted
     *      method-under-test)
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
     *
     * <p>
     * Test method for {@link java.util.prefs.NodeChangeListener#childRemoved(java.util.prefs.NodeChangeEvent) public
     * abstract void java.util.prefs.NodeChangeListener.childRemoved(java.util.prefs.NodeChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.NodeChangeListener#childRemoved(java.util.prefs.NodeChangeEvent) public abstract void
     *      java.util.prefs.NodeChangeListener.childRemoved(java.util.prefs.NodeChangeEvent) (the hereby targeted
     *      method-under-test)
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
