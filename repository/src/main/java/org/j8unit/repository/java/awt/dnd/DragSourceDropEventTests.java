package org.j8unit.repository.java.awt.dnd;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.dnd.DragSourceDropEvent class java.awt.dnd.DragSourceDropEvent}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link DragSourceDropEventClassTests}.
 * </p>
 *
 * @see java.awt.dnd.DragSourceDropEvent class java.awt.dnd.DragSourceDropEvent (the hereby targeted class-under-test
 *      class)
 * @see DragSourceDropEventClassTests DragSourceDropEventClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DragSourceDropEventTests<SUT extends java.awt.dnd.DragSourceDropEvent>
extends DragSourceEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceDropEvent#getDropAction() public int
     * java.awt.dnd.DragSourceDropEvent.getDropAction()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceDropEvent#getDropAction() public int
     * java.awt.dnd.DragSourceDropEvent.getDropAction()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceDropEvent#getDropAction() public int java.awt.dnd.DragSourceDropEvent.getDropAction()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDropAction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceDropEvent#getDropSuccess() public boolean
     * java.awt.dnd.DragSourceDropEvent.getDropSuccess()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceDropEvent#getDropSuccess() public boolean
     * java.awt.dnd.DragSourceDropEvent.getDropSuccess()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceDropEvent#getDropSuccess() public boolean
     *      java.awt.dnd.DragSourceDropEvent.getDropSuccess() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDropSuccess()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
