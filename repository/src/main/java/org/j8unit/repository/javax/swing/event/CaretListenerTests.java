package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.CaretListener interface javax.swing.event.CaretListener}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link CaretListenerClassTests}.
 * </p>
 *
 * @see javax.swing.event.CaretListener interface javax.swing.event.CaretListener (the hereby targeted class-under-test
 *      class)
 * @see CaretListenerClassTests CaretListenerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CaretListenerTests<SUT extends javax.swing.event.CaretListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.CaretListener#caretUpdate(javax.swing.event.CaretEvent) public abstract
     * void javax.swing.event.CaretListener.caretUpdate(javax.swing.event.CaretEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.CaretListener#caretUpdate(javax.swing.event.CaretEvent) public abstract
     * void javax.swing.event.CaretListener.caretUpdate(javax.swing.event.CaretEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.CaretListener#caretUpdate(javax.swing.event.CaretEvent) public abstract void
     *      javax.swing.event.CaretListener.caretUpdate(javax.swing.event.CaretEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_caretUpdate_CaretEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
