package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultTreeCellEditorTest
implements org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests<DefaultTreeCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor]

    @Override
    public DefaultTreeCellEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.DefaultTreeCellEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor]

    @RunWith(J8Unit4.class)
    public static class DefaultTextFieldTest
    implements org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.DefaultTextFieldTests<DefaultTextField> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$DefaultTextField]

        @Override
        public DefaultTextField createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.DefaultTreeCellEditor.DefaultTextField], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$DefaultTextField]

    }

    @RunWith(J8Unit4.class)
    public static class EditorContainerTest
    implements org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.EditorContainerTests<EditorContainer> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$EditorContainer]

        @Override
        public EditorContainer createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.DefaultTreeCellEditor.EditorContainer], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$EditorContainer]

    }

}
