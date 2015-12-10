package org.j8unit.repository.javax.swing.tree;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultTreeCellEditorClassTest
implements org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorClassTests<javax.swing.tree.DefaultTreeCellEditor> {

    @RunWith(J8Unit4.class)
    public static class DefaultTextFieldClassTest
    implements
    org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorClassTests.DefaultTextFieldClassTests<javax.swing.tree.DefaultTreeCellEditor.DefaultTextField> {

        @Override
        public Class<javax.swing.tree.DefaultTreeCellEditor.DefaultTextField> createNewSUT() {
            return javax.swing.tree.DefaultTreeCellEditor.DefaultTextField.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class EditorContainerClassTest
    implements
    org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorClassTests.EditorContainerClassTests<javax.swing.tree.DefaultTreeCellEditor.EditorContainer> {

        @Override
        public Class<javax.swing.tree.DefaultTreeCellEditor.EditorContainer> createNewSUT() {
            return javax.swing.tree.DefaultTreeCellEditor.EditorContainer.class;
        }

    }

    @Override
    public Class<javax.swing.tree.DefaultTreeCellEditor> createNewSUT() {
        return javax.swing.tree.DefaultTreeCellEditor.class;
    }

}
