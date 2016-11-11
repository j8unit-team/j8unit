package org.j8unit.repository.javax.swing;

import javax.swing.AbstractCellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractCellEditor} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.AbstractCellEditorTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractCellEditorTest
implements AbstractCellEditorTests<AbstractCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.AbstractCellEditor]

    @Override
    public AbstractCellEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.AbstractCellEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.AbstractCellEditor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.AbstractCellEditor]

}
