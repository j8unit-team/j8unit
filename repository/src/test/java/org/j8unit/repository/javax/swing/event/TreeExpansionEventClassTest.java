package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeExpansionEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeExpansionEventClassTest
implements org.j8unit.repository.javax.swing.event.TreeExpansionEventClassTests<TreeExpansionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TreeExpansionEvent]

    @Override
    public Class<TreeExpansionEvent> createNewSUT() {
        return TreeExpansionEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.TreeExpansionEvent#TreeExpansionEvent(Object, javax.swing.tree.TreePath) public
     * javax.swing.event.TreeExpansionEvent(java.lang.Object,javax.swing.tree.TreePath)}.
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
    public void create_TreeExpansionEvent_Object_TreePath()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TreeExpansionEvent sut = null; // = new TreeExpansionEvent(Object, javax.swing.tree.TreePath);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TreeExpansionEvent]

}
