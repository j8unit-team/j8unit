package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeCellRenderer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeCellRenderer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.TreeCellRendererClassTests}).
 */

@RunWith(J8Unit4.class)
public class TreeCellRendererClassTest
implements TreeCellRendererClassTests<TreeCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.TreeCellRenderer]

    @Override
    public Class<TreeCellRenderer> createNewSUT() {
        return TreeCellRenderer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.TreeCellRenderer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.TreeCellRenderer]

}
