package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.DocumentListener interface
 * javax.swing.event.DocumentListener}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DocumentListenerClassTests}.
 * </p>
 *
 * @see javax.swing.event.DocumentListener interface javax.swing.event.DocumentListener (the hereby targeted
 *      class-under-test class)
 * @see DocumentListenerClassTests DocumentListenerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocumentListenerTests<SUT extends javax.swing.event.DocumentListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.DocumentListener#removeUpdate(javax.swing.event.DocumentEvent) public
     * abstract void javax.swing.event.DocumentListener.removeUpdate(javax.swing.event.DocumentEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.DocumentListener#removeUpdate(javax.swing.event.DocumentEvent) public
     * abstract void javax.swing.event.DocumentListener.removeUpdate(javax.swing.event.DocumentEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.DocumentListener#removeUpdate(javax.swing.event.DocumentEvent) public abstract void
     *      javax.swing.event.DocumentListener.removeUpdate(javax.swing.event.DocumentEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeUpdate_DocumentEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.DocumentListener#insertUpdate(javax.swing.event.DocumentEvent) public
     * abstract void javax.swing.event.DocumentListener.insertUpdate(javax.swing.event.DocumentEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.DocumentListener#insertUpdate(javax.swing.event.DocumentEvent) public
     * abstract void javax.swing.event.DocumentListener.insertUpdate(javax.swing.event.DocumentEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.DocumentListener#insertUpdate(javax.swing.event.DocumentEvent) public abstract void
     *      javax.swing.event.DocumentListener.insertUpdate(javax.swing.event.DocumentEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertUpdate_DocumentEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.DocumentListener#changedUpdate(javax.swing.event.DocumentEvent) public
     * abstract void javax.swing.event.DocumentListener.changedUpdate(javax.swing.event.DocumentEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.DocumentListener#changedUpdate(javax.swing.event.DocumentEvent) public
     * abstract void javax.swing.event.DocumentListener.changedUpdate(javax.swing.event.DocumentEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.DocumentListener#changedUpdate(javax.swing.event.DocumentEvent) public abstract void
     *      javax.swing.event.DocumentListener.changedUpdate(javax.swing.event.DocumentEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_changedUpdate_DocumentEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
