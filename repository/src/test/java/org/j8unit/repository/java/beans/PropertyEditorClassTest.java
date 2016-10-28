package org.j8unit.repository.java.beans;

import java.beans.PropertyEditor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyEditorClassTest
implements org.j8unit.repository.java.beans.PropertyEditorClassTests<PropertyEditor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.PropertyEditor]

    @Override
    public Class<PropertyEditor> createNewSUT() {
        return PropertyEditor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.PropertyEditor]

}
