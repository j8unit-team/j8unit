package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.MutableTreeNode;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MutableTreeNodeTest
implements org.j8unit.repository.javax.swing.tree.MutableTreeNodeTests<MutableTreeNode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.MutableTreeNode]

    @Override
    public MutableTreeNode createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.tree.MutableTreeNode], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.MutableTreeNode]

}
