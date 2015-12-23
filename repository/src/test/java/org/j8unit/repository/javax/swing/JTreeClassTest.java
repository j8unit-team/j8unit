package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTreeClassTest
implements org.j8unit.repository.javax.swing.JTreeClassTests<javax.swing.JTree> {

    @Override
    public Class<javax.swing.JTree> createNewSUT() {
        return javax.swing.JTree.class;
    }

    @RunWith(J8Unit4.class)
    public static class DynamicUtilTreeNodeClassTest
    implements org.j8unit.repository.javax.swing.JTreeClassTests.DynamicUtilTreeNodeClassTests<javax.swing.JTree.DynamicUtilTreeNode> {

        @Override
        public Class<javax.swing.JTree.DynamicUtilTreeNode> createNewSUT() {
            return javax.swing.JTree.DynamicUtilTreeNode.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.JTreeClassTests.DropLocationClassTests<javax.swing.JTree.DropLocation> {

        @Override
        public Class<javax.swing.JTree.DropLocation> createNewSUT() {
            return javax.swing.JTree.DropLocation.class;
        }

    }

}
