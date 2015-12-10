package org.j8unit.repository.javax.swing.tree;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MutableTreeNodeClassTest
implements org.j8unit.repository.javax.swing.tree.MutableTreeNodeClassTests<javax.swing.tree.MutableTreeNode> {

    @Override
    public Class<javax.swing.tree.MutableTreeNode> createNewSUT() {
        return javax.swing.tree.MutableTreeNode.class;
    }

}
