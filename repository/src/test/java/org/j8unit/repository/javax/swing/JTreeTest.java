package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTreeTest
implements org.j8unit.repository.javax.swing.JTreeTests<javax.swing.JTree> {

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.JTreeTests.DropLocationTests<javax.swing.JTree.DropLocation> {

        @Override
        public javax.swing.JTree.DropLocation createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.JTree.DropLocation] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class DynamicUtilTreeNodeTest
    implements org.j8unit.repository.javax.swing.JTreeTests.DynamicUtilTreeNodeTests<javax.swing.JTree.DynamicUtilTreeNode> {

        @Override
        public javax.swing.JTree.DynamicUtilTreeNode createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.JTree.DynamicUtilTreeNode] available.");
        }

    }

    @Override
    public javax.swing.JTree createNewSUT() {
        return new javax.swing.JTree();
    }

}
