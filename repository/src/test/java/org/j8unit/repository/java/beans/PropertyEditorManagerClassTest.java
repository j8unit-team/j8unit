package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyEditorManagerClassTest
implements org.j8unit.repository.java.beans.PropertyEditorManagerClassTests<java.beans.PropertyEditorManager> {

    @Override
    public Class<java.beans.PropertyEditorManager> createNewSUT() {
        return java.beans.PropertyEditorManager.class;
    }

}
