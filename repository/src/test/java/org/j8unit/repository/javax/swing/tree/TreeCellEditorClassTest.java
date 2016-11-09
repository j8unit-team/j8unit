package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeCellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeCellEditor} (by simply reusing the
 * J8Unit test interface {@link TreeCellEditorClassTests}).
 */

@RunWith(J8Unit4.class)
public class TreeCellEditorClassTest
implements TreeCellEditorClassTests<TreeCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.TreeCellEditor]

    @Override
    public Class<TreeCellEditor> createNewSUT() {
        return TreeCellEditor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.TreeCellEditor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.TreeCellEditor]

}
