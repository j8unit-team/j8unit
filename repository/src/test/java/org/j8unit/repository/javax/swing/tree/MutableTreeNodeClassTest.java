package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.MutableTreeNode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MutableTreeNode} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.MutableTreeNodeClassTests}).
 */

@RunWith(J8Unit4.class)
public class MutableTreeNodeClassTest
implements MutableTreeNodeClassTests<MutableTreeNode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.MutableTreeNode]

    @Override
    public Class<MutableTreeNode> createNewSUT() {
        return MutableTreeNode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.MutableTreeNode]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.MutableTreeNode]

}
