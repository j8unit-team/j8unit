package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.event.MenuDragMouseEvent class
 * javax.swing.event.MenuDragMouseEvent}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.event.MenuDragMouseEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.event.MenuDragMouseEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.event.MenuDragMouseEvent
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.event.MenuDragMouseEvent#getMenuSelectionManager()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.event.MenuDragMouseEvent#getPath()
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
