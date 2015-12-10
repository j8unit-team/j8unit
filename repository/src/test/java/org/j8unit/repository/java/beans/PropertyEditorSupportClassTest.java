package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyEditorSupportClassTest
implements org.j8unit.repository.java.beans.PropertyEditorSupportClassTests<java.beans.PropertyEditorSupport> {

    @Override
    public Class<java.beans.PropertyEditorSupport> createNewSUT() {
        return java.beans.PropertyEditorSupport.class;
    }

}
