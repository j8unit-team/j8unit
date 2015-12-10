package org.j8unit.repository.javax.swing.tree;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultTreeCellEditorTest
implements org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests<javax.swing.tree.DefaultTreeCellEditor> {

    @RunWith(J8Unit4.class)
    public static class DefaultTextFieldTest
    implements
    org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.DefaultTextFieldTests<javax.swing.tree.DefaultTreeCellEditor.DefaultTextField> {

        @Override
        public javax.swing.tree.DefaultTreeCellEditor.DefaultTextField createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.tree.DefaultTreeCellEditor.DefaultTextField] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class EditorContainerTest
    implements org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.EditorContainerTests<javax.swing.tree.DefaultTreeCellEditor.EditorContainer> {

        @Override
        public javax.swing.tree.DefaultTreeCellEditor.EditorContainer createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.tree.DefaultTreeCellEditor.EditorContainer] available.");
        }

    }

    @Override
    public javax.swing.tree.DefaultTreeCellEditor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.tree.DefaultTreeCellEditor] available.");
    }

}
