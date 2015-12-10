package org.j8unit.repository.javax.swing.tree;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeNodeClassTest
implements org.j8unit.repository.javax.swing.tree.TreeNodeClassTests<javax.swing.tree.TreeNode> {

    @Override
    public Class<javax.swing.tree.TreeNode> createNewSUT() {
        return javax.swing.tree.TreeNode.class;
    }

}
