package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeCellRenderer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeCellRenderer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.TreeCellRendererTests}).
 */

@RunWith(J8Unit4.class)
public class TreeCellRendererTest
implements TreeCellRendererTests<TreeCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.TreeCellRenderer]

    @Override
    public TreeCellRenderer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.tree.TreeCellRenderer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.TreeCellRenderer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.TreeCellRenderer]

}
