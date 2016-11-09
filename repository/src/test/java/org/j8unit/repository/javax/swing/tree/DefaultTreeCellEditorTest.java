package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultTreeCellEditor} (by simply
 * reusing the J8Unit test interface {@link DefaultTreeCellEditorTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultTreeCellEditorTest
implements DefaultTreeCellEditorTests<DefaultTreeCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor]

    @Override
    public DefaultTreeCellEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.DefaultTreeCellEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link EditorContainer} (by simply
     * reusing the J8Unit test interface {@link EditorContainerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class EditorContainerTest
    implements EditorContainerTests<EditorContainer> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$EditorContainer]

        @Override
        public EditorContainer createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.DefaultTreeCellEditor.EditorContainer], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$EditorContainer]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$EditorContainer]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultTextField} (by simply
     * reusing the J8Unit test interface {@link DefaultTextFieldTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DefaultTextFieldTest
    implements DefaultTextFieldTests<DefaultTextField> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$DefaultTextField]

        @Override
        public DefaultTextField createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.DefaultTreeCellEditor.DefaultTextField], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$DefaultTextField]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.DefaultTreeCellEditor$DefaultTextField]

    }

}
