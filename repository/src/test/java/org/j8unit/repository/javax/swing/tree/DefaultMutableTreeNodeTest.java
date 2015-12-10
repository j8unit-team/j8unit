package org.j8unit.repository.javax.swing.tree;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultMutableTreeNodeTest
implements org.j8unit.repository.javax.swing.tree.DefaultMutableTreeNodeTests<javax.swing.tree.DefaultMutableTreeNode> {

    @Override
    public javax.swing.tree.DefaultMutableTreeNode createNewSUT() {
        return new javax.swing.tree.DefaultMutableTreeNode();
    }

}
