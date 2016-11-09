package org.j8unit.repository.javax.swing;

import javax.swing.DefaultCellEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultCellEditor} (by simply reusing
 * the J8Unit test interface {@link DefaultCellEditorTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultCellEditorTest
implements DefaultCellEditorTests<DefaultCellEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DefaultCellEditor]

    @Override
    public DefaultCellEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.DefaultCellEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DefaultCellEditor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DefaultCellEditor]

}
