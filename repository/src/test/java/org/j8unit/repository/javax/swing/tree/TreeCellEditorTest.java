package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeCellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeCellEditorTest
implements org.j8unit.repository.javax.swing.tree.TreeCellEditorTests<TreeCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.TreeCellEditor]

    @Override
    public TreeCellEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.tree.TreeCellEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.TreeCellEditor]

}
