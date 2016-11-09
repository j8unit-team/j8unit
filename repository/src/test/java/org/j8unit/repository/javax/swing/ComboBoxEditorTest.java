package org.j8unit.repository.javax.swing;

import javax.swing.ComboBoxEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ComboBoxEditor} (by simply reusing
 * the J8Unit test interface {@link ComboBoxEditorTests}).
 */

@RunWith(J8Unit4.class)
public class ComboBoxEditorTest
implements ComboBoxEditorTests<ComboBoxEditor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ComboBoxEditor]

    @Override
    public ComboBoxEditor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ComboBoxEditor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ComboBoxEditor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ComboBoxEditor]

}
