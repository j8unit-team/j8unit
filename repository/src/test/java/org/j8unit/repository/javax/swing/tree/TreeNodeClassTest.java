package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeNode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeNode} (by simply reusing the J8Unit
 * test interface {@link TreeNodeClassTests}).
 */

@RunWith(J8Unit4.class)
public class TreeNodeClassTest
implements TreeNodeClassTests<TreeNode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.TreeNode]

    @Override
    public Class<TreeNode> createNewSUT() {
        return TreeNode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.TreeNode]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.TreeNode]

}
