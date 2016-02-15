package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.MenuDragMouseEvent class
 * javax.swing.event.MenuDragMouseEvent}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MenuDragMouseEventClassTests}.
 * </p>
 *
 * @see javax.swing.event.MenuDragMouseEvent class javax.swing.event.MenuDragMouseEvent (the hereby targeted
 *      class-under-test class)
 * @see MenuDragMouseEventClassTests MenuDragMouseEventClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MenuDragMouseEventTests<SUT extends javax.swing.event.MenuDragMouseEvent>
extends org.j8unit.repository.java.awt.event.MouseEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuDragMouseEvent#getMenuSelectionManager() public
     * javax.swing.MenuSelectionManager javax.swing.event.MenuDragMouseEvent.getMenuSelectionManager()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.MenuDragMouseEvent#getMenuSelectionManager() public
     * javax.swing.MenuSelectionManager javax.swing.event.MenuDragMouseEvent.getMenuSelectionManager()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.MenuDragMouseEvent#getMenuSelectionManager() public javax.swing.MenuSelectionManager
     *      javax.swing.event.MenuDragMouseEvent.getMenuSelectionManager() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMenuSelectionManager()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuDragMouseEvent#getPath() public javax.swing.MenuElement[]
     * javax.swing.event.MenuDragMouseEvent.getPath()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.MenuDragMouseEvent#getPath() public javax.swing.MenuElement[]
     * javax.swing.event.MenuDragMouseEvent.getPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.MenuDragMouseEvent#getPath() public javax.swing.MenuElement[]
     *      javax.swing.event.MenuDragMouseEvent.getPath() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPath()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
