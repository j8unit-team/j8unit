package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.ChangeListener interface
 * javax.swing.event.ChangeListener}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ChangeListenerClassTests}.
 * </p>
 *
 * @see javax.swing.event.ChangeListener interface javax.swing.event.ChangeListener (the hereby targeted
 *      class-under-test class)
 * @see ChangeListenerClassTests ChangeListenerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ChangeListenerTests<SUT extends javax.swing.event.ChangeListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.ChangeListener#stateChanged(javax.swing.event.ChangeEvent) public
     * abstract void javax.swing.event.ChangeListener.stateChanged(javax.swing.event.ChangeEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.ChangeListener#stateChanged(javax.swing.event.ChangeEvent) public
     * abstract void javax.swing.event.ChangeListener.stateChanged(javax.swing.event.ChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.ChangeListener#stateChanged(javax.swing.event.ChangeEvent) public abstract void
     *      javax.swing.event.ChangeListener.stateChanged(javax.swing.event.ChangeEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stateChanged_ChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
