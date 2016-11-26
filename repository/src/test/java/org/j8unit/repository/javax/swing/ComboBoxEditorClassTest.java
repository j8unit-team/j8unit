package org.j8unit.repository.javax.swing;

import javax.swing.ComboBoxEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComboBoxEditor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.ComboBoxEditorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ComboBoxEditorClassTest
implements ComboBoxEditorClassTests<ComboBoxEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ComboBoxEditor]

    @Override
    public Class<ComboBoxEditor> createNewSUT() {
        return ComboBoxEditor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ComboBoxEditor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ComboBoxEditor]

}
