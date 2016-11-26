package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreePath;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TreePath} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.TreePathTests}).
 */
@RunWith(J8Unit4.class)
public class TreePathTest
implements TreePathTests<TreePath> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.TreePath]

    @Override
    public TreePath createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.TreePath], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.TreePath]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.TreePath]

}
