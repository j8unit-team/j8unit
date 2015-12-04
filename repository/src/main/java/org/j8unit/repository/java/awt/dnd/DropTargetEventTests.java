package org.j8unit.repository.java.awt.dnd;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.dnd.DropTargetEvent class java.awt.dnd.DropTargetEvent}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.dnd.DropTargetEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DropTargetEventTests<SUT extends java.awt.dnd.DropTargetEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DropTargetEvent#getDropTargetContext() public java.awt.dnd.DropTargetContext
     * java.awt.dnd.DropTargetEvent.getDropTargetContext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDropTargetContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
