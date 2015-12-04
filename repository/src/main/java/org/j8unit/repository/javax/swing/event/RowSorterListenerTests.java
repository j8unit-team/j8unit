package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.RowSorterListener interface javax.swing.event.RowSorterListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.RowSorterListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RowSorterListenerTests<SUT extends javax.swing.event.RowSorterListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.RowSorterListener#sorterChanged(javax.swing.event.RowSorterEvent) public
     * abstract void javax.swing.event.RowSorterListener.sorterChanged(javax.swing.event.RowSorterEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sorterChanged_RowSorterEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
