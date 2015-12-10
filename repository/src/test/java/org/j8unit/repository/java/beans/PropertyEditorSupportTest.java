package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyEditorSupportTest
implements org.j8unit.repository.java.beans.PropertyEditorSupportTests<java.beans.PropertyEditorSupport> {

    @Override
    public java.beans.PropertyEditorSupport createNewSUT() {
        return new java.beans.PropertyEditorSupport();
    }

}
