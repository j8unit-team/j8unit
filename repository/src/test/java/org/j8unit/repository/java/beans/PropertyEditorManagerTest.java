package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyEditorManagerTest
implements org.j8unit.repository.java.beans.PropertyEditorManagerTests<java.beans.PropertyEditorManager> {

    @Override
    public java.beans.PropertyEditorManager createNewSUT() {
        return new java.beans.PropertyEditorManager();
    }

}
