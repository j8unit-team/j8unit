package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeNode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeNodeClassTest
implements org.j8unit.repository.javax.swing.tree.TreeNodeClassTests<TreeNode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.TreeNode]

    @Override
    public Class<TreeNode> createNewSUT() {
        return TreeNode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.TreeNode]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.TreeNode]

}
