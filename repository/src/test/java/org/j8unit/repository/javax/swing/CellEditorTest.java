package org.j8unit.repository.javax.swing;

import javax.swing.CellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CellEditor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.CellEditorTests}).
 */

@RunWith(J8Unit4.class)
public class CellEditorTest
implements CellEditorTests<CellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.CellEditor]

    @Override
    public CellEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.CellEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.CellEditor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.CellEditor]

}
