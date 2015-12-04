package org.j8unit.repository.javax.swing.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.event.ListSelectionListener interface javax.swing.event.ListSelectionListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.ListSelectionListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ListSelectionListenerTests<SUT extends javax.swing.event.ListSelectionListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent) public abstract void javax.swing.event.ListSelectionListener.valueChanged(javax.swing.event.ListSelectionEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueChanged_ListSelectionEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
