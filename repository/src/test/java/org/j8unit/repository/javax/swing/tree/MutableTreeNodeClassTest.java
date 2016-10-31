package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.MutableTreeNode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MutableTreeNodeClassTest
implements org.j8unit.repository.javax.swing.tree.MutableTreeNodeClassTests<MutableTreeNode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.MutableTreeNode]

    @Override
    public Class<MutableTreeNode> createNewSUT() {
        return MutableTreeNode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.MutableTreeNode]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.MutableTreeNode]

}
