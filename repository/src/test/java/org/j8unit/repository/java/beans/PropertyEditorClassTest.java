package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyEditorClassTest
implements org.j8unit.repository.java.beans.PropertyEditorClassTests<java.beans.PropertyEditor> {

    @Override
    public Class<java.beans.PropertyEditor> createNewSUT() {
        return java.beans.PropertyEditor.class;
    }

}
