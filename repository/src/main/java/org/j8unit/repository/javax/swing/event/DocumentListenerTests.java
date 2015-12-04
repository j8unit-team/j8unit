package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.DocumentListener interface javax.swing.event.DocumentListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.DocumentListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocumentListenerTests<SUT extends javax.swing.event.DocumentListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.DocumentListener#removeUpdate(javax.swing.event.DocumentEvent) public
     * abstract void javax.swing.event.DocumentListener.removeUpdate(javax.swing.event.DocumentEvent)}.
     * </p>
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
     * </p>
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
     * </p>
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
