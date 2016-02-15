package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.ListDataListener interface
 * javax.swing.event.ListDataListener}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ListDataListenerClassTests}.
 * </p>
 *
 * @see javax.swing.event.ListDataListener interface javax.swing.event.ListDataListener (the hereby targeted
 *      class-under-test class)
 * @see ListDataListenerClassTests ListDataListenerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListDataListenerTests<SUT extends javax.swing.event.ListDataListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.ListDataListener#intervalRemoved(javax.swing.event.ListDataEvent) public
     * abstract void javax.swing.event.ListDataListener.intervalRemoved(javax.swing.event.ListDataEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.ListDataListener#intervalRemoved(javax.swing.event.ListDataEvent) public
     * abstract void javax.swing.event.ListDataListener.intervalRemoved(javax.swing.event.ListDataEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.ListDataListener#intervalRemoved(javax.swing.event.ListDataEvent) public abstract void
     *      javax.swing.event.ListDataListener.intervalRemoved(javax.swing.event.ListDataEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_intervalRemoved_ListDataEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.ListDataListener#intervalAdded(javax.swing.event.ListDataEvent) public
     * abstract void javax.swing.event.ListDataListener.intervalAdded(javax.swing.event.ListDataEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.ListDataListener#intervalAdded(javax.swing.event.ListDataEvent) public
     * abstract void javax.swing.event.ListDataListener.intervalAdded(javax.swing.event.ListDataEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.ListDataListener#intervalAdded(javax.swing.event.ListDataEvent) public abstract void
     *      javax.swing.event.ListDataListener.intervalAdded(javax.swing.event.ListDataEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_intervalAdded_ListDataEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.ListDataListener#contentsChanged(javax.swing.event.ListDataEvent) public
     * abstract void javax.swing.event.ListDataListener.contentsChanged(javax.swing.event.ListDataEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.ListDataListener#contentsChanged(javax.swing.event.ListDataEvent) public
     * abstract void javax.swing.event.ListDataListener.contentsChanged(javax.swing.event.ListDataEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.ListDataListener#contentsChanged(javax.swing.event.ListDataEvent) public abstract void
     *      javax.swing.event.ListDataListener.contentsChanged(javax.swing.event.ListDataEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contentsChanged_ListDataEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
