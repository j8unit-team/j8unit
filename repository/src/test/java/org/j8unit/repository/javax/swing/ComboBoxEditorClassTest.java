package org.j8unit.repository.javax.swing;

import javax.swing.ComboBoxEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComboBoxEditorClassTest
implements org.j8unit.repository.javax.swing.ComboBoxEditorClassTests<ComboBoxEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ComboBoxEditor]

    @Override
    public Class<ComboBoxEditor> createNewSUT() {
        return ComboBoxEditor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ComboBoxEditor]

}
