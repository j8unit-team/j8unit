package org.j8unit.repository.java.awt.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.event.HierarchyBoundsListener interface java.awt.event.HierarchyBoundsListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.HierarchyBoundsListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HierarchyBoundsListenerTests<SUT extends java.awt.event.HierarchyBoundsListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.event.HierarchyBoundsListener#ancestorMoved(java.awt.event.HierarchyEvent) public abstract void java.awt.event.HierarchyBoundsListener.ancestorMoved(java.awt.event.HierarchyEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ancestorMoved_HierarchyEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.HierarchyBoundsListener#ancestorResized(java.awt.event.HierarchyEvent) public abstract void java.awt.event.HierarchyBoundsListener.ancestorResized(java.awt.event.HierarchyEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ancestorResized_HierarchyEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
