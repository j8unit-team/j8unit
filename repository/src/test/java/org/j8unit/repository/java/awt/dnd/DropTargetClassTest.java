package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DropTarget;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DropTarget} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.dnd.DropTargetClassTests}).
 */

@RunWith(J8Unit4.class)
public class DropTargetClassTest
implements DropTargetClassTests<DropTarget> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DropTarget]

    @Override
    public Class<DropTarget> createNewSUT() {
        return DropTarget.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DropTarget#DropTarget(java.awt.Component, int, java.awt.dnd.DropTargetListener, boolean)
     * public java.awt.dnd.DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener,boolean) throws
     * java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DropTarget_Component_int_DropTargetListener_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DropTarget sut = null; // = new DropTarget(java.awt.Component, int, java.awt.dnd.DropTargetListener,
                                     // boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.dnd.DropTarget#DropTarget() public
     * java.awt.dnd.DropTarget() throws java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DropTarget()
    throws Exception {
        // create new instance
        final DropTarget sut = new DropTarget();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DropTarget#DropTarget(java.awt.Component, java.awt.dnd.DropTargetListener) public
     * java.awt.dnd.DropTarget(java.awt.Component,java.awt.dnd.DropTargetListener) throws java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DropTarget_Component_DropTargetListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DropTarget sut = null; // = new DropTarget(java.awt.Component, java.awt.dnd.DropTargetListener);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DropTarget#DropTarget(java.awt.Component, int, java.awt.dnd.DropTargetListener) public
     * java.awt.dnd.DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener) throws
     * java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DropTarget_Component_int_DropTargetListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DropTarget sut = null; // = new DropTarget(java.awt.Component, int, java.awt.dnd.DropTargetListener);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DropTarget#DropTarget(java.awt.Component, int, java.awt.dnd.DropTargetListener, boolean, java.awt.datatransfer.FlavorMap)
     * public
     * java.awt.dnd.DropTarget(java.awt.Component,int,java.awt.dnd.DropTargetListener,boolean,java.awt.datatransfer.FlavorMap)
     * throws java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DropTarget_Component_int_DropTargetListener_boolean_FlavorMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DropTarget sut = null; // = new DropTarget(java.awt.Component, int, java.awt.dnd.DropTargetListener,
                                     // boolean, java.awt.datatransfer.FlavorMap);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DropTarget]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DropTarget]

}
