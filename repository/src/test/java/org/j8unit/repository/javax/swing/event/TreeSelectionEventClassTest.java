package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeSelectionEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeSelectionEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TreeSelectionEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class TreeSelectionEventClassTest
implements TreeSelectionEventClassTests<TreeSelectionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TreeSelectionEvent]

    @Override
    public Class<TreeSelectionEvent> createNewSUT() {
        return TreeSelectionEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.TreeSelectionEvent#TreeSelectionEvent(Object, javax.swing.tree.TreePath[], boolean[], javax.swing.tree.TreePath, javax.swing.tree.TreePath)
     * public
     * javax.swing.event.TreeSelectionEvent(java.lang.Object,javax.swing.tree.TreePath[],boolean[],javax.swing.tree.TreePath,javax.swing.tree.TreePath)}.
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
    public void create_TreeSelectionEvent_Object_TreePathArray_booleanArray_TreePath_TreePath()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TreeSelectionEvent sut = null; // = new TreeSelectionEvent(Object, javax.swing.tree.TreePath[], boolean[],
                                             // javax.swing.tree.TreePath, javax.swing.tree.TreePath);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.TreeSelectionEvent#TreeSelectionEvent(Object, javax.swing.tree.TreePath, boolean, javax.swing.tree.TreePath, javax.swing.tree.TreePath)
     * public
     * javax.swing.event.TreeSelectionEvent(java.lang.Object,javax.swing.tree.TreePath,boolean,javax.swing.tree.TreePath,javax.swing.tree.TreePath)}.
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
    public void create_TreeSelectionEvent_Object_TreePath_boolean_TreePath_TreePath()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TreeSelectionEvent sut = null; // = new TreeSelectionEvent(Object, javax.swing.tree.TreePath, boolean,
                                             // javax.swing.tree.TreePath, javax.swing.tree.TreePath);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.TreeSelectionEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TreeSelectionEvent]

}
